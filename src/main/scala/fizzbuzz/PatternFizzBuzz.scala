package fizzbuzz

class PatternFizzBuzz extends FizzBuzz {

    def fizzbuzz(number: Int): String = {
        (number % 3, number % 5) match {
            case (0, 0) => return "FizzBuzz"
            case (0, _) => return "Fizz"
            case (_, 0) => return "Buzz"
            case _ => return number.toString()
        }
    }
}
