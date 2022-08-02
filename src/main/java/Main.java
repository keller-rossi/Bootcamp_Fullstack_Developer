import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco bancoXpto = new Banco();

        List<Conta> xc = new ArrayList<>();

        Cliente fulano = new Cliente();
        fulano.setNome("Fulano da Silva");

        Cliente cicrano = new Cliente();
        cicrano.setNome("Cicrano de Souza");

        Cliente jose = new Cliente();
        jose.setNome("Jose das Couves");

        Conta cc = new ContaCorrente(fulano);
        Conta cp = new ContaPoupanca(cicrano);

        ContaCorrente c1 = new ContaCorrente(jose);
        //ContaCorrente c1 = new Conta(jose);

        cc.depositar(100);
        cc.transferir(120, cp);

        c1.depositar(1000);
        c1.transferir(100, cp);
        c1.sacar(10);
        c1.atribuirLimite(1);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
        c1.imprimirExtrato();

        bancoXpto.setNome("BANCO FUNDO DO QUINTAL");

        xc.add(cc);
        xc.add(cp);
        xc.add(c1);

        bancoXpto.setContas(xc);

        bancoXpto.imprimirContas();

    }
}
