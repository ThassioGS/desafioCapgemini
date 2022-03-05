package application.calculos;

import java.util.Arrays;

public class CalculoMediana {

     public static Integer calcularMediana(int[] array) {

         //verifica se array é nulo ou empty
         if(array == null || array.length == 0){
             return null;
         }

        //ordernar
         int[] arrayOrdenado = Arrays.copyOf(array, array.length);

         Arrays.sort(arrayOrdenado);

        //pegar tamanho do array
        int quantidadeElementos = arrayOrdenado.length;

        //se a quantidade de elementos é par
        if (quantidadeElementos % 2 == 0) {
            int elementosMeio = arrayOrdenado[quantidadeElementos / 2] + arrayOrdenado[quantidadeElementos / 2 - 1];
            // retorna o calculo da média dos valores do meio
            return (elementosMeio) / 2;
        }

        //retorna o elemento do meio
        return arrayOrdenado[arrayOrdenado.length / 2];

    }

}
