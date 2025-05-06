public class Valida {
    private String cpf;

    public Valida(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void validacpfManual() {
        if(cpf.length() != 11) {
            System.out.println("CPF invalido");
        }else {
            System.out.println("CPF valido");
        }

    }
}
