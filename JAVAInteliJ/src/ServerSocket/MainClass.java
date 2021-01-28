package ServerSocket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
    public static void main(String[] args) {
        ServerSocket serversocket = null;
        Socket socket = null;

        try {
            serversocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료");

            serversocket.accept();
            System.out.println("클라이언트 연결!!");

            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if (socket !=null) socket.close();
                if (serversocket!=null) serversocket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
