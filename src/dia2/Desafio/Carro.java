package dia2.Desafio;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public int getNum_portas() {
        return numPortas;
    }
    public void setNum_portas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void exibir_Iformacoes() {
        super.exibir_Iformacoes();
        System.out.println(" e a quantidade de portas é " + numPortas);
    }

}
