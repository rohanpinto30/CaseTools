import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)

class InterestCalculatorTest {
	InterestCalculator IC;
	int [] actualInput;
	int [] expectedInput;
	@BeforeAll
	void setUp() {
		IC=new InterestCalculator();
		actualInput= new int[5];
		expectedInput=new int[5];
	}

	@Test
	@Order(1)
	void testCalculateSimpleInterest() {
		IC.CalculateSimpleInterest();
		assertEquals(3000.0, IC.getSimpleInterest());
	}

	@Test
	@Order(2)
	void testCalculateCompoundInterest() {
		IC.CalculateCompoundInterest();
		assertEquals(512.5,IC.getCompoundInterest());
	}

	@Test
	@Order(3)
	void testReadNumbers() {
		IC.ReadNumbers();
		expectedInput[0]=10;
		expectedInput[1]=20;
		expectedInput[2]=30;
		expectedInput[3]=40;
		expectedInput[4]=50;
		
		actualInput[0]=IC.getNum1();
		actualInput[1]=IC.getNum2();
		actualInput[2]=IC.getNum3();
		actualInput[3]=IC.getNum4();
		actualInput[4]=IC.getNum5();
		assertArrayEquals(actualInput,expectedInput);
	}

	@Test
	@Order(4)
	void testFindAvg() {
		IC.FindAvg();
		assertEquals(30,IC.getAverage());
	}

}
