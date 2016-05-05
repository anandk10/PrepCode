package org.generic.cor;
/**
 * 
 * @author karandikar
 *
 */
public class ProcessCORClient {
	static String[] commands;
	
	/**
	 * Returns the command array
	 * @param args
	 * @return
	 */
	public static void populateCommands(String args[]) {
		commands =  new String[args[0].split("\\|").length];
		int i=0;
		for(;!args[0].trim().equals("");){	
			if(args[0].contains("|")) {	
				commands[i] = new String();
				commands[i] = args[0].substring(0, args[0].indexOf("|")).trim();
				args[0] = args[0].substring(args[0].indexOf("|")+1).trim();
			}
			else {
				commands[i] = new String();
				commands[i] = args[0].substring(0).trim();
				args[0] = "";
			}
			i++;
		}
	}
	
	public static void main(String args[]) {
		//String args[] = new String[3];
		//args[0] = "ls";
		if(args.length == 0 || args[0].trim().equals("")) {
			System.out.println("Invalid length of input arguments.");
			showUsage();
			return;
		}
		//String args[] = new String[1];
		//args[0] = new String("ps -ef | head -5 | tail -2");
		//args[0] = new String("ls -lart | grep drwx------ | head -5 | tail -2");
		//args[0] = new String("ls -lart");
		
		String fullCommand = args[0];
		populateCommands(args);
		
/*		System.out.println("Entered commands are : ");
		for(String command : commands) {
			System.out.println(command);
		}*/
		
		IProcessImpl[] processes = new IProcessImpl[commands.length];
		/* Build the processes and stitch the chains to subsequent process */
		buildProcesses(processes,commands);
		
		/* start the chain */
		//processes[0].executeProcess(fullCommand, "");
		
		processes[0].executeProcess(fullCommand, "");
	}
	/**
	 * Builds up the IProcessImpl objects
	 * @param processes
	 * @param commands2
	 */
	private static void buildProcesses(IProcessImpl[] processes, String[] commands2) {
		// TODO Auto-generated method stub
		int i=0;
		for(String command : commands) {
/*			System.out.println(command);*/
			String procSplits[] = command.trim().split(" ");
			if(procSplits.length > 1) {
				/* input process has more than 1 arguments */
				processes[i] = new IProcessImpl(procSplits[0]);
				processes[i].setArguments(procSplits[1]);
			} else {
				/* input process has only the process name to execute */
				processes[i] = new IProcessImpl(procSplits[0]);
				processes[i].setArguments("");
			}
/*			System.out.println("Process #"+i+" "+processes[i].getCurrentProcessName()+" "+processes[i].getArguments());*/
			//processes[i] = new IProcessImpl();
			//System.out.println("process #"+i+" "+processes[i].getCurrentProcessName());
			i++;
		}
		setChains(processes);
	}

	private static void setChains(IProcessImpl[] processes) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<processes.length-1;i++) {
			processes[i].setNextProcess(processes[i+1]);
		}
		
	}

	private static void showUsage() {
		// TODO Auto-generated method stub
		System.out.println("Usage: ");
		System.out.println("ProcessCOR.jar \" command1 argumtents | command2 arguments ... \"");
	}
	
}
