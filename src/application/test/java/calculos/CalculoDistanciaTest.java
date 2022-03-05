package calculos;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static application.calculos.CalculoDistancia.calcularDistanciaEntreNumeros;
import static org.junit.jupiter.api.Assertions.*;

class CalculoDistanciaTest {

    @Test
    public void calcularDistancia(){

        int[] arrayDistancia = { 1, 5, 3, 4, 2 };
        int distanciaEntreNumeros = 2;

        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        //Verificar se ao passar um array ele não retornará vazio e retornará os pares encontrados
        assertFalse(resultado.isEmpty());
        assertEquals(3, resultado.size());

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }

    @Test
    public void calcularDistanciaNumerosNegativos(){

        int[] arrayDistancia = { -1, -5, -3, -4, -2 };
        int distanciaEntreNumeros = 2;

        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        //Verificar se ao passar um array com numeros negativos ele não retornará vazio e retornará os pares encontrados
        assertFalse(resultado.isEmpty());
        assertEquals(3, resultado.size());

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }

    @Test
    public void calcularDistanciaNaoEncontrarValores(){

        int[] arrayDistancia = { 1, 5, 3, 4, 2 };
        int distanciaEntreNumeros = 7;

        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        //Verificar se ao passar um valor de distancia que não haverá pares, ele retornara vazio
        assertTrue(resultado.isEmpty());

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }

    @Test
    public void calcularDistanciaArrayVazio(){

        int[] arrayDistancia = {};
        int distanciaEntreNumeros = 2;

        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        //Verificar se ao passar um array vazio ele retornará vazio
        assertTrue(resultado.isEmpty());

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }

    @Test
    public void calcularDistanciaArrayNulo(){

        int[] arrayDistancia = null;
        int distanciaEntreNumeros = 2;

        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        //Verificar se ao passar um array nulo ele retornara vazio
        assertTrue(resultado.isEmpty());

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }


}