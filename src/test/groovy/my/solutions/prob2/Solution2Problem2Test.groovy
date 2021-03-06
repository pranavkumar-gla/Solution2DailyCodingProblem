package my.solutions.prob2

import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertArrayEquals;

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

        //below 3 lines can be removed
        def productList = new int[numbers.length]
        productList = solution2Problem2.getProduct(numbers)
        println(productList)

        assertArrayEquals([120, 60, 40, 30, 24] as int[], solution2Problem2.getProduct(numbers))
    }

    @Test (expected = ArithmeticException.class)
    void "The method throws an exception if the digit overflow int"(){
        def numbers = [1, 2, 3, 4, 5955146588160L ] as int[]
        println(numbers)

        //below 3 lines can be removed
        solution2Problem2.getProduct(numbers)
    }

}
