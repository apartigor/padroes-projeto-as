public class RelatorioSemanal implements Relatorio {

    @Override
    public void preparar() {
        System.out.println("Relatorio Semanal: Coletando dados dos ultimos 7 dias...");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando Relatorio Semanal: Formato Power BI.");
    }

    @Override
    public String getTipo() {
        return "SEMANAL";
    }
}