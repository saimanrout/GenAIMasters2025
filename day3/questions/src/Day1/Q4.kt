package Day1

fun main() {
    var cupSize1 = "Small"
    var cupSize2 = "Large"

    println("Before swap:")
    println("Cup 1: $cupSize1")
    println("Cup 2: $cupSize2")

    // Swapping
    val temp = cupSize1
    cupSize1 = cupSize2
    cupSize2 = temp

    println("\nAfter swap:")
    println("Cup 1: $cupSize1")
    println("Cup 2: $cupSize2")
}
