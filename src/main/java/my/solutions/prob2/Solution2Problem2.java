package my.solutions.prob2;

import java.util.Arrays;

public class Solution2Problem2 {

    //create a function that takes an array and out put an array of product
    public int[] getProduct(int[] numbers){

        int[] outList = new int[numbers.length];
        //calculate the product of array
        int productOfNumbers = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);

        int i=0;
        for (int number:numbers) {
            outList[i++]=productOfNumbers/number;
        }

        //System.out.println(Arrays.toString(outList));
        return outList;
    }


}
