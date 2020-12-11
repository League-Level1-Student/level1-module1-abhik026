package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microwave wavy = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor popcorn?");
		String cookTime = JOptionPane.showInputDialog("How long do you want to cook it for(In seconds)?");
		int seconds = Integer.parseInt(cookTime);
		Popcorn poppo = new Popcorn(flavor);
		wavy.putInMicrowave(poppo);
		wavy.setTime(seconds);
		wavy.startMicrowave();
		poppo.applyHeat();
		poppo.eat();
	}

}
