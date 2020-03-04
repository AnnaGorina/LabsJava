package com.company;

import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	    try {
	    	ServerSocket ss = new ServerSocket(8080);
	    	System.out.println("Waiting...");
			Socket client = ss.accept();
			System.out.println("Connected...");
	        URL url = new URL("http://www.novsu.ru");
	        BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
	        String s = r.readLine();
			client.getOutputStream().write(s.getBytes());
			client.getOutputStream().flush();
			s = r.readLine();
			client.getOutputStream().write(s.getBytes());
			client.getOutputStream().flush();
	        /*while (s != null) {
				client.getOutputStream().write(s.getBytes());
				client.getOutputStream().flush();
	            s = r.readLine();
            }*/
	        r.close();
	        ss.close();
	        client.close();
        } catch (MalformedURLException e) {
	        e.printStackTrace();
        } catch (IOException e) {
	        e.printStackTrace();
        }
    }
}
