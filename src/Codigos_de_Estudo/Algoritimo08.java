package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if(k == 1){

            System.out.println("Top 1");

        }else if (k > 1 && k <= 3){

            System.out.println("Top 3");

        }else if (k > 3 && k <= 5){

            System.out.println("Top 5");

        }else if (k > 5 && k <= 10){

            System.out.println("Top 10");

        }else if (k > 10 && k <= 25){

            System.out.println("Top 25");

        }else if (k > 25 && k <= 50){

            System.out.println("Top 50");

        }else if (k > 50 && k <= 100){

            System.out.println("Top 100");

        }



    }


}
