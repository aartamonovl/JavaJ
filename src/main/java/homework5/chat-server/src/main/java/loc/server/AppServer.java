package loc.server;

import java.io.IOException;

public class AppServer {
    public static void main(String[] args) throws IOException {
        loc.server.Server server = new loc.server.Server();
        server.start();
    }
}