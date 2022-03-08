import java.util.Scanner;

public class Algoritimo11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.println("Informe dois numero");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y){

            if (x < y ){
                System.out.println("Crescente");

            }else {
                System.out.println("Decrecente");
            }
            System.out.println("Informe dois numeros");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
