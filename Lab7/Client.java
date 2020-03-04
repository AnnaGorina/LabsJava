package com.company;

import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	    try {
	        Socket s = new Socket("localhost", 8080);
	        InputStream is = s.getInputStream();
	        BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String r = br.readLine();
			while (r != null) {
				System.out.println(r);
				r = br.readLine();
			}
	        s.close();
        } catch (UnknownHostException e) {
	        e.printStackTrace();
        } catch (IOException e) {
	        e.printStackTrace();
        }
    }
}
