package com.kleer;

import com.kleer.model.CalculadoraDePrecios;
import com.kleer.model.Libro;
import com.kleer.util.UtilPotter;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
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

            CalculadoraDePrecios calculadoraDePrecios = new CalculadoraDePrecios();

            List<Libro> libros = UtilPotter.convertToLibros(request);

            int total = calculadoraDePrecios.calcular(libros);
            
            model.put("total", total+" USD");
            return new ModelAndView(model, "comprar.wm");
        }, new VelocityTemplateEngine());

    }

    

}
