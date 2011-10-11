package fizzbuzz

trait FizzBuzz {
	def fizzbuzz(number: Int): String
}

trait FizzBuzzComponent {
    val fizzbuzzer: FizzBuzz
}
