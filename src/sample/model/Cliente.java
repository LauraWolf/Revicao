package sample.model;

/** Classes **/

public class Cliente extends Pessoa {
    private String email;

    /** Getter e Setter **/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome) {
        super(nome);
    }
    public Cliente(String nome, String cpf){
        super(nome, cpf);
    }
    public Cliente(String nome, String cpf, String email){
        super(nome, cpf);
        this.email = email;
    }
}

