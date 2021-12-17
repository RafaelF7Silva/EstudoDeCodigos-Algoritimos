package Orientacao_a_objeto01;

public class Aluno  extends Pessoa{
    private String ra;

    public Aluno(String nome, int ano_nascimento, String email, String ra) {
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }
    public String getRa(){
        return this.ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    //Overriding
    public String toString() {
        return super.toString() + "\nR.A.: " + this.ra;
    }

    //Overriding
    public String getNome() {
        return "Aluno: \n" + super.getNome();
    }
}
