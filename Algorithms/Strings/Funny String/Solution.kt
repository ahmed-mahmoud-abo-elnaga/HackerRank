/*
        Problem: https://www.hackerrank.com/challenges/funny-string
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts :
        Simply use the same string but iterate from
        beginning and end 


        Time complexity: O(n)   //Time equivalent to text length
        Space complexity: O(1)

*/

object Main {

    fun funnyString(s: String): String {

        val sLength = s.length
        for (i in 0 until sLength / 2) {
            val leftSide = Math.abs(s[i].toInt() - s[i + 1].toInt())
            val rigthSide = Math.abs(s[sLength - 1 - i].toInt() - s[sLength - 2 - i].toInt())
            if (leftSide != rigthSide) {
                return "Not Funny"
            }
        }

        return "Funny"

    }

    fun main(args: Array<String>) {
        val q = readLine()!!.trim().toInt()

        for (qItr in 1..q) {
            val s = readLine()!!

            val result = funnyString(s)

            println(result)
        }
    }


}

