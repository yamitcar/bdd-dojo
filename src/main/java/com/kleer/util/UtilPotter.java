package com.kleer.util;

import com.kleer.model.Libro;
import spark.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamitcardenas on 12/10/15.
 */
public class UtilPotter {
    public static List<Libro> convertToLibros(Request request) {
        List<Libro> libros = new ArrayList<>();
        for (int index = 1; index<6;index++){
            String lib = "libro"+index;
            
            String param = request.queryParams(lib);
            
            if(param!=null&&!param.equals("")) {
                String value = request.queryParams(lib);
                libros.add(new Libro(lib, Integer.parseInt(value)));
            }
        }
        return libros;
    }
}
