public class ContaCorrente extends Conta{

    public double limite = 99;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public double getLimite() {
        return this.limite;
    }


    public void atribuirLimite(double valor){
        this.limite += valor;
    }

    //@Override
    public void imprimirExtrato() {
        System.out.println("*** EXTRATO CONTA CORRENTE ***");
        super.imprimirInfosComuns();
        System.out.println(String.format("LIMITE : %.2f", limite));
        if (limite > 100) {
            System.out.println(String.format("ATENÇAO SR(a) %s", cliente.getNome()));
            System.out.println("VOCE POSSUI UM CRÉDITO PRÉ-APROVADO, CONSULTE SEU GERENTE!");
        }
    }
}
