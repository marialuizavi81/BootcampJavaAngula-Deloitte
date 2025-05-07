package dia2.Exercicios2;

public class MetodoIMC{
    private double peso;
    private double altura;

    public MetodoIMC(){

    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0 || peso > 500) {
            throw new IllegalArgumentException("Peso inválido! Deve ser entre 0 e 500 kg.");
        }
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 || altura > 3){
            throw  new IllegalArgumentException("Altura invalida! deve ser entre 0 e 3M");
        }
        this.altura = altura;
    }
    public void calculaIMC(double peso, double altura) { // Retorno 'void'
        double imc = peso / (altura * altura);
        imc = Math.round(imc * 10) / 10.0;

        String classificacao;
        if (imc < 18.5) {
            classificacao = "MAGREZA (Abaixo de 18.5)";
        } else if (imc < 25) {
            classificacao = "NORMAL (18.5 a 24.9)";
        } else if (imc < 30) {
            classificacao = "SOBREPESO (25 a 29.9)";
        } else if (imc < 40) {
            classificacao = "OBESIDADE (30 a 39.9)";
        } else {
            classificacao = "OBESIDADE GRAVE (Acima de 40)";
        }

        System.out.printf("IMC: %.1f - %s%n", imc, classificacao); // Imprime diretamente
    }
}
