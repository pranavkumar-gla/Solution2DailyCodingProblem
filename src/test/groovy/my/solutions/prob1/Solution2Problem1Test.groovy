package my.solutions.prob1

import org.junit.Before
import org.junit.Test

class Solution2Problem1Test{

    Solution2Problem1 solution2Problem1
    @Before
    void setup(){
        solution2Problem1 = new Solution2Problem1()
    }

    @Test
    void "The test must return true with valid list"(){

        def goldenNo = 17
        def numbers = [10, 15, 3, 7] as int[]
        //if we do not declare the type with square braces [] groovy will create list instead of array. {ex: def numbers = [1,2,3,4]}

        assert solution2Problem1.haveGolden(numbers,goldenNo) == true

    }

    @Test
    void "The test must return false with valid list"(){

        def goldenNo = 19
        def numbers = [10, 15, 3, 7] as int[]
        //if we do not declare the type with square braces [] groovy will create list instead of array. {ex: def numbers = [1,2,3,4]}

        assert solution2Problem1.haveGolden(numbers,goldenNo) == false


    }
}



