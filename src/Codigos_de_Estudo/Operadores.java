package Codigos_de_Estudo;

public class Operadores {


        public static void main(String[] args) {
            int num1 = 2, num2 = 10, res;
            float res2;


            res = num1 + num2;
            System.out.println("A soma de " + num1 + " + " + num2 + " = " + res);


            res = num1 - num2;
            System.out.println("A subtração de " + num1 + " - " + num2 + " = " + res);


            res = num1 * num2;
            System.out.println("A multiplicação de " + num1 + " * " + num2 + "  =  " + res);


            res = num2 / num1;
            System.out.println("A divisão de " + num2 + " / " + num1 + "  =  " + res);


            res2 = (float)num2 / (float)num1; //cast
            System.out.println("A multiplicação de " + num2 + " / " + num1 + " = " + res2);

            res = num1 % 2;
            System.out.println("O resto da divisão de " + num1 + " por 2  =  " + res);

            res = num2 % 3;
            System.out.println(num2 + " divisivel  por 3 " + res);


        }
    }
