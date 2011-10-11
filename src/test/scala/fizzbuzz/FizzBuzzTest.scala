package fizzbuzz

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit
import org.junit.Test
import org.junit.runner.RunWith

class FizzBuzzTest extends JUnitSuite with ShouldMatchersForJUnit {

    val fizzbuzzers = List(new JavaStyleFizzBuzz, new PatternFizzBuzz())
    
    val fizzNumbers = List(3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99)
    
    val buzzNumbers = List(5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100)
    
    val fizzBuzzNumbers = List(15, 30, 45, 60, 75, 90)
    
    @Test
    def oneShouldReturn1 {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(1) should be ("1"))
    }
    
    @Test
    def twoShouldReturn2 {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(2) should be ("2"))
    }
    
    @Test
    def threeShouldReturnFizz {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(3) should be ("Fizz"))
    }
    
    @Test
    def fourShouldReturn4 {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(4) should be ("4"))
    }
    
    @Test
    def fiveShouldReturnBuzz {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(5) should be ("Buzz"))
    }
    
    @Test
    def fifteenShouldReturnFizzBuzz {
        fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(15) should be ("FizzBuzz"))
    }
    
    @Test
    def fizzNumbersShouldReturnFizz {
        fizzNumbers.foreach(n => fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(n) should be ("Fizz")))
    }
    
    @Test
    def buzzNumbersShouldReturnBuzz {
        buzzNumbers.foreach(n => fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(n) should be ("Buzz")))
    }
    
    @Test
    def fizzBuzzNumbersShouldReturnFizzBuzz {
        fizzBuzzNumbers.foreach(n => fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(n) should be ("FizzBuzz")))
    }
    
    @Test
    def otherNumbersShouldReturnNumber {
        for (n <- 1 to 100)
            if (!fizzNumbers.contains(n) && !buzzNumbers.contains(n) && !fizzBuzzNumbers.contains(n))
                fizzbuzzers.foreach(fizzbuzzer => fizzbuzzer.fizzbuzz(n) should be (n.toString()))
    }
}