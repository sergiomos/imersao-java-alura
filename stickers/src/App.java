import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {

        // Conexão http
        String url = "https://imdb-api.com/en/Top250Movies/{apiKey}";
        var client = HttpClient.newHttpClient(); 
        var uri = URI.create(url);
        var request = HttpRequest.newBuilder(uri).GET().build();
        var response = client.send(request, BodyHandlers.ofString());
        var body = response.body();
        System.out.println(body);

        // Extrair apenas as infos necessarias


    }
}
