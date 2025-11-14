package questao2;

public class ModeloModerado implements ModeloPerfilRisco {

    @Override
    public String calcularPerfil(ContextoInvestidor contexto) {
        double pontuacao = 0;
        
        if (contexto.getIdade() > 40 && contexto.getIdade() <= 60) {
            pontuacao += 30;
        }
        if (contexto.getRendaMensal() > 5000) {
            pontuacao += 40;
        }
        
        return "Calculo [MODERADO]: Equilibrio risco/retorno. " + 
               contexto + " Pontos: " + pontuacao;
    }
}
