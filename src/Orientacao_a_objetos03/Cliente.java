package Orientacao_a_objetos03;

public class Cliente implements Comparable{
        private int idade;
        private String nome;
        private String endereco;

        public Cliente(int idade, String nome, String endereco) {
            this.idade = idade;
            this.nome = nome;
            this.endereco = endereco;
        }

        protected void dizer_oi() {

            System.out.println(this.nome + " estÃ¡ dizendo oi...");
        }

        public String getNome() {
            return this.nome;
        }

        public String getEndeco() {
            return this.endereco;
        }

        @Override
        public String toString() {
            return this.nome;
        }

        @Override
        public int compareTo(Object outro) {
            Cliente aux = (Cliente)outro;
            if(this.idade < aux.idade) {
                return -1;
            }else if(this.idade > aux.idade) {
                return 1;
            }else {
                return 0;
            }

        }
    }



