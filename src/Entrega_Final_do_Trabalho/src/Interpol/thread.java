package Interpol;

public class thread {
	boolean esperando;
	public thread() {}
	synchronized void tique() {
	esperando=true; // agora o objeto thread esta esperando um evento de algum botao
	notify();
	try {
		while(esperando) {// esperando algum evento de um botao
			wait();}
	}catch (InterruptedException e) {
		e.printStackTrace();}
	
	}
	synchronized void taque() {// ocorreu o evento em algum botao
	esperando=false;
	notify();// agora a thread prossegue o codigo na main
	}
}
