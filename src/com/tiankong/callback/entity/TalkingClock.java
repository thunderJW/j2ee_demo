package com.tiankong.callback.entity;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	
	private int interval;
	
	private boolean beep;
	
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start() {
//		ActionListener listener = new TimePrinter();
		System.out.println(getClass());
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
//	public class TimePrinter implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			Date now = new Date();
//			System.out.println("At the tone, the time is " + now);
//			if (TalkingClock.this.beep) {
//				Toolkit.getDefaultToolkit().beep();
//			}
//		}
//		
//	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public boolean isBeep() {
		return beep;
	}

	public void setBeep(boolean beep) {
		this.beep = beep;
	}
	
}
