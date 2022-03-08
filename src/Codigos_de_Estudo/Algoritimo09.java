package Codigos_de_Estudo;

import java.util.Scanner;

class Algoritimo09{
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);

        int num;

        System.out.println("Informe tabuada");
        int tabuada = scan.nextInt();

        System.out.println(" tabuada" + tabuada);

         for (int i = 0; i <= 10 ; i = i + 1){
             System.out.println(tabuada + "X" + i +"=" + (tabuada *i));



         }
         
         

    }


}
