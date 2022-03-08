public class Vetor {

//ordem inversa vetor

    public static void main(String[] args) {

        int[] vetor = {0, 5, 15, 50, 8, 4};



        System.out.print("vetor ");
        int contador = 0;
        while (contador < ( vetor.length) ) {
            System.out.print(vetor [contador]  + " ");
            contador++;
        }

        System.out.print("\nvetor ");
        for (int i = (vetor.length-1); i >= 0; i -- ) {

            System.out.print(vetor[i]  +   "  ");

        }
        }
    }
