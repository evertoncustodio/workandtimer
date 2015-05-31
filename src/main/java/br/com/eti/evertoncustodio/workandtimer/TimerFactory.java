package br.com.eti.evertoncustodio.workandtimer;

import javax.naming.NamingException;

import br.com.eti.evertoncustodio.workandtimer.ejb.EJBTimerWrapper;
import br.com.eti.evertoncustodio.workandtimer.se.TimerWrapper;

public class TimerFactory {

	public static Timer getTimer() {
		try {
			//return new TimerWrapper();
			return new EJBTimerWrapper();
		} catch(NamingException e) {
			throw new RuntimeException(e);
		}
	}
}
