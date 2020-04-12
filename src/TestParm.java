import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class TestParm {
	
	// Two parameters
	private String param1;
	private int param2;
	
	public TestParm(String p1,int p2)
	{
		param1 = p1;
		param2 = p2;
		System.out.println("In the constructor");
	}
	
	@Parameters
	public static Collection<Object[]> getData()
	{

		Object[][] data = new Object[3][2];
	
		data[0][0]="Martin";
		data[0][1]=60;
		
		data[1][0]="Michael";
		data[1][1]=61;
		
		data[2][0]="John";
		data[2][1]=82;
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
		System.out.println("Test1 "+param1);
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 "+param2);
	}

}
