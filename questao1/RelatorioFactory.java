public abstract class RelatorioFactory {

    public abstract Relatorio criarRelatorio();

    public void emitirRelatorioCompleto() {
        Relatorio relatorio = criarRelatorio();
        System.out.println("Iniciando emissao do relatorio tipo: " + relatorio.getTipo());
        relatorio.preparar();
        relatorio.gerar();
        System.out.println("Emissao concluida.");
    }
}