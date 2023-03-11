import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ex2{

    public static void main(String[] args) {

        double[] faturamento_mensal = null;
        try {
            // Lê os dados de faturamento mensal de um arquivo JSON
            JSONParser parser = new JSONParser();
            JSONArray json = (JSONArray) parser.parse(new FileReader("faturamento.json"));
            faturamento_mensal = new double[json.size()];
            for (int i = 0; i < json.size(); i++) {
                faturamento_mensal[i] = Double.parseDouble(json.get(i).toString());
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Calcula o menor e o maior valor de faturamento diário no mês
        double menor_valor = Double.MAX_VALUE;
        double maior_valor = Double.MIN_VALUE;
        for (double valor : faturamento_mensal) {
            if (valor < menor_valor) {
                menor_valor = valor;
            }
            if (valor > maior_valor) {
                maior_valor = valor;
            }
        }

        // Calcula a média mensal de faturamento, ignorando os dias sem faturamento
        double soma_faturamento = 0.0;
        int num_dias_com_faturamento = 0;
        for (double valor : faturamento_mensal) {
            if (valor > 0) {
                soma_faturamento += valor;
                num_dias_com_faturamento++;
            }
        }
        double media_mensal = soma_faturamento / num_dias_com_faturamento;

        // Conta o número de dias no mês em que o faturamento diário foi superior à média mensal
        int num_dias_acima_da_media = 0;
        for (double valor : faturamento_mensal) {
            if (valor > media_mensal) {
                num_dias_acima_da_media++;
            }
        }

        // Imprime os resultados
        System.out.println("Menor valor de faturamento diário: " + menor_valor);
        System.out.println("Maior valor de faturamento diário: " + maior_valor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + num_dias_acima_da_media);
    }

}
