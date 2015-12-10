package com.kleer.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamitcardenas on 12/10/15.
 */
public class CalculadoraDePreciosTest {
    
    @Test
      public void calcularPrecioDeUnlibroSinDescuento(){
        CalculadoraDePrecios calculadoraDePrecios = new CalculadoraDePrecios();
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("libro1", 1));

        int total = calculadoraDePrecios.calcular(libros);

        Assert.assertEquals(8, total);
    }

    @Test
       public void calcularPrecioDeDoslibroSinDescuento(){
        CalculadoraDePrecios calculadoraDePrecios = new CalculadoraDePrecios();
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("libro1", 1));
        libros.add(new Libro("libro2", 1));

        int total = calculadoraDePrecios.calcular(libros);

        Assert.assertEquals(16, total);
    }

    @Test
    public void calcularPrecioDeTreslibroSinDescuento(){
        CalculadoraDePrecios calculadoraDePrecios = new CalculadoraDePrecios();
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("libro1", 2));
        libros.add(new Libro("libro2", 1));

        int total = calculadoraDePrecios.calcular(libros);

        Assert.assertEquals(24, total);
    }

    @Test
    public void calcularPrecioDeCerolibroSinDescuento(){
        CalculadoraDePrecios calculadoraDePrecios = new CalculadoraDePrecios();
        List<Libro> libros = new ArrayList<>();

        int total = calculadoraDePrecios.calcular(libros);

        Assert.assertEquals(0, total);
    }
}
