package Codigos_de_Estudo;

public class TryCatch {
    //Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que pode acarretar em um problema.
    // Utilizamos o catch para capturar o erro e com isso oferecer ao usuÃ¡rio do sistema uma mensagem adequada sem que o sistema quebre.


        public static void main(String[] args) {
            int numeros[] = new int[5];//0..4 -> 0, 1, 2, 3, 4 -> n - 1

            for(int i = 0; i < numeros.length; i++) {
                numeros[i] = i + 3 * 2;
            }

            for(int i = 0; i <= numeros.length; i++) {
                try { //Tente fazer isso
                    System.out.println(numeros[i]);
                }catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("VocÃª está tentando acessar uma posição do array que não existe.");
                }finally {
                    System.out.println("Continua o processo...");
                }
            }
        }
    }
