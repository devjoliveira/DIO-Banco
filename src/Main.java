import banco.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Victor de Oliveira", "42709151834", "2004.oliveira@gmail.com", "11950599679");
        Cliente cliente2 = new Cliente("Rose Oliveira", "24508348712", "2000.rose@uol.com.br", "11982059762");
        Conta cc = new ContaCorrente(cliente1.getNome());
        Conta cp = new ContaPoupanca(cliente2.getNome());

        System.out.println(cc.getTitular());

        cc.depositar(100);
        cc.consultar();

        cc.transferir(50, cp);
        cc.consultar();
        cp.consultar();
    }
}
