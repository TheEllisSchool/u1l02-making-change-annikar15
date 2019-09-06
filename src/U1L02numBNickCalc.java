//U1L02 Notes

import javax.swing.JOptionPane;

public class U1L02numBNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,
				"How many cents do you have?");
		int userMoney = Integer.parseInt(input);
		
		System.out.println(userMoney);
		
		int numBNicks = userMoney/5;
		int pennies = userMoney - (numBNicks * 5);
		
		JOptionPane.showMessageDialog(null, userMoney + " is " + numBNicks + " nickels and "
				+ pennies + " pennies.");
	}

}
