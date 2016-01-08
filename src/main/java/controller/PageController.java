package controller;

import javafx.application.Application;
import model.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import repo.ContentRepository;
import repo.GunwoRepository;
import repo.TableRepository;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.validation.Valid;


/**
 * Created by Janusz on 2015-12-13.
 */


@Controller
public class PageController extends WebMvcConfigurerAdapter{

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    public TableRepository tableRepository;
    @Autowired
    public GunwoRepository gunwoRepository;
    @Autowired
    public ContentRepository contentRepository;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registerForm(Model model) {
        User user = new User();
        user.setUname("uname");
        user.setUpass("upass");
        user.setUrepass("urepass");
        model.addAttribute("user", new User());
        return "user";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerSubmit(@ModelAttribute("user") User user) {
        System.out.print(user.getUname() + " " + user.getUpass());
        return null;
    }

    @RequestMapping("/db")
    @ResponseBody
    public String dbShowMethod(){
        StringBuilder response = new StringBuilder();

        Beer table = new Beer()
                .withName("piwo")
                .withAbv(9.2);
        tableRepository.save(table);

        for (Beer i: tableRepository.findAll()){
            response.append(i).append("<br>");
        }
        return response.toString();
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("greetings",dbShowMethod());
        modelAndView.addObject("content2",testMethod2());

        return modelAndView;
    }

    public String testMethod2() {
        StringBuilder response = new StringBuilder();
/*
        response.append("Tasks with done set to true:<br>");
        for(Task i: gunwoRepository.findByDone(true)) {
            response.append(i).append("<br>");
        }

        response.append("Tasks with done set to false:<br>");
        for(Task i: gunwoRepository.findByDone(false)) {
            response.append(i).append("<br>");
        }
*/
        response.append("Treść ");
        for(Task i: gunwoRepository.findByIdn(2)) {
            response.append(i).append("");
        }

        return response.toString();
    }

    @RequestMapping("/db2")
    public ModelAndView db2(){
        ModelAndView modelAndView = new ModelAndView("db2");

        modelAndView.addObject("content",testMethod2());

        return modelAndView;
    }

    @RequestMapping("/logged")
    public ModelAndView logged(){
        ModelAndView modelAndView = new ModelAndView("logged");

        modelAndView.addObject("info","Tresc dla zalogowanego");
        return modelAndView;
    }

}
