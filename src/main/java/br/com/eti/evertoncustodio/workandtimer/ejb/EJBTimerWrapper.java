package br.com.eti.evertoncustodio.workandtimer.ejb;

import java.util.TimerTask;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.eti.evertoncustodio.workandtimer.Timer;

public class EJBTimerWrapper implements Timer {

	private EJBTimer ejb;
	private javax.ejb.Timer timer;
	
	public EJBTimerWrapper() throws NamingException {
		ejb = InitialContext.doLookup("java:module/EJBTimer");
	}

	@Override
	public void scheduleAtFixedRate(TimerTask timerTask, long delay, long period) {
		timer = ejb.scheduleAtFixedRate(timerTask, delay, period);
	}

	@Override
	public void cancel() {
		timer.cancel();
	}

}
