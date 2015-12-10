package com.kleer.model;

import java.util.List;

/**
 * Created by yamitcardenas on 12/10/15.
 */
public class CalculadoraDePrecios {
    
    public static final int PRECIO_LIBRO = 8;
    
    public int calcular(List<Libro> libros) {
        
        int total = 0;
        
        for(Libro libro: libros){
            total += (libro.cantidad * PRECIO_LIBRO);
        }
        
        return total;
    }
}
