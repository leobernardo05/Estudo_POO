
/*
 * Classe que representa uma Conta Corrente
 * no sistema bancário
 */

public class ContaCorrente {

    //atributos
    private String numero;
    private double saldo;
    private Cliente cliente;


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        if (numero !=null &&
                !numero.isEmpty()) {
            /* modifico o atributo de
             * numero, apenas se o parametro
             * numero passar nas regras de
             * validação
             */
            this.numero = numero;
        } else {
            System.err.println("O numero da conta não pode ser nulo ou vazio");
        }
    }


    public double getSaldo() {
        return saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            System.err.println("Cliente da conta não pode ser nulo");
        }
    }

    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        } else {
            System.err.println("O valor a ser deposito precisa ser maior que zero");
        }
    }

    public void sacar (double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.err.println("Saldo insuficiente");
        }
    }


    //metodos


}

