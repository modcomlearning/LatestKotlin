fun main() {
    var marks: Int = 90 // we set some marks here
    when (marks) {
        in 1..30 -> println("You have $marks - Below average")
        in 31..50 -> println("You have $marks - Average")
        in 51..75 -> println("You have $marks - Above average")
        else -> println("You Passed")
    }
}