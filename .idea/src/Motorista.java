public class Motorista extends Veiculo {
    private String nome;
    private String cnh;
    private String veiculo_atual;

    public Motorista(String nome, String cnh, String veiculo_atual) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo_atual = veiculo_atual;
    }

    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public String getVeiculo_atual() {
        return veiculo_atual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setVeiculo_atual(String veiculo_atual) {
        this.veiculo_atual = veiculo_atual;
    }

    public void AtribuirCarro(){
        System.out.println("Carro atual: " + this.veiculo_atual);
    }

    public void RemoverCarro(){
        System.out.println("Carro removido: " + this.veiculo_atual);

    }

    public void dirigir(){
        System.out.println("Dirigido: " + this.veiculo_atual);
    }

}
