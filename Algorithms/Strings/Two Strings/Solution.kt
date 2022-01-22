/*
  Problem: https://www.hackerrank.com/challenges/two-strings
  Kotlin Language Version
  Tool Version : Android Studio
Initial Thoughts:
Since a substring can be a minimum of size 1
and at max the size of the smallest substring,
then we can derive that if they have a letter in
common they have a substring in common

Algorithm:
Form a set for each string made up of its' characters
Intersect the sets
if size of intersection is > 0
    YES
else
    NO


Time complexity: O(|a| + |b|)    //We iterate through each input string
Space complexity: O(1)           //Our sets can be at most 2 x character set in size
*/
*/

object Main {

    fun twoStrings(s1: String, s2: String): String {
        // Write your code here
        var result = "NO"
        val s1Set: MutableSet<Char> = s1.toCharArray().toMutableSet()
        val s2Set: MutableSet<Char> = s2.toCharArray().toMutableSet()
        //Perform the intersection of the two sets
        s1Set.retainAll(s2Set)

        if (s1Set.size > 0) result = "YES"

        return result
    }

    fun main(args: Array<String>) {
        val q = readLine()!!.trim().toInt()

        for (qItr in 1..q) {
            val s1 = readLine()!!

            val s2 = readLine()!!

            val result = twoStrings(s1, s2)

            println(result)
        }
    }

}

