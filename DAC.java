import java.io.*;
import java.net.*;

public class DAC{

    DAC(){
        try {
            // 1. Make a Socket Connection to Server

            Socket socket = new Socket("127.0.0.1",3000);

            // 2. Make InputStreamReader (Bridge)

            InputStreamReader stream = new InputStreamReader(socket.getInputStream());

            // 3. Get a BufferedReader

            BufferedReader reader = new BufferedReader(stream);

            // 4. Read From Buffer

            String msg = reader.readLine();

            reader.close();

            System.out.print(msg);



        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static void main(String[] args){
        new DAC();
    }

}