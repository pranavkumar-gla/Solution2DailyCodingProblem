package my.solutions.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2Problem2 {

    //create a function that takes an array and out put an array of product
    public int[] getProduct(int[] numbers){

        int[] outList = new int[numbers.length];
        //calculate the product of array
        //int productOfNumbers = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);

        List<Integer> list = Arrays.stream(numbers)	// IntStream
                                    .boxed()  		// Stream<Integer>
                                    .collect(Collectors.toList());
        int productOfNumbers = list.stream().mapToInt(num->num).reduce(1, Math::multiplyExact);


        int i=0;
        for (int number:numbers) {
            outList[i++]=productOfNumbers/number;
        }

        //System.out.println(Arrays.toString(outList));
        return outList;
    }


}
