package dia2.Desafio;

public class Caminhao extends Veiculo {
    private float capacidade_carga;


    public Caminhao(String marca, String modelo, int ano, float capacidade_carga) {
        super(marca, modelo, ano);
        this.capacidade_carga = capacidade_carga;
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        if (capacidade_carga < 0 || capacidade_carga > 1000) {
            throw new IllegalArgumentException("Capacidade invalida, deve ser maior que 0 e 1000");
        }
        this.capacidade_carga = capacidade_carga;
    }
}
