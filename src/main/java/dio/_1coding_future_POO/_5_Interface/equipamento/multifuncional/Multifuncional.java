package dio._1coding_future_POO._5_Interface.equipamento.multifuncional;

import dio._1coding_future_POO._5_Interface.equipamento.copiadora.Copiadora;
import dio._1coding_future_POO._5_Interface.equipamento.digitalizadora.Digitalizadora;
import dio._1coding_future_POO._5_Interface.equipamento.impresora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("copiar via eqp. Multifuncional");

    }

    @Override
    public void digitalizar() {
        System.out.println("digitalizar via eqp. Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir via eqp. Multifuncional");
    }
}
