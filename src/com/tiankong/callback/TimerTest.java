package com.tiankong.callback;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import com.tiankong.callback.entity.TimePrinter;

public class TimerTest {
	
	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(10000, listener);
		System.out.println("readly");
		t.start();
		System.out.println("start");
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
