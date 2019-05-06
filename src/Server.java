import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket=new ServerSocket(80);
        while (true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Socket com=serverSocket.accept();
            BufferedReader reader=new BufferedReader(new InputStreamReader(com.getInputStream()));
            System.out.println(reader.readLine());
            com.close();
        }
    }
}
