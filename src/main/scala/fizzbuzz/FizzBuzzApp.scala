package fizzbuzz

class FizzBuzzApp { this: FizzBuzzComponent =>
    
    def run() {
        for (n <- 1 to 100) {
            println(fizzbuzzer.fizzbuzz(n))
        }
    }

}

object Main {
    def main(args: Array[String]) {
        if (!args.isEmpty && args.first == "pattern") {
            println("Pattern matching FizzBuzz")
            new FizzBuzzApp with FizzBuzzComponent { val fizzbuzzer = new PatternFizzBuzz } run
        } else {
            println("JavaStyle FizzBuzz:")
            new FizzBuzzApp with FizzBuzzComponent { val fizzbuzzer = new JavaStyleFizzBuzz } run
        }
    }
}