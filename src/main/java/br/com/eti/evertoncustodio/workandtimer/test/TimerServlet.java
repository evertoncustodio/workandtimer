package br.com.eti.evertoncustodio.workandtimer.test;

import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eti.evertoncustodio.workandtimer.Timer;
import br.com.eti.evertoncustodio.workandtimer.TimerFactory;

@WebServlet("/timer")
public class TimerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Timer timer = TimerFactory.getTimer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Timer - " + new Date());
			}
		}, 30000L, 1000L);
		
		try {
			Thread.currentThread().sleep(50000);
			timer.cancel();
			System.out.println("Parado");
		} catch(Exception e) {
			throw new ServletException(e);
		}
	}
}
