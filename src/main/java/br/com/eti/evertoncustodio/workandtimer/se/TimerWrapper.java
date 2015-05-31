package br.com.eti.evertoncustodio.workandtimer.se;

import java.util.TimerTask;

import br.com.eti.evertoncustodio.workandtimer.Timer;

public class TimerWrapper implements Timer {

	private java.util.Timer timer;
	
	@Override
	public void scheduleAtFixedRate(TimerTask timerTask, long delay, long period) {
		timer = new java.util.Timer();
		timer.scheduleAtFixedRate(timerTask, delay, period);
	}

	@Override
	public void cancel() {
		timer.cancel();
	}

}
