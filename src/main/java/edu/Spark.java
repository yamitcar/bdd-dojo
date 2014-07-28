package edu;

import static spark.Spark.get;

public class Spark {

    public static void main(String[] args) {

        get("/",(request, response) -> {
            return "<h1 id=\"welcome\">Bienvenido al ahorcado</h1>";
        });

    }

}
