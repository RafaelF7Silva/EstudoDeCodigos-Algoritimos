package Orientacao_a_obejto02;

public class Funcionarios {

    private String gerente;
    private int matricula ;
    private String email;

    public Funcionarios (String gerente,String email,int matricula){
        this.gerente = gerente;
        this.email = email;
        this.matricula = matricula;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGerente() {
        return gerente;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "\n Gerente: " + this.gerente + "\n email: " + this.email + "\n Matricula: " + this.matricula;
    }
    }

