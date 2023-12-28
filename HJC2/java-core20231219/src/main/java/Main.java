import Tools.Tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую (Пример: 2,1,2,3,4): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i].trim());
        }

        int evenCount = Tools.countEvens(numbers);
        int maxMinDiff = Tools.maxMinDifference(numbers);
        boolean adjacentZeros = Tools.hasAdjacentZeros(numbers);

        System.out.println("Для массива: [" + input + "] " + evenCount + " четных числа, разница между Max и Min чисел массива = " + maxMinDiff + ", " + (adjacentZeros ? "true: нолей подояд нет" : "false: есть идущие подряд ноли"));
    }
}
