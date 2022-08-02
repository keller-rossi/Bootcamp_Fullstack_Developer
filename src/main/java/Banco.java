import lombok.Data;

import java.util.List;

@Data
public class Banco {

    private String nome;
    private List<Conta> contas;


    public void imprimirContas() {

        int contContas = 0;

        System.out.println("*** LISTA DE CONTAS ***");
        System.out.println(String.format("%s", this.getNome()));
        //System.out.println(contas);
        for (Conta iconta: contas) {
            //System.out.println(String.format("AGENCIA: %d", iconta.agencia));
            System.out.println(String.format("CONTA  : %d", iconta.numero));
            System.out.println(String.format("TITULAR: %s", iconta.cliente.getNome()));
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
            contContas++;

        }
        System.out.println(String.format("TOTAL DE %d CONTAS", contContas));
    }


//        System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
//        System.out.println(String.format("AGENCIA: %d", this.agencia));
//        System.out.println(String.format("NUMERO : %d", this.numero));

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public List<Conta> getContas() {
//        return contas;
//    }
//
//    public void setContas(List<Conta> contas) {
//        this.contas = contas;
//    }

}
