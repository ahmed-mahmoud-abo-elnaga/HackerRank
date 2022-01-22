/*
        Problem: https://www.hackerrank.com/challenges/anagram
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts :
        Get frequency of first and second half
        Count the changes second half needs to become first half

        Time complexity: O(n)   //Time equivalent to input size
        Space complexity: O(n)  //The equivalent to input size of chars 

*/

object Main {

    fun anagram(s: String): Int {
        // Write your code here

        if (s.length % 2 == 1) return -1
        var array = s.toCharArray()
        var charsToChange = 0
        var startIndexForSecondString = array.size / 2
        loop@ for (i in 0 until array.size / 2) {
            for (j in startIndexForSecondString until array.size) {
                if (array[i] == array[j]) {
                    array[startIndexForSecondString] =
                        array[j].also { array[j] = array[startIndexForSecondString] }
                    startIndexForSecondString++
                    continue@loop
                }
            }
            charsToChange++
        }
        return charsToChange

    }

    fun main(args: Array<String>) {
        val q = readLine()!!.trim().toInt()

        for (qItr in 1..q) {
            val s = readLine()!!

            val result = anagram(s)

            println(result)
        }
    }

}

