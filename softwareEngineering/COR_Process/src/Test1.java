//package org.se.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Test1 {

    private static String output(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(inputStreamReader);
            String line = null;
            while ((line = br.readLine()) != null) {
               sb.append(line+System.lineSeparator());
                
            }
        } finally {
            br.close();
        }
        return sb.toString();
    }

    
    public static void main(String args[]) {
    	
    	ProcessBuilder process1 = new ProcessBuilder("who > who.txt");
    	//ProcessBuilder process1 = new ProcessBuilder("ls","-lart");
    	
    	
    	//String inputToProc = "This is a public class.";
    	ProcessBuilder process2 = new ProcessBuilder("grep","d.*");
    	
    	
    	
    	String output;
    	
    	try {
			Process proc1 = process1.start();
			Process proc2 = process2.start();
			
			OutputStream outputStream = proc2.getOutputStream();
			
			output = output(new InputStreamReader(proc1.getInputStream()));
			//System.out.println(output);
//			output = output(new InputStreamReader(proc1.getErrorStream()));
//			System.out.println(output);
//			
			//outputStream.write(inputToProc.getBytes());
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
			pw.write(output);
			pw.flush();
			pw.close();
			
			
			process1.redirectErrorStream(true);
			process2.redirectErrorStream(true);
//			process2.redirectInput(process1.redirectOutput());
			
			//Process proc2 = process2.start();
			output = output(new InputStreamReader(proc2.getInputStream()));
			System.out.println(output);
			output = output(new InputStreamReader(proc2.getErrorStream()));
			System.out.println(output);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    }
}