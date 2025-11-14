package questao2;

public class CalculadoraPerfilRisco {

    private ModeloPerfilRisco modeloAtual;

    public void setModelo(ModeloPerfilRisco modelo) {
        this.modeloAtual = modelo;
    }

    public String processarPerfil(ContextoInvestidor contexto) {
        if (modeloAtual == null) {
            return "ERRO: Nenhum modelo de risco foi definido.";
        }
        
        return modeloAtual.calcularPerfil(contexto);
    }
}