package controller;

import javafx.application.Application;
import model.Beer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import repo.TableRepository;


/**
 * Created by Janusz on 2015-12-13.
 */

@Controller

public class PageController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    public TableRepository tableRepository;

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

        log.info("test select all");


        return modelAndView;
    }

    @RequestMapping
    @ResponseBody
    public Beer dbShowSingle(){
        StringBuilder response = new StringBuilder();

        return tableRepository.findOne((long) 1);
    }

    @RequestMapping("/single")
    public ModelAndView single(){
        ModelAndView modelAndView = new ModelAndView("single");

        modelAndView.addObject("greetings",dbShowSingle());

        log.info("test select all");


        return modelAndView;
    }


    @RequestMapping("/ajdi")
    public TableRepository getTableRepository(@PathVariable("id") Long id){
        return (TableRepository) tableRepository.findOne((long) 1);
    }



}
