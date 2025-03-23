fun main() {
    //Create a marks variable
    val marks = 20

    if(marks > 0 && marks < 30){
        println("You Failed")
    }

    else if (marks > 30 && marks <=50){
        println("Average")
    }

    else if (marks > 50 && marks <=70){
        println("Above Average")
    }

    else {
        println("You Passed")
    }
}
