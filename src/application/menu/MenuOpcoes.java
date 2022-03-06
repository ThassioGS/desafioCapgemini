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
        System.out.println("\nArray de Entrada: "+ Arrays.toString(arrayMediana) +"\nMediana: " + calcularMediana(arrayMediana));

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
        System.out.println();

    }

    public static void opcaoEncriptografarDados(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o texto que deseja encriptografar: ");

        String texto = entrada.nextLine();
        System.out.println("Texto encriptografado: " + encriptografarTexto(texto));
    }

    public static int[] gerarArrayNumeros(){

        Scanner entrada = new Scanner(System.in);
        int quantidade = 0;

        //validar entrada de dados
        do{

            //solicitar o tamanho do array
            System.out.println("Informe a quantidade de numeros para o seu array: ");
            String valorEntrada = entrada.nextLine();

            //validar se usuario informou dado válido e se o tamanho do array é maior que zero
            if(valorEntrada.matches("-?\\d+") && Integer.parseInt(valorEntrada) > 0){
                quantidade = Integer.parseInt(valorEntrada);
            }
            else{
                System.out.println("Opção inválida!");
            }

        }while (quantidade == 0);

        int[] numeros = new int[quantidade];

        //adicionar numeros no array
        for (int i = 0; i < numeros.length;){

            System.out.println("Informe o " + (i+1) + "º numero: ");
            String valorEntrada = entrada.nextLine();

            //validar entrada de dados
            if(!valorEntrada.matches("-?\\d+")){
                System.out.println("Opção inválida!");
            }
            else{
                numeros[i] = Integer.parseInt(valorEntrada);
                i++;
            }
        }
        return numeros;
    }

    public static void carregarMenuOpcoes(){

        Scanner entrada = new Scanner(System.in);

        do{
            menu();
            String opcao = entrada.nextLine();

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
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }
}