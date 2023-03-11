public class ex3 {

    public static void main(String[] args) {

        // Valores de faturamento por estado em um array
        double[] valores = { 67836.43, 36678.66, 29229.88, 27165.48, 19849.53 };

        // Calcula o valor total mensal da distribuidora
        double valor_total = 0;
        for (double valor : valores) {
            valor_total += valor;
        }

        // Calcula o percentual de representação de cada estado em relação ao valor total mensal
        for (int i = 0; i < valores.length; i++) {
            double pct = (valores[i] / valor_total) * 100;
            System.out.printf("%s representa %.2f%% do valor total mensal\n", getEstado(i), pct);
        }
    }

    // Retorna o nome do estado a partir do seu índice no array
    private static String getEstado(int indice) {
        switch (indice) {
            case 0:
                return "SP";
            case 1:
                return "RJ";
            case 2:
                return "MG";
            case 3:
                return "ES";
            case 4:
                return "Outros";
            default:
                return "Estado inválido";
        }
    }

}