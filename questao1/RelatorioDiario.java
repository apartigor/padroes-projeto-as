public class RelatorioDiario implements Relatorio {

    @Override
    public void preparar() {
        System.out.println("Relatorio Diario: Coletando dados das ultimas 24h...");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando Relatorio Diario: Formato PDF simples.");
    }

    @Override
    public String getTipo() {
        return "DIARIO";
    }
}