/*
  Problem: https://www.hackerrank.com/challenges/a-very-big-sum/problem
  Kotlin Language Version
  Tool Version : Android Studio
 Thoughts :
    1. Store all the input numbers in an array of size n.
    2. Let the sum of all the input numbers be s. Initialize s to 0. Ensure that storage width of the data type of s is 64 bit.
    3. Start iterating the elments of an array in a loop
    3.1 Let the current element be c.
    3.2 Increment s by c.
    3.3 Move to next element in the array and repeat steps 3.1 through 3.2.
    4. Print s.

    Time Complexity:  O(n) //A loop is required which iterates through n elements in the array to create their sum.
    Space Complexity: O(n) //Space complexity doesn't  matches optimal O(1) solution
*/

object Main {
/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 */

    fun aVeryBigSum(ar: Array<Long>): Long {
        // Write your code here
        var bigSum: Long = 0L
        ar.forEach { item ->
            bigSum += item
        }

        return bigSum
    }

    fun main(args: Array<String>) {
        val arCount = readLine()!!.trim().toInt()

        val ar = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

        val result = aVeryBigSum(ar)

        println(result)
    }


}

