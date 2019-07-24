import java.net.*;
import java.io.*;


public class DAS{
    DAS(){
        try {

            // 1. Make a ServerSocket which waits for clients
            ServerSocket server = new ServerSocket(3000);

            System.out.println("Server running on port 3000");

            // 2. Permanently Listen for Comming Clients

            while(true){

            // 3. Give some other port to connected client
            
               Socket clientSocket = server.accept();

            // 4. Send Data to Connected Client

            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());

            writer.println("Hey there how are you !");

            writer.close();


        }



        } catch (Exception e) {
           System.out.print("Exception has occured" + e);
        }
    }

    public static void main(String[] args){
        new DAS();
    }
    
}