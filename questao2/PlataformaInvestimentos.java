package questao2;

public class PlataformaInvestimentos {

    public static void main(String[] args) {

        ContextoInvestidor cliente1 = new ContextoInvestidor(19000.0, 35, 200000.00);
        CalculadoraPerfilRisco calculadora = new CalculadoraPerfilRisco();

        System.out.println("--- Analise de Risco Dinamica ---");
        System.out.println("Cliente: " + cliente1);

        System.out.println("\n--- MODELO AGRESSIVO ---");
        calculadora.setModelo(new ModeloAgressivo());
        System.out.println(calculadora.processarPerfil(cliente1));

        System.out.println("\n--- MODELO MODERADO ---");
        calculadora.setModelo(new ModeloModerado());
        System.out.println(calculadora.processarPerfil(cliente1));

        System.out.println("\n--- MODELO CONSERVADOR ---");
        calculadora.setModelo(new ModeloConservador());
        System.out.println(calculadora.processarPerfil(cliente1));
    }
}