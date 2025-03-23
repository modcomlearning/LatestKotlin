fun main() {
    try {
        val result = 10 / 0  // Division by zero (causes an exception)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Error: Cannot divide by zero!")  // Handling the exception
    }
}
