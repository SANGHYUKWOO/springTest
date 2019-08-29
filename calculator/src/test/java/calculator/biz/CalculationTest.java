package calculator.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void 더하기_테스트() {
		Calculation cal= new Calculation();
		cal.add(10, 20);
	}

	@Test
	public void 빼기_테스트() {
		Calculation cal= new Calculation();
		cal.sub(5, 2);
	}

	@Test
	public void 나누기_테스트() {
		Calculation cal= new Calculation();
		cal.mul(6, 2);
	}

	@Test
	public void 곱셈_테스트() {
		Calculation cal = new Calculation();
		cal.div(5, 3);
	}

}
