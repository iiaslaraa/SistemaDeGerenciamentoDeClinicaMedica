package modelo;
public interface InterCalculaExame {
    Double PERCENTUAL_MEDICO = 0.70;
    Double PERCENTUAL_CLINICA = 0.30;
    Double calcularValorExame();
    Double calcularRepasseMedico();
    Double calcularLucroClinica();
}
