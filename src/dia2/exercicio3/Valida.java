package dia2.exercicio3;

public class Valida {
    private String cpf;

    public Valida(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        if (cpf.length() != 11) {
            System.out.println("CPF invalido");
        } else {
            System.out.println("CPF valido");
            return cpf;
        }

        return "termino da sessao.";
    }

}
