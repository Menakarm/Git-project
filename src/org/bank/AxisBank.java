package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit(int x) {
		super.deposit(x);
			System.out.println("Deposit Amount : "+x);
	}
public static void main(String[] args) {
	AxisBank bank=new AxisBank();
	bank.saving();
	bank.fixed();
	bank.deposit(2000);	
	}
}
