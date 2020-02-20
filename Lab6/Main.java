package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        File sin = new File("sin.txt");
        File input = new File("input.txt");

        PrintWriter pw = new PrintWriter(sin);

        FileReader sinRead = new FileReader(sin);
        FileReader inputRead = new FileReader(input);

	    for (int i = 0; i < 360; i++) {
            pw.println(Math.sin(i));
        }
	    pw.flush();

	    double ArrayNumbSin[] = new double[360];

	    BufferedReader BuffReadSin = new BufferedReader(sinRead);
	    BufferedReader BuffReadInput = new BufferedReader(inputRead);

	    for (int i = 0; i < ArrayNumbSin.length; i++) {
	        ArrayNumbSin[i] = Double.parseDouble(BuffReadSin.readLine());
        }

	    System.out.println(ArrayNumbSin[Integer.parseInt(BuffReadInput.readLine())]);

	    System.out.println("-------------------------------------------");

	    /*for (int i = 0; i < ArrayNumbSin.length; i++) {
	        System.out.println(ArrayNumbSin[i]);
        }*/

	    pw.close();
	    sinRead.close();
	    inputRead.close();

        FileOutputStream fos = new FileOutputStream("sin2.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(ArrayNumbSin);
        oos.flush();

        double NewArrayNumbSin [] = new double[360];

        FileInputStream fis = new FileInputStream("sin2.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        NewArrayNumbSin = (double[]) ois.readObject();

        for (int i = 0; i < NewArrayNumbSin.length; i++) {
            System.out.println(NewArrayNumbSin[i]);
        }

        for (int i = 0; i < ArrayNumbSin.length; i++) {
            oos.writeObject(ArrayNumbSin[i]);
            oos.flush();
        }

        double NewNewArrayNumbSin [] = new double[360];

        for (int i = 0; i < NewNewArrayNumbSin.length; i++) {
            NewNewArrayNumbSin[i] = (double) ois.readObject();
        }

        System.out.println("----------------------------------------");

        for (int i = 0; i < NewNewArrayNumbSin.length; i++) {
            System.out.println(NewNewArrayNumbSin[i]);
        }

        //ois.readObject(NewArrayNumbSin);
    }
}
