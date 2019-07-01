package multi_currency.money;

public class Money {
	protected int amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		System.out.println("getClass " + getClass());
		return amount == money.amount &&
				getClass().equals(money.getClass());
	}
}
