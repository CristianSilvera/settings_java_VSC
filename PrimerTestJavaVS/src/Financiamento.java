import javax.management.RuntimeErrorException;

public class Financiamento {
    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;

    public Financiamento (Double valorTotal, Double entrada, Integer parcelas) {
        if (entrada < valorTotal * 0.2) {
            throw new RuntimeErrorException(null, "A entrada deve ser pelo menos 20% do valor total");
            
        } else if (parcelas < 6) {
            throw new RuntimeErrorException(null, "O número mínimo de parcelas deve ser 6");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacoes() {
        return (valorTotal - entrada) / parcelas;
    }
}
