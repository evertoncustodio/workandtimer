package br.com.eti.evertoncustodio.workandtimer.ejb;

import javax.ejb.Asynchronous;
import javax.ejb.Stateful;

@Stateful
public class EJBWork {

	@Asynchronous
	public void execute(Runnable runnable) {
		runnable.run();
	}
}
