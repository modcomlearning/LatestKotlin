//Using OOP Style to find Area of Square
class Square {
    //Properties/attributes/States
    val width = 5.0  // Fixed side width
    val height = 5.0  // Fixed side height

    //Lecturer TODO Find ARea
    //Member function
    fun calculate_area() {
        //multiply sides
        val area = width * height
        println("Area of Square: $area")
    }
}//end Class

fun main() {
    //Create your Object - instance
    val squareObject = Square()  
    //Access member function
    squareObject.calculateArea()       // Output: Area of Square: 25.0
}
