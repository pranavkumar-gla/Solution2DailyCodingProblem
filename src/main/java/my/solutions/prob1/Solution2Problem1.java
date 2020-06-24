package my.solutions.prob1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2Problem1 {

    //create a function, pass number list & goldenNo. this returns true if goldenNo can be achieved by adding numbers in the list
    public Boolean haveGolden(int[] numbers, int goldenNo){

        Set<Integer> setOfNumbers = new HashSet<Integer>();

        for (int number:numbers) {
            if (setOfNumbers.contains(goldenNo-number)) //we are assuming goldenNo is > all no
                return true;
            setOfNumbers.add(number);
        }
        return false;
    }

}
