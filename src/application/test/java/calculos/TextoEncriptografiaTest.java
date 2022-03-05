package calculos;

import org.junit.jupiter.api.Test;
import static application.calculos.TextoEncriptografia.encriptografarTexto;
import static org.junit.jupiter.api.Assertions.*;

class TextoEncriptografiaTest {


    @Test
    public void encriptografar(){

        String textoEntrada = "tenha um bom dia";
        String saidaEsperada = "taoa eum nmd hbi ";

        String resultado = encriptografarTexto(textoEntrada);

        //Verificar se não retornou uma string vazia e que é igual a saida esperada
        assertFalse(resultado.isEmpty());
        assertEquals(saidaEsperada, resultado);

        System.out.println("\nTexto Entrada: " + textoEntrada + "\nTexto encriptografado: " + resultado);
    }

    @Test
    public void encriptografarComApenasUmaLetra(){

        String textoEntrada = "t";
        String saidaEsperada = "t ";

        String resultado = encriptografarTexto(textoEntrada);

        //Verificar se não retornou uma string vazia e que retornou o mesmo caracter de entrada
        assertFalse(resultado.isEmpty());
        assertEquals(saidaEsperada, resultado);

        System.out.println("\nTexto Entrada: " + textoEntrada + "\nTexto encriptografado: " + resultado);
    }

    @Test
    public void encriptografarComNumeros(){

        String textoEntrada = "sou thassio e tenho 23 anos";
        String saidaEsperada = "saeoo ost2s use3 tina hohn ";

        String resultado = encriptografarTexto(textoEntrada);

        //Verificar se não retornou uma string vazia e que é igual a saida esperada
        assertFalse(resultado.isEmpty());
        assertEquals(saidaEsperada, resultado);

        System.out.println("\nTexto Entrada: " + textoEntrada + "\nTexto encriptografado: " + resultado);
    }

    @Test
    public void encriptografarTextoNulo(){

        String textoEntrada = null;
        String resultado = encriptografarTexto(textoEntrada);

        //Verificar se retornou uma string vazia, pois valor de entrada é nulo
        assertTrue(resultado.isEmpty());

        System.out.println("\nTexto Entrada: " + textoEntrada + "\nTexto encriptografado: " + resultado);
    }

    @Test
    public void encriptografarTextoVazio(){

        String textoEntrada = " ";

        String resultado = encriptografarTexto(textoEntrada);

        //Verificar se retornou uma string vazia, pois não há strings de entrada
        assertTrue(resultado.isBlank());

        System.out.println("\nTexto Entrada: " + textoEntrada + "\nTexto encriptografado: " + resultado);
    }

}