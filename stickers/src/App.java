import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Conexão http
        String url = "https://api.mocki.io/v2/549a5d8b";
        var uri = URI.create(url);
        var client = HttpClient.newHttpClient(); 
        var request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        var body = response.body();
        System.out.println(body);

        // Extrair apenas as infos necessarias
        var jsonParser = new JsonParser();
        List<Map<String, String>> listaDeFilms = jsonParser.parse(body);

    }
}
