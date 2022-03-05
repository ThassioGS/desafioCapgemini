package application.calculos;

public class TextoEncriptografia {

   public static String encriptografarTexto(String texto) {

       //verificar se é nulo ou está vazio
       if (texto == null || texto.isBlank()){
           return "";
       }

       //remover os espaços em branco
       String textoSemEspacos = texto.replaceAll("\\s", "");

       //calcular a raiz e cria o array
       int raiz = (int) Math.ceil(Math.sqrt(textoSemEspacos.length()));
       String[][] textoEmCaracteres = new String[raiz][raiz];

       //converte para matriz
       converterStringParaMatriz(textoEmCaracteres, textoSemEspacos, raiz);

       //retorna convertido para texto novamente
       return converterMatrizParaString(textoEmCaracteres, raiz);

   }

   public static String converterMatrizParaString(String[][] textoEmCaracteres, int raiz){
       StringBuilder textoEncriptografado = new StringBuilder();
       raiz--;
       for (int linha = 0; linha <= raiz; linha++) {
           for (int coluna = 0; coluna <= raiz; coluna++) {
               textoEncriptografado.append(textoEmCaracteres[coluna][linha]);

               if (coluna == raiz)
                   textoEncriptografado.append(" ");

           }
       }

       return String.valueOf(textoEncriptografado);
   }

   public static void converterStringParaMatriz(String[][] textoEmCaracteres, String textoSemEspacos, int raiz){

       int indexCaracter = 0;

       for (int linha = 0; linha < raiz; linha++) {
           for (int coluna = 0; coluna < raiz; coluna++) {
               if (indexCaracter < textoSemEspacos.length()) {
                   textoEmCaracteres[linha][coluna] = String.valueOf(textoSemEspacos.charAt(indexCaracter));
               } else {
                   textoEmCaracteres[linha][coluna] = "";
               }
               indexCaracter++;
           }
       }

   }

}
