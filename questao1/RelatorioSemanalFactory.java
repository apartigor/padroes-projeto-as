public class RelatorioSemanalFactory extends RelatorioFactory {

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
}