package com.kleer;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class Spark {

    public static void main(String[] args) {

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("welcome", "Bienvenido a Flourish y Blotts");
            return new ModelAndView(model, "index.wm");
        }, new VelocityTemplateEngine());

        post("/comprar", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            
            int libro1 = Integer.parseInt(request.queryParams("libro1"));

            int libro2= 0;
            
            if(!request.queryParams("libro2").equals("")) {
                libro2 = Integer.parseInt(request.queryParams("libro2"));
            }
            
            int total = (libro1+libro2)*8;
            
            model.put("total", total+" USD");
            return new ModelAndView(model, "comprar.wm");
        }, new VelocityTemplateEngine());

    }

    

}
