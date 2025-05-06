public class Aluno2 extends Pessoa2 {
    private String matricula;
    private String curso;

    public Aluno2(String matricula, String curso, String nome, int idade, String sexo, String cpf) {
        super(nome, idade, sexo, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar(){
        System.out.println("tenho Matricula: " + matricula +  " e estou no curso  curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public String getmatricula() {
        return matricula;
    }


}
