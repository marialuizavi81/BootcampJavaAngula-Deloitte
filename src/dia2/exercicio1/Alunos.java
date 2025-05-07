package dia2.exercicio1;

public class Alunos extends Pessoas {
    private String matricula;
    private String curso;

    public Alunos(String matricula, String curso, String nome, int idade, String sexo, String cpf) {
        super (nome, idade, sexo, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar(){
        System.out.println("tenho Matricula: " + matricula +  " e estou no curso  curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getmatricula() {
        return matricula;
    }

    public String setmatricula(String matricula){
        return this.matricula;
    }


}
