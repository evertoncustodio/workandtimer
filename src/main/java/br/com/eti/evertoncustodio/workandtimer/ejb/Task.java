package br.com.eti.evertoncustodio.workandtimer.ejb;

import java.io.Serializable;
import java.util.TimerTask;

class Task implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private TimerTask timerTask;
	
	public Task(TimerTask timerTask) {
		super();
		this.timerTask = timerTask;
	}

	public TimerTask getTimerTask() {
		return timerTask;
	}
	
	
}
