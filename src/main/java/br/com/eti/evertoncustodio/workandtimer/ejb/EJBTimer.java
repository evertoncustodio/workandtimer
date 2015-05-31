package br.com.eti.evertoncustodio.workandtimer.ejb;

import java.util.TimerTask;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Stateless
public class EJBTimer {

	@Resource
	private TimerService timerService;

	public Timer scheduleAtFixedRate(TimerTask timerTask, long delay, long period) {
		TimerConfig timerConfig = new TimerConfig();
		timerConfig.setPersistent(false);
		timerConfig.setInfo(new Task(timerTask));
		
		return timerService.createIntervalTimer(delay, period, timerConfig);
	}
	
	@Timeout
	public void execute(Timer timer) {
		Task task = (Task) timer.getInfo();
		task.getTimerTask().run();
	}
}
