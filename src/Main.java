public class Main {
    public static void main(String[] args) {
        Pessoa2 pessoa2 = new Pessoa2("leticia",98,"feminino","45678907654");
        Aluno2 alunu = new Aluno2("23456789Ha", "ads", "Leticioo", 13, "masculino", "34567890765");

        System.out.println(alunu.getNome() + "é maior de idade? " + alunu.maioridade());
        System.out.println("alguma coisa pra ver");
    }
}
