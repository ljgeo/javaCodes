package LearningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation_1 {
	int i;
	@BeforeClass
		public void beforeClass() {
		
		 //int i;
		 System.out.println("Inside Before Classs ");
		}
	
	@BeforeMethod
	public void beforeMethod() {
	
	 i=5;
	 System.out.println("Inside Before Method ");
	}
	
	@Test
	public void test1(){
		System.out.println("Inside Test1  "+i);
	}
	@AfterMethod
	public void afterMethod() {
		
	i=10;
	System.out.println("AfterMethod i= " +i);
	}
	
	@AfterClass
	public void AfterClass() {
	
	 //int i;
	 System.out.println("Inside After Classs ");
	}
}
