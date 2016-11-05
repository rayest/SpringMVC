package cn.rayest.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Rayest on 2016/8/19 0019.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = is.readLine();
        System.out.println(line);
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        pw.println(line);
        pw.flush();
        pw.close();
        is.close();
        socket.close();
        server.close();
    }
}
