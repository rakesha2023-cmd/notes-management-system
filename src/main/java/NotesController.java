import com.sun.net.httpserver.*;
import java.io.*;
import java.net.InetSocketAddress;

public class NotesController {

    public static void main(String[] args) throws Exception {
        NotesService service = new NotesService();

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/notes", exchange -> {
            String response = "Notes API Running";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.start();
        System.out.println("Server started on port 8080");
    }
}