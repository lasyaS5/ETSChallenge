import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCases{
   public static void main(String[] args) {
      Result result1 = JUnitCore.runClasses(CardTest.class);
		
      for (Failure failure1 : result1.getFailures()) {
         System.out.println(failure1.toString());
      }
		
      System.out.println(result1.wasSuccessful());
      Result result2 = JUnitCore.runClasses(DeckTest.class);
		
      for (Failure failure2 : result2.getFailures()) {
         System.out.println(failure2.toString());
      }
		
      System.out.println(result2.wasSuccessful());
      Result result3 = JUnitCore.runClasses(DealTest.class);
		
      for (Failure failure3 : result3.getFailures()) {
         System.out.println(failure3.toString());
      }
		
      System.out.println(result3.wasSuccessful());
      
   }
} 
