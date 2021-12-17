package Codigos_de_Estudo;

import java.util.Scanner;

public class Algoritimo04 {

        public static void main(String[] args) {
            int idade;
            String nome;
            Scanner teclado = new Scanner(System.in);

            //variÃ¡vel de controle; condição de parada; forma de incremento
            //i++ -> i = i + 1
            for(int i = 0; i < 3; i++) {

                System.out.println("Informe seu nome: ");
                nome = teclado.nextLine();

                System.out.println("Informe sua idade: ");
                //idade = teclado.nextInt(); // Bug
                idade = Integer.parseInt(teclado.nextLine());

                // Se idade maior que 0
                if(idade > 0) {
                   System.out.println(nome + " tem " + idade + " anos");
                }
            }

            teclado.close();

        }

    }
