package dia2.Desafio;


public class Main3 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Chevrolet", "Onix", 2022);
        Veiculo veiculo2 = new Veiculo("Fiat", "Uno", 2020);
        Carro sedan = new Carro("Toyota", "Corolla", 2023, 4);
        Carro esportivo = new Carro("Porsche", "911", 2024, 2);
        Carro hatch = new Carro("Volkswagen", "Golf", 2021, 5);
        Caminhao caminhaoPequeno = new Caminhao("Mercedes", "Atego", 2020, 8.5f);
        Caminhao caminhaoGrande = new Caminhao("Scania", "R500", 2023, 30.0f);
        Caminhao caminhaoMedio = new Caminhao("Ford", "Cargo", 2022, 15.0f);
        Motorista motorista1 = new Motorista("Carlos Oliveira", "987654321");
        Motorista motorista2 = new Motorista("Ana Santos", "123789456");
        Motorista motorista3 = new Motorista("Pedro Costa", "456123789");



        // Operações com caminhões
        caminhaoGrande.exibir_Iformacoes();  // Exibe informações iniciais do caminhão grande
        caminhaoGrande.setcapacidadeCarga(34);  // Altera a capacidade de carga
        caminhaoGrande.exibir_Iformacoes();  // Exibe informações atualizadas

// Operações com carros
        sedan.exibir_Iformacoes();  // Exibe informações do sedan

// Operações com veículos básicos
        veiculo1.acelerar();  // Aumenta a velocidade em 10 km/h
        veiculo1.frear();     // Diminui a velocidade em 10 km/h
        veiculo1.exibir_Iformacoes(); // Mostra informações atualizadas

// Operações com motoristas
        motorista1.atribuirVeiculo(esportivo);  // Atribui o carro esportivo ao motorista1
        motorista1.removerVeiculo(esportivo);           // Remove o veículo do motorista1
        motorista1.dirigirVeiculo(hatch);                  // Tenta dirigir (sem veículo atribuído)
        motorista1.atribuirVeiculo(caminhaoMedio); // Atribui o caminhão médio
        motorista1.dirigirVeiculo(sedan);                  // Dirige o caminhão atribuído

// Adicionando elementos à frota e exibindo
        Frota frota = new Frota();
        frota.adicionarVeiculo(caminhaoPequeno);
        frota.adicionarVeiculo(caminhaoGrande);
        frota.adicionarVeiculo(caminhaoMedio);
        frota.adicionarVeiculo(sedan);
        frota.adicionarVeiculo(esportivo);
        frota.adicionarVeiculo(hatch);
        frota.adicionarVeiculo(veiculo1);
        frota.adicionarVeiculo(veiculo2);
        frota.adicionarMotorista(motorista1);
        frota.adicionarMotorista(motorista2);
        frota.adicionarMotorista(motorista3);

        frota.mostrarTodosVeiculos();  // Exibe todos os veículos da frota









    }
}
