package dia2.Exercicios3;

public class Produto {
    private String nome;
    private String descricao;
    private double Valor;


    public Produto(double valor, String descricao, String nome){
     this.Valor = valor;
     this.descricao = descricao;
     this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido! Deve ser entre 0 e 100.");
        }

        double produto = getValor(); // Valor original do produto
        double desconto = produto * (percentualDesconto / 100); // Calcula o valor do desconto
        double produtoComDesconto = produto - desconto; // Subtrai o desconto

        System.out.printf("Valor original: R$%.2f%n", produto);
        System.out.printf("Desconto (%d%%): R$%.2f%n", (int) percentualDesconto, desconto);
        System.out.printf("Valor com desconto: R$%.2f%n", produtoComDesconto);

        return produtoComDesconto; // Retorna o valor final para uso externo
    }
}
