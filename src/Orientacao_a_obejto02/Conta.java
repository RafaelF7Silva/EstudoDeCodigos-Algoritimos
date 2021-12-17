package Orientacao_a_obejto02;

    public class Conta {

        private int numero;
        private String cliente;
        private String cpf;
        private int rg;
        public static int contador = 1;

        public Conta(String cliente,String cpf,int rg) {
            this.numero = contador;
            this.cliente = cliente;
            this.cpf = cpf;
            this.rg = rg;
            Conta.contador = Conta.contador + 1;
        }

        public int getNumero() {
            return this.numero;
        }

        public String getCliente() {
            return this.cliente;
        }

        public void setCliente(){
         this.cliente = cliente;
        }

        public String getCPF(){
            return this.cpf;
        }

        public void setCpf(){
            this.cpf = cpf;
        }


        public int getRg(){
            return this.rg;
        }

        public void setRg(){
            this.rg = rg;
        }

       public String toString() {
            return "Nome: " +  this.cliente + "\n Cpf " + this.cpf + "\n rg " + this.rg;
        }

        public static int proximaConta() {
            return Conta.contador;
        }
    }
