package multi_currency.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void testDollarMultiplication() {
		Money five = Money.dollar(5);
		// 이전에 테스트는 정확히 우리가 반환하는 것과 비교하는 것을 테스트 하지 않았다.
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
		// 이전에 테스트는 정확히 우리가 반환하는 것과 비교하는 것을 테스트 하지 않았다.
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
