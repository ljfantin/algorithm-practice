package arrays.leftRotate

import java.util.*

// O(N)
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

    var arrayResult : Array<Int> = Array(a.size) { 0 }
    var index = 0
    // if size is equals to count rotation then we don't rotate, because has no sense
    if (a.size == d) {
        return a
    }
    // first we copy the last part at the array beginning
    var limSup = a.size - 1
    var limInf = d
    for (i in limInf..limSup) {
        arrayResult[index] = a[i]
        index++
    }
    // then we copy the first part at the array ending

    limSup = d - 1
    limInf = 0
    for (i in limInf..limSup) {
        arrayResult[index] = a[i]
        index++
    }

    // returns the array rotated
    return arrayResult
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
