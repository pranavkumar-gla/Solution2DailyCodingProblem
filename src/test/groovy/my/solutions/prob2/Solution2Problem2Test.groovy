package my.solutions.prob2

import org.junit.Before
import org.junit.Test

class Solution2Problem2Test{

    Solution2Problem2 solution2Problem2
    @Before
    void setup(){
        solution2Problem2 = new Solution2Problem2()
    }

    @Test
    void "The test must return true with valid list"(){
        def numbers = [1, 2, 3, 4, 5] as int[]
        println(numbers)
        def productList = new int[numbers.length]

        productList = solution2Problem2.getProduct(numbers)
        println(productList)
    }



    }
