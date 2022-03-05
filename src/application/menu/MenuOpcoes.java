package application.menu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static application.calculos.CalculoDistancia.calcularDistanciaEntreNumeros;
import static application.calculos.CalculoMediana.calcularMediana;
import static application.calculos.TextoEncriptografia.encriptografarTexto;

public class MenuOpcoes {

    public static void menu(){
        System.out.println("\n\tDesafio Capgemini");
        System.out.println("0. Fim");
        System.out.println("1. Calcular Mediana");
        System.out.println("2. Calcular a Distancia entre Numeros");
        System.out.println("3. Encriptografar dados");
        System.out.println("Opcao: ");
    }

    public static void opcaoCalcularMediana(){

        //gera o array com os numeros
        int[] arrayMediana = gerarArrayNumeros();

        //calcula a mediana
        System.out.print("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + calcularMediana(arrayMediana));
    }

    public static void opcaoCalcularDistancia(){

        //gera o array com os numeros
        int[] arrayDistancia = gerarArrayNumeros();

        //solicitar a distancia entre os numeros
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a distancia entre os numeros: ");
        int distanciaEntreNumeros = entrada.nextInt();

        //calcula a distancia
        List<int[]> resultado = calcularDistanciaEntreNumeros(arrayDistancia, distanciaEntreNumeros);

        System.out.println("\nArray de Entrada: " + Arrays.toString(arrayDistancia) + "\nDistancia entre Numeros: " + distanciaEntreNumeros);
        System.out.print("Pares encontrados: ");
        resultado.forEach(par -> System.out.print(Arrays.toString(par) + " "));

    }

    public static void opcaoEncriptografarDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o texto que deseja encriptografar: ");

        String texto = entrada.nextLine();
        System.out.println(encriptografarTexto(texto));
    }


    public static int[] gerarArrayNumeros(){

        Scanner entrada = new Scanner(System.in);

        //solicitar o tamanho do array
        System.out.println("Informe a quantidade de numeros para o seu array: ");
        int quantidade = entrada.nextInt();

        int[] numeros = new int[quantidade];

        //adicionar numeros no array
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Informe o " + (i+1) + "º numero: ");
            numeros[i] = entrada.nextInt();
        }

        return numeros;
    }


    public static void carregarMenuOpcoes(){
        String opcao;
        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    opcaoCalcularMediana();
                    break;

                case "2":
                    opcaoCalcularDistancia();
                    break;

                case "3":
                    opcaoEncriptografarDados();
                    break;

                case "0": return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != "0");
    }

}
