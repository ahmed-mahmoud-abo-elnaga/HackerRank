/*
        Problem: https://www.hackerrank.com/challenges/minimum-loss
        Kotlin Language Version
        Tool Version : Android Studio
        Initial Thoughts: We can sort the array to reduce the number of comparisons since
                  we know that the absolute difference is always smallest between
                  adjacent elements in a sorted array. Then because we have the
                  stipulation that we must buy the house before we can sell it
                  we should verify that the buy price we are using is a price
                  that occurred in a year prior to the sell price year. We can
                  accomplish this by using a map that will be at most size n and
                  will store distinct key,value pairs where the key is the price
                  and the value is the year.

        Time Complexity: O(n log(n)) //We must sort the input array
        Space Complexity: O(n) //We use a map to store the price,year pairs*/

object Main {

    /*
 * Complete the 'minimumLoss' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts LONG_INTEGER_ARRAY price as parameter.
 */

    fun minimumLoss(price: Array<Long>): Int {
        // create hashmap to save item index
        val indices: HashMap<Long, Int> = HashMap()
        price.forEachIndexed { index, item ->
            indices.put(item, index)
        }
        // sort Array Quick sort
        price.sort()

        var minLoss = Long.MAX_VALUE
        for (i in 0..price.size - 2) {
            // lose between two item
            val loss = price[i + 1] - price[i]

            if (loss < minLoss && (indices.getValue(price[i]) > indices.getValue(price[i + 1])))
                minLoss = loss
        }
        return minLoss.toInt()
    }

    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val price = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

        val result = minimumLoss(price)

        println(result)
    }

}

