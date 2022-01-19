/*
        Problem: https://www.hackerrank.com/challenges/strong-password/problem
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts :
        Keep iterating the input string untill
         - at least one digit is found
         - at least one lower case alphabet is found
         - at least one upper case alphabet is found
         - at least special character is found
         - at least 6 characters have been traversed

        In the end extra chars will be required depending upon each of the conditions (above mentioned) which is still false.

        Time Complexity:  O(n)
        Space Complexity: O(1) //number of dynamically allocated variables remain constant for any input.

*/

object Main {

    fun minimumNumber(n: Int, password: String): Int {
        // Return the minimum number of characters to make the password strong
        /*
        -at least one digit is found
        -at least one lower case alphabet is found
        -at least one upper case alphabet is found
        -at least special character is found*/
        var specialCharsCount = 4


        if (Pattern.compile("[!@#$%^&*()\\-\\+]").matcher(password).find()) specialCharsCount--
        if (Pattern.compile("[a-z]").matcher(password).find()) specialCharsCount--
        if (Pattern.compile("[A-Z]").matcher(password).find()) specialCharsCount--
        if (Pattern.compile("[0-9]").matcher(password).find()) specialCharsCount--


        return Math.max(6 - n, specialCharsCount)
    }


    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val password = readLine()!!

        val answer = minimumNumber(n, password)

        println(answer)
    }
}

