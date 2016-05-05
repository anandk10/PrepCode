package org.se.cor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ProcessDF implements IProcess {

	IProcess process;
	@Override
	public void executeProcess(String command, String output) {
		// TODO Auto-generated method stub
		System.out.println(command);
		System.out.println(command.split(" ")[0]);
		if(command != null && !command.equals("") && command.split(" ")[0].equalsIgnoreCase("df")) {
			String thisCommand;
			if(command.contains("|")) {	
				thisCommand = command.substring(0, command.indexOf("|")).trim();
				command = command.substring(command.indexOf("|")+1).trim();
			}
			else {
				thisCommand =  command.substring(0).trim();
				command = command.substring(0).trim();
			}
			System.out.println("This command "+thisCommand);
			System.out.println("new command "+command);
			
			ProcessBuilder processBuilder = new ProcessBuilder(thisCommand.split(" ")[0],thisCommand.split(" ")[1]);
			///ProcessBuilder processBuilder = new ProcessBuilder(command);
			try {
				Process process = processBuilder.start();

				if(!output.equals("")) {
					
					System.out.println(output);
					OutputStream outputStream = process.getOutputStream();
					PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
					pw.write(output);
					pw.flush();
					pw.close();
				}
				
				String out = output(new InputStreamReader(process.getInputStream()));
				System.out.println("GREP: "+out);
				if(this.process != null)
					this.process.executeProcess(command, out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if(this.process != null){
			this.process.executeProcess(command, output);
		}
		return;
		
	}
	@Override
	public void setNextProcess(IProcess process) {
		// TODO Auto-generated method stub
		this.process = process;
		
	}
	
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

}
