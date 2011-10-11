package fizzbuzz
import org.scalatest.junit.ShouldMatchersForJUnit
import org.scalatest.junit.JUnitSuite
import org.junit.Test

class FizzBuzzAppTest extends JUnitSuite with ShouldMatchersForJUnit {

    @Test
    def runShouldCallFizzbuzzHundredTimes {
        val callAggregator = new FizzBuzzCallCountAggregator
        (new FizzBuzzApp with FizzBuzzComponent { val fizzbuzzer = callAggregator }).run
        callAggregator.callCount should be (100)
    }
}


private class FizzBuzzCallCountAggregator extends FizzBuzz {
    var callCount: Int = 0
    
    def fizzbuzz(number: Int): String = {
        callCount += 1
        return ""
    }
}