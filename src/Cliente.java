/*
 * Classe que representa um Cliente no
 * sistema bancário.
 */
public class Cliente {

    private String nome;
    private String CPF;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.err.println("O nome do cliente não pode ser nulo ou vazio");
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

}
