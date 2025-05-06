public class Professor2 extends Pessoa2 {
    private String Matriculaprofessor;
    private String diciplina;

    public Professor2(String nome, int idade, String sexo, String cpf, String diciplina, String matriculaprofessor) {
        super (nome, idade, sexo,cpf);
        this.diciplina = diciplina;
        this.Matriculaprofessor = matriculaprofessor;
    }

    public void imprimirDiciplina() {
        System.out.println(diciplina);
    }
    public void apresentarprofessor() {
        System.out.println("sou professor da diciplina de  "+ diciplina +" e tenho a matricula de " + Matriculaprofessor);
    }
    public String getMatriculaprofessor() {
        return Matriculaprofessor;
    }

    public void getDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

}
