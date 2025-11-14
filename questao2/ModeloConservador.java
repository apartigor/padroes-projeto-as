package questao2;

public class ModeloConservador implements ModeloPerfilRisco {

    @Override
    public String calcularPerfil(ContextoInvestidor contexto) {
        double pontuacao = 0;
        
        if (contexto.getIdade() > 60) {
            pontuacao += 50;
        }
        if (contexto.getPatrimonioInvestido() > 100000) {
            pontuacao += 20;
        }
        
        return "Calculo [CONSERVADOR]: Preservacao de capital. " + 
               contexto + " Pontos: " + pontuacao;
    }
}