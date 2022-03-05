package application.calculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculoDistancia {

    public static List<int[]> calcularDistanciaEntreNumeros(int[] array, int distancia){

        //verifica se array é nulo ou empty
        if(array == null || array.length == 0){
            return Collections.emptyList();
        }

        List<int[]> valoresEncontrados = new ArrayList<>();

        //copiar array de origem
        int[] arrayDistancia = Arrays.copyOf(array, array.length);


        //percorrer array
        for (int numeroAtual : arrayDistancia) {
            int numeroDistancia = numeroAtual + distancia;

            //verificar se foi encontrado um numero com a distancia informada no array
            if (Arrays.stream(arrayDistancia).anyMatch(valor -> valor == numeroDistancia)) {
                valoresEncontrados.add(new int[]{numeroAtual, numeroDistancia});
            }
        }
        return valoresEncontrados;
    }

}
