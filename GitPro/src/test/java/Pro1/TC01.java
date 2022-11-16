package Pro1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01 {

	
		
		@BeforeSuite
		public void Beforesuit() {
			System.out.println("BeforeSuit");
		}
		
		@BeforeTest
		public void Beforetest() {
			System.out.println("BeforeTest");
		}
		
		@BeforeClass
		public void Beforeclass() {
			System.out.println("BeforeClass");
		}
		
		@BeforeMethod
		public void Beforemethod() {
			System.out.println("BeforeMethod");
		}
		
		@Test
		public void TC1() {
			System.out.println("TC01");
		}
		
		
		@Test
		public void TC2() {
			System.out.println("TC02");
		}
		
		@Test
		public void TC3() {
			System.out.println("TC03");
		}
		
		
		@AfterMethod
		public void Aftermethod() {
			System.out.println("AfterMethod");
		}
		
		@AfterClass
		public void Afterclass() {
			System.out.println("AfterClass");
		}
		
		@AfterTest
		public void Aftertest() {
			System.out.println("AfterSuit");
		}
		
		@AfterSuite
		public void Aftersuit() {
			System.out.println("AfterSuit");
		}
	

	
}
