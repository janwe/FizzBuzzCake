package fizzbuzz

class JavaStyleFizzBuzz extends FizzBuzz {

    def fizzbuzz(number: Int): String = {
        if (number % 5 == 0 && number % 3 == 0) return "FizzBuzz"
   		if (number % 5 == 0) return "Buzz"
   		if (number % 3 == 0) return "Fizz"
        return number.toString()
    }
}
