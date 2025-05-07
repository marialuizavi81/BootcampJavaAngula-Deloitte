public class Pessoa2 {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;


    public Pessoa2(String nome, int idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String comparar(Pessoa2 outraPessoa){
        if(this.idade > outraPessoa.idade){
            return this.nome + " é mais velho ";
        } else if (this.idade < outraPessoa.idade) {
            return this.nome + " é mais novo ";
        }else {
           return this.nome + " teem a mesma idade ";
        }
    }


    public boolean maioridade() {
        if (this.idade > 18) {
            return true;
        }else {
            return false;
        }
    }

    public void apresentar() {
        System.out.println("Ola, meu nome é " + nome + " tenho a idade de"+ idade + " e sexo " + sexo + " e cpf " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    public String getCpf() {
        return cpf;
    }
}
