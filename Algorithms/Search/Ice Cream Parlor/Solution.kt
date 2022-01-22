/*
        Problem: https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem
        Kotlin Language Version
        Tool Version : Android Studio
        Thoughts (Key points in algorithm):
        Keep track of the index and the complement value
        in a hasmap and as we can our input, check if we
        see a complement
        if we do see one then just print out its' index
        and our current index


        Time complexity: O(n)    //The number of flavors we have to look at
        Space complexity: O(n)   //The number of flavors we store the complement of
*/

object Main {

    fun whatFlavors(cost: Array<Int>, money: Int): Unit {
        var mapOfCost: HashMap<Int, Int> = HashMap()
        loop@ for (i in 0 until cost.size) {
            if (mapOfCost.containsKey(cost[i])) {
                println("${mapOfCost.get(cost[i])} ${i + 1}")
                break@loop
            }
            mapOfCost.put(money - cost[i], i + 1)
        }
    }

    fun main(args: Array<String>) {
        val t = readLine()!!.trim().toInt()

        for (tItr in 1..t) {
            val money = readLine()!!.trim().toInt()

            val n = readLine()!!.trim().toInt()

            val cost = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

            whatFlavors(cost, money)
        }
    }

}

