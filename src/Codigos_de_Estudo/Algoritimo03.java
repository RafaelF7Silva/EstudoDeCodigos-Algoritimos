package Codigos_de_Estudo;

public class Algoritimo03 {
    public static void main(String[] args){

        // Apresentação forma inversa dos vetores

        int contador = 0;
        int [] vetor ={-5 , -2 ,-10 , 50, 30 , 300 };

        System.out.println("Vetor");

        // enquanto contador menor que vetor.length -1

        while (contador < vetor.length-1) {

            System.out.println(vetor[contador] + "");
            contador++;
        }

       // Para i = vetor.length - 1, enquanto i for maior ou igual a 0 , i --

        for (int i = (vetor.length - 1); i >= 0 ; i--) {
            System.out.println(vetor[i] + "");
        }


    }
}
