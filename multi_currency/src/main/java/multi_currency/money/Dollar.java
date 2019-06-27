package multi_currency.money;
/**
 * 
 * 값 객체 패턴(Value Object Pattern)
 * 
 * 객체를 값처럼 쓸 수 있는 것.
 * 
 * 객체의 인스턴스 변수가 생성자를 통해서 설정된 후에는 결코 변하지 않는다는 제약사항이 있다.
 * 
 * 장점: 별칭 문제에 대해 걱정할 필요가 없다.
 * 
 * 첫번째 Dollar에 5를 설정하고 두번째 Dollar에 10을 설정했다고 해서 첫번째 Dollar에 설정한 값이 영향을 받지 않는다.
 *
 */
public class Dollar extends Money {
	// amount 변수를 사용하는 곳은 Dollar 자신밖에 없으므로 
	// 이 변수의 접근타입을 private로 바꿔도 된다.
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
