package questao2;

public class ContextoInvestidor {

    private double rendaMensal;
    private int idade;
    private double patrimonioInvestido;

    public ContextoInvestidor(double rendaMensal, int idade, double patrimonioInvestido) {
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.patrimonioInvestido = patrimonioInvestido;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public int getIdade() {
        return idade;
    }

    public double getPatrimonioInvestido() {
        return patrimonioInvestido;
    }

    @Override
    public String toString() {
        return String.format("[Idade: %d, Renda: R$%.2f, Patrimonio: R$%.2f]",
                             idade, rendaMensal, patrimonioInvestido);
    }
}