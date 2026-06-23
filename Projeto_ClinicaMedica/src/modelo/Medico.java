package modelo;
public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Consulta consulta;
    private Consultorio consultorio;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    //CONSTRUTOR VAZIO
    public Medico(){}
    //CONSTRUTOR
    public Medico(String crm, String especialidade, Consulta consulta, Consultorio consultorio, 
            String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.crm = crm;
        this.especialidade = especialidade;
        this.consulta = consulta;
        this.consultorio = consultorio;
    }
    public String toString(){
        return "\n .... MÉDICO ...." +
                "\n Nome:" + getNome() +
                "\n CPF:" + getCpf() +
                "\n Telefone:" + getTelefone()+
                "\n Email:" + getEmail() +
                "\n CRM:" + getCrm() +
                "\n Especialidade:" + getEspecialidade();
                //"\n" + getConsulta() +
                //"\n" + getConsultorio();
    }
}
