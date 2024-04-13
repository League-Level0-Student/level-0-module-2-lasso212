package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers { 

public static void main(String[] args) {
	Random gello = new Random();
	int hi =gello.nextInt(100);
	int li =gello.nextInt(100);
	int mi =gello.nextInt(100);
	int ti =gello.nextInt(100);
	int fi =gello.nextInt(100);
	int si=gello.nextInt(100);
	
	
	
	
	
	JOptionPane.showMessageDialog(null, hi + " " + li + " " + mi + " " + ti + " " + fi + " " + si );
	
	//JOptionPane.show
	
	
	
	
	
	
	
	
	
	
	
	
}
}
