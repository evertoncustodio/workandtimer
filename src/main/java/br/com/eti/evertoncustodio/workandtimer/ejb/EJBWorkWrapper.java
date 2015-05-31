package br.com.eti.evertoncustodio.workandtimer.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.eti.evertoncustodio.workandtimer.Work;

public class EJBWorkWrapper implements Work {

	private Runnable runnable;
	private EJBWork ejbWork;
	
	public EJBWorkWrapper(Runnable runnable) throws NamingException {
		this.runnable = runnable;
		ejbWork = InitialContext.doLookup("java:module/EJBWork");
	}
	
	@Override
	public void start() {
		ejbWork.execute(runnable);
	}

}
