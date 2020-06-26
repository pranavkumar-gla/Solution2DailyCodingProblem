Dated: 25/June/2020.
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?

TO DO:
1. Get in-depth of reduce function in java8
2. better iterate over list/array with lamda expression.
3. What is the difference in below? why mapToInt() was applicable for later only?
    a. Arrays.stream(numbers)
    b. List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
4. if digits are big, int(primitive) would get overflow exception. Good to use bigInteger. (Ref2)           

Reference:
https://docs.oracle.com/javase/tutorial/collections/streams/reduction.html#reduce
https://stackoverflow.com/questions/36833932/how-to-multiply-values-in-a-list-using-java-8-streams 