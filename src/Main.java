
public class Main {


    public static void main (String []args) {

        //declarado o objeto cliente1 do tipo Cliente
        Cliente cliente1 = null;

        //instanciado um objeto do tipo cliente
        //e atribuido à cliente1
        cliente1 = new Cliente();
        cliente1.setNome("Jose da Silva");
        cliente1.setCPF("111.222.333-44");

        Cliente cliente2 = null;
        cliente2 = new Cliente();
        cliente2.setNome("Maria Jose");
        cliente2.setCPF("555.666.777-88");

        int i = 10;
        Cliente cliente3 = null;
        //atribuição de valor de objeto
        //é por REFERÊNCIA
        cliente3 = cliente1;

        //atribuição de tipos básicos
        //é por VALOR
        int j = i;


        System.out.println("Nome do cliente 1: "+cliente1.getNome());
        System.out.println("Nome do cliente 2: "+cliente2.getNome());

        cliente3.setNome("Novo Nome de Jose");
        System.out.println("Nome do cliente 1: "+cliente1.getNome());

        ContaCorrente c1 = new ContaCorrente();
        c1.setCliente(cliente1);

        System.out.println("Saldo da Conta c1: "+c1.getSaldo());
        c1.depositar(1600);
        System.out.println("Saldo da Conta c1: "+c1.getSaldo());
        c1.sacar(350.00);
        System.out.println("Saldo da Conta c1: "+c1.getSaldo());
        c1.sacar(2000.00);
        System.out.println("Saldo da Conta c1: "+c1.getSaldo());
    }

}

