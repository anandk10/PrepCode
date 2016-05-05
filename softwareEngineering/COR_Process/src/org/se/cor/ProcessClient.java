package org.se.cor;

public class ProcessClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessLS ls = new ProcessLS();
		ProcessGREP grep = new ProcessGREP();
		ProcessNETSTAT netstat = new ProcessNETSTAT();
		ProcessPS ps = new ProcessPS();
		ProcessDF df = new ProcessDF();
		ProcessHEAD head = new ProcessHEAD();
		ProcessTAIL tail = new ProcessTAIL();
		
/*		System.out.println("==============================================================================================================");
		ls.setNextProcess(grep);
		ls.executeProcess("ls -l | grep bin", "");
		*/
		/* version 2 */

/*		System.out.println("==============================================================================================================");
		netstat.setNextProcess(ps);
		//ps.setNextProcess(grep);
		netstat.executeProcess("netstat -a | ps -ef", "");
		*/
		/* Version 3 */
/*		System.out.println("==============================================================================================================");
		df.setNextProcess(grep);
		df.executeProcess("df -h | grep .M", "");
		*/
		
		/* Version 4 */
/*		System.out.println("==============================================================================================================");
		ps.setNextProcess(grep);
		ps.executeProcess("ps -ef | grep bash", "");*/
		
		
		/*ls -lart | grep drwx------ | head -5 | tail -2*/
		
/*		System.out.println("==============================================================================================================");*/
		
		/* Version 5 */
/*		ls.setNextProcess(grep);
		grep.setNextProcess(head);
		head.setNextProcess(tail);
		ls.executeProcess(" ls -lart | grep drwx------ | head -5 | tail -2", "");*/
		
		System.out.println("==============================================================================================================");
		/* Verion 6 */
		ps.setNextProcess(head);
		ps.executeProcess("ps -ef | head -10", "");
		
		
	}

}
