package dia2.Desafio;

public class Veiculo {
    protected String marca;  // Alterado de private para protected
    protected String modelo;
    protected int ano;
    protected float velocidade = 0;

        public Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void acelerar() {
            System.out.println("Acelerando a velocidade em mais 10 km/h");
            velocidade = velocidade + 10;
        }
        public void frear() {
            if(velocidade <0 ){
                System.out.println("Velocidade Inválida");
            }else {
                System.out.println("Freando a velocidade para 0 km/h");
                velocidade = 0;
            }

        }

        public void exibir_Iformacoes(){
            //System.out.println("a velocidade esta em " + velocidade + " km/h\n seu Veiculo é da marca " + marca +"\n seu modelo é o "+ modelo +"\n e o ano do veiculo é " + ano  );
            System.out.println("Marca: " + marca + "\nModelo: " + modelo +"\nAno: " + ano +"\nVelocidade atual: " + velocidade + " km/h");
        }

    @Override
    public String toString() {
        return this.getMarca() + " " + this.getModelo();
    }
}


