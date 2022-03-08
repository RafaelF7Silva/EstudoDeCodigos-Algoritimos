package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo07
{

    public static void main(String[] args) {


        // Maior_e_Media


        int numero;
        int maior = 0;
        int contador = 0;
        int soma = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(" Informe  numero:");
            numero = teclado.nextInt();

            soma = soma + numero;
            System.out.println("soma" + soma);

            if (numero > maior) maior = numero;

            contador = contador + 1;


        } while (contador < 5);

        System.out.println("Maior" + maior);
        System.out.println("Media" + (soma/5));

    }
}