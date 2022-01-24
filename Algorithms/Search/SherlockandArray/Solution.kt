/*
        Problem: https://www.hackerrank.com/challenges/sherlock-and-array/problem
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts (Key points in algorithm):
        This is quite a straight forward problem. All elements of the input array is
        set to the sum of all the elements upto that point of the input array, i.e.
        arr[i] = Sum(arr[j]) for 0 <= j <=i < n
        Then in an other loop we compare arr[i] and arr[n-1] - arr[i] , which will
        turn the answer to be YES, otherwise it is NO.

       Time Complexity : O( n ) for each test case.
       Space Complextiy : O( n ) for entire input file.
       */

object Main {


    /* Complete the 'balancedSums' function below.
    * The function is expected to return a STRING.
    * The function accepts INTEGER_ARRAY arr as parameter.
    */

    fun balancedSums(arr: Array<Int>): String {
        if (arr.size == 1) return "YES"
        var incrementalArray = IntArray(arr.size)
        incrementalArray[0] = arr[0]

        for (i in 1 until arr.size) {
            incrementalArray[i] = arr[i] + incrementalArray[i - 1]
        }
        var currentRightSideSum = 0
        loop@ for (i in 1 until incrementalArray.size) {
            //RightSide without current value
            currentRightSideSum = incrementalArray[incrementalArray.size - 1] -
                    incrementalArray[i]
            if (incrementalArray[i - 1] == currentRightSideSum ||
                incrementalArray[i - 1] == incrementalArray[incrementalArray.size - 1]
            ) {
                return "YES"
            }
        }
        return "NO"

    }

    fun main(args: Array<String>) {
        val T = readLine()!!.trim().toInt()

        for (TItr in 1..T) {
            val n = readLine()!!.trim().toInt()

            val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

            val result = balancedSums(arr)

            println(result)
        }
    }


}

