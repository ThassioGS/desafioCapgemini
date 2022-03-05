package calculos;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static application.calculos.CalculoMediana.calcularMediana;
import static org.junit.jupiter.api.Assertions.*;

class CalculoMedianaTest {

    @Test
    public void calcularMedianaArrayNumerosImpares(){

        int[] arrayMediana = {9, 2, 1, 4, 6};

        Integer resultado = calcularMediana(arrayMediana);

        //Verificar se ao passar o array ele ordenará e retornará o valor do meio do array
        assertEquals(4, resultado);

        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + resultado);

    }

    @Test
    public void calcularMedianaArrayNumerosPares(){

        int[] arrayMediana = {7, 8, 3, 1};

        Integer resultado = calcularMediana(arrayMediana);

        //Verificar se ao passar o array ele ordenará e retornará o valor da media entre os dois valores do meio do array
        assertEquals(5, resultado);

        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + resultado);
    }

    @Test
    public void calcularMedianaArraySomenteUmValor(){

        int[] arrayMediana = {8};

        Integer resultado = calcularMediana(arrayMediana);

        //Verificar se ao passar o array ele ordenará o mesmo valor
        assertEquals(8, resultado);

        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + resultado);
    }

    @Test
    public void calcularMedianaArrayVazio(){

        int[] arrayMediana = {};

        //Verificar se ao passar um array vazio ele retornara nulo
        assertNull(calcularMediana(arrayMediana));

        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + null);
    }

    @Test
    public void calcularMedianaArrayNulo(){

        int[] arrayMediana = null;

        //Verificar se ao passar um array nulo ele retornara nulo
        assertNull(calcularMediana(arrayMediana));

        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + null);
    }

}