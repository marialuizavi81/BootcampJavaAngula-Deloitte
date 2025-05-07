package dia2.exercicio1;


public class Main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas("leticia",98,"feminino","45678907654");
        Alunos alunu = new Alunos("23456789Ha", "ads", "Leticioo", 13, "masculino", "34567890765");

        System.out.println(alunu.getNome() + "é maior de idade? " + alunu.maioridade());
        alunu.estudar();
        pessoas.apresentar();

        //Motorista Ronaldinho = new Motorista();



    }

}
