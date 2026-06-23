package modelo;
public class Consultorio {
    private String nome;
    private int numero;
    private String corredor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }
    
    //CONSTRUTOR VAZIO
    public Consultorio(){}
    //CONSTRUTOR
    public Consultorio(String nome, int numero, String corredor) {
        this.nome = nome;
        this.numero = numero;
        this.corredor = corredor;
    }
    public String toString(){
        return "\n .... CONSULTÓRIO ...." +
                "\n Nome:" + getNome() +
                "\n Número:" + getNumero() +
                "\n Corredor:" + getCorredor();
    }
}
