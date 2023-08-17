package dio._1coding_future_POO._0_Pilares_do_POO;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("565");
        z400.numeroChassi();
        z400.ligar();

        Veiculo veiculo = jeep;
        veiculo.numeroChassi();
    }
}
