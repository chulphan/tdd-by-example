package multi_currency.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void testDollarMultiplication() {
		Money five = Money.dollar(5);
		// ������ �׽�Ʈ�� ��Ȯ�� �츮�� ��ȯ�ϴ� �Ͱ� ���ϴ� ���� �׽�Ʈ ���� �ʾҴ�.
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	
	@Test
	public void testDollarEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		// ������ �׽�Ʈ�� ��Ȯ�� �츮�� ��ȯ�ϴ� �Ͱ� ���ϴ� ���� �׽�Ʈ ���� �ʾҴ�.
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testFrancEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
}
