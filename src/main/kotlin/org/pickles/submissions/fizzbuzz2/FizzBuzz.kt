package org.pickles.submissions.fizzbuzz2

fun printFizzBuzz() {
    for (number in 1..150) {
        if(number % 10 == 3 || number % 3 == 0) {
            println("${number}!")
        }
        else {
            println(number)
        }
    }
}
