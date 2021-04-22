package com.pipeline.testing;


public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();

	public void testAdd() {
		Properties prop = new Properties();
		
		OutputStream output = null;

		try
		{

			output = new FileOutputStream("../config.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "Mohit");
			prop.setProperty("dbpassword", "Pipeline");

			// save properties to project root folder
			prop.store(output, null);

		}catch(
		IOException io)
		{
			io.printStackTrace();
		}finally
		{
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public void testMultiply() {
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
	
	public void testAddNew() {
		Assert.assertEquals(cal.add(10, 20), 30);
	}
}
