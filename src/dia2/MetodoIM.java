public class MetodoIM {
    private double Altura;
    private double Peso;

    public MetodoIM( double Altura, double Peso) {
        this.Altura = Altura;
        this.Peso = Peso;
    }
    public double getAltura() {
        return Altura;
    }
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double CalculaIMC(double Altura , double Peso) {
        if (this.Altura <=0 || this.Peso <= 0) {
            System.out.println("Altura invalida");
        }
        double IMC = this.Peso / (this.Altura * this.Altura) ;
        return IMC;
    }

}
