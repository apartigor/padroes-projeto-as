package questao2;

public class ModeloAgressivo implements ModeloPerfilRisco {

    @Override
    public String calcularPerfil(ContextoInvestidor contexto) {
        double pontuacao = 0;
        
        if (contexto.getIdade() < 40) {
            pontuacao += 60;
        }
        if (contexto.getRendaMensal() > 10000) {
            pontuacao += 30;
        }
        
        return "Calculo [AGRESSIVO]: Maximizacao de retorno. " + 
               contexto + " Pontos: " + pontuacao;
    }
}