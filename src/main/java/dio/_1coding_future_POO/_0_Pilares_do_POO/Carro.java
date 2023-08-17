package dio._1coding_future_POO._0_Pilares_do_POO;

public class Carro extends Veiculo{

    public void ligar(){
        conferindoCombustivel();
        conferindoCambio();
        System.out.println("Carro Ligado !!");
    }

    private void conferindoCombustivel(){
        System.out.println("conferindo combustivel");
    }

    private void conferindoCambio(){
        System.out.println("conferindo cambio em P");
    }
}
