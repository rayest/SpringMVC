package cn.rayest.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Rayest on 2016/8/19 0019.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String message = "Client Data";
        Socket socket = new Socket("127.0.0.1", 8080);
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        pw.println(message);
        pw.flush();
        String line  = is.readLine();
        System.out.println(line);
        pw.close();
        is.close();
        socket.close();

    }


}
