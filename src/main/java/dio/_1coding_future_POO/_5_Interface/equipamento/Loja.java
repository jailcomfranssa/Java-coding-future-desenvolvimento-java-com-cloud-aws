package dio._1coding_future_POO._5_Interface.equipamento;

import dio._1coding_future_POO._5_Interface.equipamento.copiadora.Copiadora;
import dio._1coding_future_POO._5_Interface.equipamento.digitalizadora.Digitalizadora;
import dio._1coding_future_POO._5_Interface.equipamento.impresora.Impressora;
import dio._1coding_future_POO._5_Interface.equipamento.impresora.Scanner;
import dio._1coding_future_POO._5_Interface.equipamento.multifuncional.Multifuncional;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new Scanner();

        impressora.imprimir();

        Impressora impressora1 = new Multifuncional();
        impressora1.imprimir();

        System.out.println("\n Multifuncional");
        Multifuncional mt = new Multifuncional();
        Impressora impressora2 = mt;
        Digitalizadora digitalizadora = mt;
        Copiadora copiadora = mt;

        impressora2.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
