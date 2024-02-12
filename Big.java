import java.util.Arrays;
public class Big {
    public Integer findBiggestNumber(Object[] numbers) {
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
    public static void main(String[] args) {
        Big find = new Big();

        Object[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println("Biggest number in numbers1: " + find.findBiggestNumber(numbers1));

        Object[] numbers2 = {5, 4, 3, 2, 1};
        System.out.println("Biggest number in numbers2: " + find.findBiggestNumber(numbers2));

        Object[] numbers3 = {1, "two", 3, "four", 5};
        try {
            System.out.println("Biggest number in numbers3: " + find.findBiggestNumber(numbers3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}