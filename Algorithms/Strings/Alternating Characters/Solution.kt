/*
        Problem: https://www.hackerrank.com/challenges/alternating-characters/problem
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts (Key points in algorithm):
         - We've to simply track the alternating characters while traversing the characters of the string
         - If the character being traversed is same as previous character then we need to delete it.
         - For delete operation we will use replace with regex .
         - Print the counter value in the end.

        Time complexity: O(n)   //Time equivalent to input size
        Space complexity: O(1)  //we are reading every string input in a test case from console input stream character by character
                                  in place of saving the entire string in memory. So constant space.

*/

object Main {

    fun alternatingCharacters(s: String): Int {
        var lengthAfterDeletion = s.replace("A{2,}".toRegex(), "A").replace("B{2,}".toRegex(), "B")
            .length
        return s.length - lengthAfterDeletion
    }

    fun main(args: Array<String>) {
        val q = readLine()!!.trim().toInt()

        for (qItr in 1..q) {
            val s = readLine()!!

            val result = alternatingCharacters(s)

            println(result)
        }
    }

}

