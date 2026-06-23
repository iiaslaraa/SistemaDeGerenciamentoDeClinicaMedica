package modelo;
public class Exame implements InterCalculaExame{
    private int idExame;
    private String tipoExame;
    private String resultado;
    private Double valor;

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    //CONSTRUTOR VAZIO
    public Exame(){}
    //CONSTRUTOR
    public Exame(int idExame, String tipoExame, String resultado, Double valor) {
        this.idExame = idExame;
        this.tipoExame = tipoExame;
        this.resultado = resultado;
        this.valor = valor;
    }
    public Double calcularValorExame(){
        return (valor);
    }
    public Double calcularRepasseMedico(){
        return (valor * PERCENTUAL_MEDICO);
    }
    public Double calcularLucroClinica(){
        return (valor * PERCENTUAL_CLINICA);
    }
    public String toString(){
        return "\n ..... EXAME ....." +
                "\n Identificação:" + getIdExame() +
                "\n Tipo:" + getTipoExame() +
                "\n Resultado:" + getResultado() +
                "\n Valor:" + getValor() +
                "\n ...................................." +
                "\n Valor do Exame: " + calcularValorExame() +
                "\n Repasse Médico: " + calcularRepasseMedico() +
                "\n Lucro da Clínica: " + calcularLucroClinica();
    }
}