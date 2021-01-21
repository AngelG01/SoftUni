import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        for(int number: numbers){
            System.out.print(number+ ", ");
        }*/
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputArray[1]);
                    if (index >= 0 && index < numbers.length) {
                        exchangeArray(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (inputArray[1].equals("odd")) {
                        System.out.println(findMAxOddElementIndex(numbers));
                    } else {
                        System.out.println(findMaxEvenElementIndex(numbers));
                    }
                    break;
                case "min":
                    if (inputArray[1].equals("odd")) {
                        System.out.println(findMinOddElementIndex(numbers));
                    } else {
                        System.out.println(findMinEvenElementIndex(numbers));
                    }

                    break;
                case "first":
                    int countFirst = Integer.parseInt(inputArray[1]);
                    if (countFirst > numbers.length) {
                        System.out.println("Invalid count ");
                    } else if (inputArray[2].equals("odd")) {
                        //method
                    } else {
                        // method
                    }

                    break;
                case "last":
                    int countLast = Integer.parseInt(inputArray[1]);
                    if (countLast > numbers.length) {
                        System.out.println("Invalid count ");
                    } else if (inputArray[2].equals("odd")) {
                        //method
                    } else {
                        // method
                    }
                    break;
            }

            input = scan.nextLine();

        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void exchangeArray(int[] array, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[array.length - (index + 1)];
        for (int i = 0; i < index; i++) {
            first[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            second[i - (index + 1)] = array[i];
        }
        for (int i = 0; i < second.length; i++) {
            array[i] = second[i];
        }
        for (int i = 0; i < first.length; i++) {
            array[i + second.length] = first[i];
        }
    }

    private static int findMAxOddElementIndex(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= maxElement) {
                maxElement = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxEvenElementIndex(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxElement) {
                maxElement = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinOddElementIndex(int[] array) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] <= minElement) {
                minElement = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinEvenElementIndex(int[] array) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= minElement) {
                minElement = array[i];
                index = i;
            }
        }
        return index;
    }
    private static void printLastEven (int[] array, int count){
        int[] numbers = new int[array.length];
        for (int i = array.length-1; i >= 0 ; i--) {
if (array[i]%2 == 0){
    numbers[i] = array[i];
    count--;
}
        }
    }
}
