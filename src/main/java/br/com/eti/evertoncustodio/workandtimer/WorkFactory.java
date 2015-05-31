package br.com.eti.evertoncustodio.workandtimer;

import br.com.eti.evertoncustodio.workandtimer.ejb.EJBWorkWrapper;
import br.com.eti.evertoncustodio.workandtimer.se.ThreadWrapper;

public class WorkFactory {

	public static Work getWork(Runnable runnable) {
		try {
			//return new ThreadWrapper(runnable);
			return new EJBWorkWrapper(runnable);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
