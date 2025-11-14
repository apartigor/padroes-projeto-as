public class SistemaLogistica {

    public static void main(String[] args) {

        System.out.println("\n--- GERANDO RELATORIO DIARIO ---");
        RelatorioFactory factoryDiario = new RelatorioDiarioFactory();
        factoryDiario.emitirRelatorioCompleto();

        System.out.println("\n--- GERANDO RELATORIO SEMANAL ---");
        RelatorioFactory factorySemanal = new RelatorioSemanalFactory();
        factorySemanal.emitirRelatorioCompleto();
    }
}