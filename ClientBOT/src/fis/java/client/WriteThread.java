package fis.java.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread {
    private PrintWriter writer;
    private Socket socket;
    private ChatClient client;
 
    public WriteThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.client = client;
 
        try {
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        } catch (IOException ex) {
            System.out.println("Error getting output stream: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 
    public void run() {
 
       // Console console = System.console();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\nEnter your name :");
    	String userName = sc.nextLine();
    	//String userName = console.readLine("\nEnter your name: ");
        client.setUserName(userName);
        writer.println(userName);
 
        String text;
 
        do {
        	System.out.println("[" + userName + "]: ");
          //  text = console.readLine("[" + userName + "]: ");
        	text = sc.nextLine();
            writer.println(text);
 
        } while (!text.equals("bye"));
 
        try {
            socket.close();
        } catch (IOException ex) {
 
            System.out.println("Error writing to server: " + ex.getMessage());
        }
    }
}
