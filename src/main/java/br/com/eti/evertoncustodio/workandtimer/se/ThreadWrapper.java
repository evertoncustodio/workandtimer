package br.com.eti.evertoncustodio.workandtimer.se;

import br.com.eti.evertoncustodio.workandtimer.Work;

public class ThreadWrapper implements Work {

	private Thread thread;
	
	public ThreadWrapper(Runnable runnable) {
		this.thread = new Thread(runnable);
	}
	
	@Override
	public void start() {
		this.thread.start();
	}

}
