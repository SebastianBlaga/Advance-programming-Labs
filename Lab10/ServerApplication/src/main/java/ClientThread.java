import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {

    private Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;

    }

    public void run() {

        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String request = null;
            while(!request.equals("stop")) {
                request = in.readLine();
                PrintWriter out = new PrintWriter(socket.getOutputStream());

                String response = request;
                System.out.println("Server received the request...");
                out.println(response);
                out.flush();
            }
            if (request.equals("stop")){


                System.out.println("Server stopped");
            }
        } catch (IOException e) {
            System.err.println("Communication error..." + e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}
