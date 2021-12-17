package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo02 {
    public static void main(String[] args) {

        int contador, limite, resultado;

        contador = 0;
        limite = 10;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        int tabuada = teclado.nextInt();

        do {
            resultado = tabuada * contador;
            System.out.println("Tabuada de " + tabuada);
            contador++;
        }
        while (contador <= limite);
    }

}
