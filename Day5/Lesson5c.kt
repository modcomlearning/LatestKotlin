open class Animal {
    fun eat() {
        println("This animal eats food.")
    }
}

class Dog : Animal() { // Inheriting from Animal
    fun bark() {
        println("The dog barks.")
    }
}

fun main() {
    val dogObject = Dog()
    dogObject.eat()  // Inherited from Animal
    dogObject.bark() // Defined in Dog
}
