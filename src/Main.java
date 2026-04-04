import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] inputArray1 = {1, 2, 3, 4, 5}; // массив с 5 целыми числами

        // переменные для поиска значений
        int sum = 0;// сумма
        int max = inputArray1[0]; // начинаю перебор с первого индекса массива
        int min = inputArray1[0];
        double avg = inputArray1[0];

        for (int i = 0; i < inputArray1.length; i++) {
            sum = sum + inputArray1[i];

            if (inputArray1[i] > max) {
                max = inputArray1[i];
            }
            if (inputArray1[i] > min) {
                min = inputArray1[i];
            }
        }
        avg = (double) sum / inputArray1.length;
        Object[] outputArray1 = {sum, max, min, avg}; // задан Object, так как такой массив с вычислениями на деление
        // не может содержать целочисленные значения
        System.out.println("Значения индексов массива inputArray1 = " + Arrays.toString(inputArray1));
        System.out.println("Значения индексов массива в порядке [сумма, максимум, минимум, среднее]");
        System.out.println("Значения индексов массива outputArray1 = " + Arrays.toString(outputArray1));

        System.out.println("Задача 2");
        int[] inputArray2 = {10, 20, 30, 40, 50}; // массив с 5 целыми числами
        Object[] outputArray = new Object[5];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray[i] = (float) inputArray2[i] * 0.13;
            //System.out.println("Значения индекса " + i + " для массива inputArray2 = " + Arrays.toString(inputArray2));
        }
        System.out.println("Значения индексов массива outputArray = " + Arrays.toString(outputArray));

        System.out.println("Задача 3");
        int[] inputArray3 = {3000, 4000, 5000, 6000, 7000}; // массив с 5 целыми числами
        boolean[] outputArray3 = new boolean[5];

        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;
            }
        }
        System.out.println("Значения индексов массива inputArray3 = " + Arrays.toString(inputArray3));
        System.out.println("Значения индексов массива outputArray3 = " + Arrays.toString(outputArray3));

        System.out.println("Задача 4");
        int[] inputArray4 = {3000, 4000, -5000, 6000, 7000}; // массив с 5 целыми числами
        boolean[] outputArray4 = new boolean[5];

        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray4[i] < 0) {
                break;
            } else {outputArray4[i] = true;};
        }
        System.out.println("Значения индексов массива inputArray3 = " + Arrays.toString(inputArray4));
        System.out.println("Значения индексов массива outputArray3 = " + Arrays.toString(outputArray4));

        System.out.println("Задача 5");
        int[] inputArray5 = {3000, 4000, -5000, 6000, 7000}; // массив с 5 целыми числами
        boolean[] outputArray5 = new boolean[5];
        int happiMonth = 0;
        for (int i = 0; i < inputArray5.length; i++) {
            if (inputArray5[i] > 0){
                outputArray5[i] = true;
                happiMonth++;
            }
        }
        System.out.println("Значения индексов массива inputArray5 = " + Arrays.toString(inputArray5));
        System.out.println("Значения индексов массива outputArray5 = " + Arrays.toString(outputArray5));
        System.out.println("Количество месяцев с положительной прибылью = " + happiMonth);
    }
}