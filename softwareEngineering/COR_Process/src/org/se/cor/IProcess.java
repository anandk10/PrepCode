package org.se.cor;

public interface IProcess {
	public void setNextProcess(IProcess process);
	public  void executeProcess(String command, String output);
}
