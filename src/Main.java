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

        for (int i : inputArray1) {
            sum += i;

            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
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
            double outputArray[] = new double[inputArray2.length];
            int counetr = 0;
            for (int i : inputArray2) {
                outputArray[counetr] = (double) i * 0.13;
                counetr++;
                //System.out.println("Значения индекса " + i + " для массива inputArray2 = " + Arrays.toString(inputArray2));
            }
            System.out.println("Значения индексов массива outputArray = " + Arrays.toString(outputArray));

        System.out.println("Задача 3");
        int[] inputArray3 = {3000, 4000, 5000, 6000, 7000}; // массив с 5 целыми числами
        boolean outputArray3[] = new boolean[inputArray3.length];
        int num = 0;
        for (int i : inputArray3) {
            if (inputArray3[num] > 5000) {
                outputArray3[num] = true;
            }
            num++;
        }
        System.out.println("Значения индексов массива inputArray3 = " + Arrays.toString(inputArray3));
        System.out.println("Значения индексов массива outputArray3 = " + Arrays.toString(outputArray3));

        System.out.println("Задача 4");
        int[] inputArray4 = {-5}; // массив с 1 целыми числами
        boolean[] outputArray4 = new boolean[inputArray4.length];
        num = 0;
        for (int i : inputArray3) {
            if (inputArray4[num] < 0) {
                break;
            } else {outputArray4[num] = true;};
        }
        System.out.println("Значения индексов массива inputArray3 = " + Arrays.toString(inputArray4));
        System.out.println("Значения индексов массива outputArray3 = " + Arrays.toString(outputArray4));

        System.out.println("Задача 5");
        int[] inputArray5 = {5000}; // массив с 5 целыми числами
        boolean[] outputArray5 = new boolean[inputArray5.length];
        int happiMonth = 0;
        num = 0;
        for (int i : inputArray5) {
            if (inputArray5[num] > 0){
                outputArray5[num] = true;
                happiMonth++;
            }
            num++;
        }
        System.out.println("Значения индексов массива inputArray5 = " + Arrays.toString(inputArray5));
        System.out.println("Значения индексов массива outputArray5 = " + Arrays.toString(outputArray5));
        System.out.println("Количество месяцев с положительной прибылью = " + happiMonth);
    }
}