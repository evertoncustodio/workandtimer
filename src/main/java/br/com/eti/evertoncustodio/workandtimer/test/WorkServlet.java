package br.com.eti.evertoncustodio.workandtimer.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eti.evertoncustodio.workandtimer.Work;
import br.com.eti.evertoncustodio.workandtimer.WorkFactory;

@WebServlet("/work")
public class WorkServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Work thread = WorkFactory.getWork(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread() + " - " + i);
				}
			}
		});
		
		thread.start();
	}
}
