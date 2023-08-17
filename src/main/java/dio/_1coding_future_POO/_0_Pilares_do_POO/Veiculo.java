package dio._1coding_future_POO._0_Pilares_do_POO;

public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void numeroChassi(){
        System.out.println("o numero do chassi é: " + getChassi());
    }

    public abstract void ligar();
}
