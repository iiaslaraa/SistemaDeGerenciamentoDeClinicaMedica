package modelo;
public class Paciente extends Pessoa{
    private String dataNascimento;
    private String endereco;
    private Consulta consulta;
    private Exame exame;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
    
    //CONSTRUTOR VAZIO
    public Paciente(){}
    //CONSTRUTOR
    public Paciente(String dataNascimento, String endereco, Consulta consulta, Exame exame, String nome, 
            String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.consulta = consulta;
        this.exame = exame;
    }
    public String toString(){
        return "\n .... PACIENTE ...." +
                "\n Nome:" + getNome() +
                "\n CPF:" + getCpf() +
                "\n Telefone:" + getTelefone()+
                "\n Email:" + getEmail() +
                "\n Data de Nascimento:" + getDataNascimento() +
                "\n Endereço:" + getEndereco();
                //"\n + getConsulta() +
                //"\n" + getExame();
  
  }
}