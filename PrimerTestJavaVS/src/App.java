public class App {
    public static void main(String[] args) {

        double valorTotal = 1000.0;
        double entrada = 300.0;
        int parcelas = 3;

        /* No es correcto que la logica de negocio este en el main */
        // if (entrada < valorTotal * 0.2) {
        //     System.out.println("A entrada deve ser pelo menos 20% do valor total");
        // } else if (parcelas < 6) {
        //     System.out.println("O número mínimo de parcelas deve ser 6");
        //} else {
        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacoes());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
            

    }
}
