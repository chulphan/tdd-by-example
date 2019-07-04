# Test Driven Development By Example

빠르게 실패하는 테스트 코드를 작성하고, 테스트 코드를 통과하는 코드를 작성하며 리팩토링을 하는 과정을 반복한다.

## 일반적인 TDD의 주기

1. 테스트를 작성한다. 마음속에 있는 동작이 코드에 어떻게 나타나길 원하는지 생각하고 그 생각을 써내려가는 것.
2. 실행 가능하게 만든다. 무엇보다 중요한 것은 **빨리 초록막대를 보는 것**이다. 단순한 해법이 명확히 보이면 그것을 입력한다. 하지만 구현하는데 몇 분 정도 걸릴 것 같으면 일단 적어놓은 뒤에 초록막대를 보는 문제로 돌아가자.
3. 올바르게 만든다. 2의 코드를 리팩토링하여 중복을 제거하고 초록막대로 되돌리자.

==> 작동하는 깔끔한 코드 라는 문제 중 '작동하는' 에 먼저 집중하고 후에 '깔끔한 코드'를 해결해나간다.

## 최대한 빨리 초록막대를 보는 전략
- 가짜로 구현하기: 상수를 반환하게 만들고 진짜 코드를 얻을때까지 단계적으로 상수를 변수로 바꾸어나간다.
- 명백한 구현 사용하기: 실제 구현을 입력한다.

## ToDo

- [ ] $5 + 10CHF = $10 (환율이 2:1 인 경우)

- [ ] **$5 + $5 = $10**

- [x] $5 * 2 = $10

- [x] amount 를 private으로 변경하기

- [x] Dollar 부작용(Side Effect??) (-> Dollar 에 대한 연산을 수행한 후 해당 Dollar의 값이 바뀌는 점)

- [ ] Money 반올림??

- [x] equals() (일시적해결. null이나 다른 객체들과 비교하면??)

- [ ] Equal null

- [ ] Equal object

- [ ] hashCode()

- [x] 5CHF * 2 = 10CHF

- [x] Dollar/Franc 중복

- [x] 공용 equals

- [x] 공용 times

- [x] Dollar 와 Franc 비교하기

- [x] 통화개념 도입?

- [x] testFrancMultiplication 을 지워야하나????(지웠다.)
