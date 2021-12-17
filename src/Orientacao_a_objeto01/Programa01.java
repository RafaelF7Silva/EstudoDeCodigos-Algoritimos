package Orientacao_a_objeto01;

public class Programa01 {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana luiza", 2011, "ana@gmail.com", "123456");
        System.out.println(a1);

        System.out.println(a1.getEmail());
        System.out.println("\n");

        Aluno a2 = new Aluno("Enzo Henrrique", 2000, "ENZO@gmail.com", "12s4886");
        System.out.println(a2);

        System.out.println(a2.getEmail());
        System.out.println("\n");


        Professor prof1 = new Professor("Marcelo da Silva", 1999, "Marcelo@gmail.com", "ABC987");
        System.out.println(prof1);

        System.out.println(prof1.getEmail());
        System.out.println("\n");

        Professor prof2 = new Professor("Lucia Moreira", 1999, "Lucia@gmail.com", "ABC777");
        System.out.println(prof2);

        System.out.println(prof2.getEmail());
    }
}
