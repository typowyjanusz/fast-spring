package controller;

import model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import repo.TableRepository;


/**
 * Created by Janusz on 2015-12-13.
 */

@Controller

public class PageController {

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

        modelAndView.addObject("greetings","hello world from variable");
        modelAndView.addObject("greetingsArray",new String[] {"hello","world"});

        return modelAndView;
    }



}
