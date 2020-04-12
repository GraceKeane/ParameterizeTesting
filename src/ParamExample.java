import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParamExample {
	
	// Variables
	private String name1;
	private String name2;
	private int num1;
	
	// Constructor
	public ParamExample(String name1, String name2, int num1) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.num1 = num1;
	}
	
	// Make data feed into the constructor
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data = new Object[2][3];
		
		// Populate the array (1)
		// row 1
		data[0][0] = "Tom";
		data[0][1] = "Jones";
		data[0][2] = 21;
		
		// Populate the array (2)
		// row 2
		data[1][0] = "John";
		data[1][1] = "Keane";
		data[1][2] = 33;

		return Arrays.asList(data);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		// Pass
		System.out.println("Example " + this.name1 + " " + this.name2 + " " + this.num1);
	}

}
