import java.util.Random;

public class NumreosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int [] numerosAleatorios = new  int [20];

            for (int i = 0; i <  numerosAleatorios.length ; i ++){
                int numero  = random.nextInt(100);
                numerosAleatorios[i] = numero;
            }

        System.out.print("Aleatorios  ");
            for (int numero : numerosAleatorios){
                System.out.print(numero + " ");
            }
        System.out.print("\nAntecessor  ");
        for (int numero : numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }
        System.out.print("\nsucessror  ");
        for (int numero : numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }



    }



}
