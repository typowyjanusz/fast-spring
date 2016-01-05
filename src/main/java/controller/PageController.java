package controller;

import javafx.application.Application;
import model.Beer;

import model.Task;
import model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import repo.GunwoRepository;
import repo.TableRepository;

import javax.validation.Valid;


/**
 * Created by Janusz on 2015-12-13.
 */


@Controller
public class PageController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);



    @Autowired
    public TableRepository tableRepository;
    @Autowired
    public GunwoRepository gunwoRepository;


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

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("greetings",dbShowMethod());

        return modelAndView;
    }

    @RequestMapping(value = "/single", method = RequestMethod.GET)
    public String showSingle(Beer beer){
        return showSingle(tableRepository.findOne((long) 6));
    }


    @RequestMapping("/db3")
    @ResponseBody
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
        response.append("<br>Tasks with ID 2:<br>");
        for(Task i: gunwoRepository.findByIdn(2)) {
            response.append(i).append("<br>");
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
/*
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String showForm(Users users){
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String checkPersonInfo(@Valid Users users,BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "form";
        }

        return "redirect:/results";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TableRepository getTableRepository(@PathVariable("id") Long id){
        return (TableRepository) tableRepository.findOne(id);
    }

*/
}
