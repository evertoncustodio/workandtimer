package br.com.eti.evertoncustodio.workandtimer;

import java.util.TimerTask;

public interface Timer {

	void scheduleAtFixedRate(TimerTask timerTask, long delay, long period);
	void cancel();
}
