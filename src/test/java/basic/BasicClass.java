package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasicClass {

	@BeforeSuite
	public void suiteSetUp() {
		System.out.println("@Beforesuite");
		
	}
	@BeforeTest
	public void testSetUp() {
		System.out.println("@BeforeTest");
		
	}
	@BeforeClass
	public void classSetUp() {
		System.out.println("@BeforeClass");
		
	}@BeforeMethod
	public void methodSetUp() {
		System.out.println("@Beforemethod");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void classmethod() {
		System.out.println("@Afterclass");
	}
	@AfterTest
	public void testmethod() {
		System.out.println("@Aftertest");
	}
	@AfterSuite
	public void suitemethod() {
		System.out.println("@Aftersuite");
	}
	
}
