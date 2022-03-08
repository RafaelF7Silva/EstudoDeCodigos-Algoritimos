package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,menor;

        System.out.println("Primeiro valor");
        a = sc.nextInt();
        System.out.println("Segundo valor");
        b = sc.nextInt();
        System.out.println("Terceiro valor");
        c = sc.nextInt();

        if (a < b && a < c ) {
            menor = a;
        }
        else if (b < c ){
            menor = b;
        }else {
            menor = c;
        }

        System.out.println("Menor " + menor);


    }


}
