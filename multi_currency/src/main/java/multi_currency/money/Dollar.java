package multi_currency.money;
/**
 * 
 * �� ��ü ����(Value Object Pattern)
 * 
 * ��ü�� ��ó�� �� �� �ִ� ��.
 * 
 * ��ü�� �ν��Ͻ� ������ �����ڸ� ���ؼ� ������ �Ŀ��� ���� ������ �ʴ´ٴ� ��������� �ִ�.
 * 
 * ����: ��Ī ������ ���� ������ �ʿ䰡 ����.
 * 
 * ù��° Dollar�� 5�� �����ϰ� �ι�° Dollar�� 10�� �����ߴٰ� �ؼ� ù��° Dollar�� ������ ���� ������ ���� �ʴ´�.
 *
 */
public class Dollar extends Money {
	// amount ������ ����ϴ� ���� Dollar �ڽŹۿ� �����Ƿ� 
	// �� ������ ����Ÿ���� private�� �ٲ㵵 �ȴ�.
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
