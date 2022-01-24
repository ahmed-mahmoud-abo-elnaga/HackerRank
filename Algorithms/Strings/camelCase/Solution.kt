/*
        Problem: https://www.hackerrank.com/challenges/camelcase
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts (Key points in algorithm):
         If we handle the edge cases all we need to do is count the capital letters

        Time complexity: O(1)
        Space complexity: O(1)

*/

object Main {

    fun camelcase(s: String): Int {
        return s.toCharArray().filter { it.isUpperCase() }.size + 1
    }

    fun main(args: Array<String>) {
        val s = readLine()!!

        val result = camelcase(s)

        println(result)
    }

}

