package com.tiankong.callback;

import javax.swing.JOptionPane;

import com.tiankong.callback.entity.TalkingClock;

public class InnerClassTest {
	
	public static void main(String[] args) {
		System.out.println(new Object(){}.getClass().getEnclosingClass());
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
