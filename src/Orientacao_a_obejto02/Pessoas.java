package Orientacao_a_obejto02;

public class Pessoas {

    public static void main(String[] args) {


        Conta C1 = new Conta("Suzani Silva","23222323225", 22555423);

        System.out.println(C1);

        System.out.println(C1.getCliente());
        System.out.println("\n");

        Funcionarios F1 = new Funcionarios("Carlos Moreira","Carlos@caixa.com.br", 522311);

        System.out.println(F1);

        System.out.println(F1.getMatricula());
        System.out.println("\n");



    }
}
