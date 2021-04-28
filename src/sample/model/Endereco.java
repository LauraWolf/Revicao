package sample.model;

/** Classes **/

public class Endereco {
    private String rua;
    private int numero;

    /** Getter e Setter **/

        public String getRua() {
            return rua;
        }
        public void setRua(String rua) {
            this.rua = rua;
        }
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }

    /** ToString **/

        @Override
        public String toString() {
            return "Endereco:" + rua +
                    ", nº: " + numero;
        }
    }

