package dia2.Desafio;

public class Caminhao extends Veiculo {
    private float capacidadeCarga;


    public Caminhao(String marca, String modelo, int ano, float capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getcapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setcapacidadeCarga(float capacidadeCarga) {
        if (capacidadeCarga < 0 || capacidadeCarga > 1000) {
            throw new IllegalArgumentException("Capacidade invalida, deve ser maior que 0 e 1000");
        }
        this.capacidadeCarga = capacidadeCarga;
    }
        @Override
        public void exibir_Iformacoes() {
            super.exibir_Iformacoes();
            System.out.println("o caminhao tem capacidade de "+ getcapacidadeCarga() + " em toneladas");
        }

}

