package org.generic.cor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


/**
 * 
 * @author karandikar
 *
 */

public class IProcessImpl implements IProcess{

	private String processName;
	private String arguments;

	IProcess process;

	public IProcessImpl(String processName) {
		super();
		this.processName = processName;
	}

	public String getArguments() {
		return arguments;
	}

	public void setArguments(String arguments) {
		this.arguments = arguments;
	}

	@Override
	public void executeProcess(String command, String output) {
		// TODO Auto-generated method stub
		if(command.equalsIgnoreCase("grep") && output.trim().equals("")) {
			System.out.println("ERROR: "+this.getCurrentProcessName()+" cannot execute without an input.");
			return;
		}
		if(command != null && !command.equals("") && command.split(" ")[0].equalsIgnoreCase(this.getCurrentProcessName())) {
			String thisCommand;
			if(command.contains("|")) {	
				thisCommand = command.substring(0, command.indexOf("|")).trim();
				command = command.substring(command.indexOf("|")+1).trim();
			}
			else {
				thisCommand =  command.substring(0).trim();
				command = "";
			}
			ProcessBuilder processBuilder;
			if(!this.getArguments().equals(""))
				processBuilder = new ProcessBuilder(this.getCurrentProcessName(),this.getArguments());
			else
				processBuilder = new ProcessBuilder(this.getCurrentProcessName());
			///ProcessBuilder processBuilder = new ProcessBuilder(command);
			try {
				Process process = processBuilder.start();

				if(!output.equals("")) {
					
					OutputStream outputStream = process.getOutputStream();
					PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
					pw.write(output);
					pw.flush();
					pw.close();
				}
				
				String out = output(new InputStreamReader(process.getInputStream()));
				System.out.println("========="+this.getCurrentProcessName().toUpperCase()+"=========\n"+out);
				System.out.println("===============================================================");
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

	public String getCurrentProcessName() {
		// TODO Auto-generated method stub
		return this.processName;
	}

}
