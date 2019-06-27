package multi_currency.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void testDollarMultiplication() {
		Dollar five = new Dollar(5);
		// ������ �׽�Ʈ�� ��Ȯ�� �츮�� ��ȯ�ϴ� �Ͱ� ���ϴ� ���� �׽�Ʈ ���� �ʾҴ�.
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	
	@Test
	public void testDollarEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		// ������ �׽�Ʈ�� ��Ȯ�� �츮�� ��ȯ�ϴ� �Ͱ� ���ϴ� ���� �׽�Ʈ ���� �ʾҴ�.
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}
	
	@Test
	public void testFrancEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));
	}
}
