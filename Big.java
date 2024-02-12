/**
 * The "Big" class is a Java class that finds the biggest number in an array of numbers.
 */
import java.util.Arrays;
public class Big {
    public Integer findBiggestNumber(Object[] numbers) {
    // The code is defining a method called `findBiggestNumber` that takes an array of objects
    // (`numbers`) as a parameter and returns the biggest number in the array.
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        Integer biggestNumber = null;
        for (Object number : numbers) {
            if (!(number instanceof Number)) {
                throw new IllegalArgumentException("Array contains a non-number element: " + number);
            }
            int currentNumber = ((Number) number).intValue();
            if (biggestNumber == null || currentNumber > biggestNumber) {
                biggestNumber = currentNumber;
            }
        }
  return biggestNumber;
    }
// The `public static void main(String[] args)` method is the entry point of the Java program. It is
// the method that is executed when the program is run.
    public static void main(String[] args) {
        Big find = new Big();
// The code is creating an array `numbers1` that contains a sequence of numbers. It then calls the
// `findBiggestNumber` method with `numbers1` as the argument. The `findBiggestNumber` method iterates
// through the array and finds the biggest number in the array. In this case, the biggest number in
// `numbers1` is 5. The code then prints the result by concatenating the string "Biggest number in
// numbers1: " with the result of the `findBiggestNumber` method.

        Object[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println("Biggest number in numbers1: " + find.findBiggestNumber(numbers1));

// The code is creating an array `numbers2` that contains a sequence of numbers in descending order. It
// then calls the `findBiggestNumber` method with `numbers2` as the argument. The `findBiggestNumber`
// method iterates through the array and finds the biggest number in the array. In this case, the
// biggest number in `numbers2` is 5. The code then prints the result by concatenating the string
// "Biggest number in numbers2: " with the result of the `findBiggestNumber` method.
        Object[] numbers2 = {5, 4, 3, 2, 1};
        System.out.println("Biggest number in numbers2: " + find.findBiggestNumber(numbers2));

// The code is creating an array `numbers3` that contains a mix of numbers and strings. It then calls
// the `findBiggestNumber` method with `numbers3` as the argument. Since the `findBiggestNumber` method
// expects an array of numbers, it throws an `IllegalArgumentException` when it encounters a non-number
// element in the array. The code uses a try-catch block to catch the exception and prints an error
// message along with the exception message.
        Object[] numbers3 = {1, "two", 3, "four", 5};
        try {
            System.out.println("Biggest number in numbers3: " + find.findBiggestNumber(numbers3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}