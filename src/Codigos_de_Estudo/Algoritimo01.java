package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo01 {

  public static void main(String[] args) {
     
      int numero = 1;

      Scanner teclado = new Scanner(System.in);


      while (numero > 0) {


          System.out.println("Informe um número :");
          int tabuada = teclado.nextInt();


          System.out.println("Tabuada de " + tabuada);

          for (int i = 1; i <= 10; i++) {
              System.out.println(tabuada + "x" + i + "=" + (tabuada * i));
          }


      }




   teclado.close();


  }
  }