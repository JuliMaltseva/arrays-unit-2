import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//отработка материала с видеоурока
        System.out.println("отработка материала с видеоурока");

        int[] newArr = {1, 2, 3};
        int[] newArrCopy = newArr;

        int[] numberOfWorkingDaysPerYear2023PerMonth = {17, 18, 22, 20, 20, 21, 21, 23, 21, 22, 21, 21};
        System.out.println(numberOfWorkingDaysPerYear2023PerMonth.length);
        int[] numberOfWorkingDaysPerYear2022PerMonth = {16, 19, 22, 21, 18, 21, 21, 23, 22, 21, 21, 22};

        boolean arraysAreEqual = true;
        arraysAreEqual = numberOfWorkingDaysPerYear2022PerMonth == numberOfWorkingDaysPerYear2023PerMonth;
        if (arraysAreEqual) {
            for (int i = 0; i < numberOfWorkingDaysPerYear2023PerMonth.length; i++) {
                if (numberOfWorkingDaysPerYear2023PerMonth[i] != numberOfWorkingDaysPerYear2022PerMonth[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые!");
        } else {
            System.out.println("Массивы разные!");
        }

        int minWorkingDays2023 = 31; // больше 31 дня в месяце не м.б.
        for (int i = 0; i < numberOfWorkingDaysPerYear2023PerMonth.length; i++) {
            if (numberOfWorkingDaysPerYear2023PerMonth[i] < minWorkingDays2023) {
                minWorkingDays2023 = numberOfWorkingDaysPerYear2023PerMonth[i];
            }
        }
        System.out.println(minWorkingDays2023);

        for (final int month : numberOfWorkingDaysPerYear2023PerMonth) {
            if (month < minWorkingDays2023) {
                minWorkingDays2023 = month;
            }
        }
        System.out.println(minWorkingDays2023);

        float[] dollarToRubleExchangeRate = {75.77f, 76.05f, 104.68f, 79.09f, 65.79f, 56.98f, 57.83f, 60.36f, 60.12f, 61.36f, 60.58f, 62.38f,};
        for (int i = 0; i < dollarToRubleExchangeRate.length - 1; i++) {
            System.out.println(dollarToRubleExchangeRate[i + 1] - dollarToRubleExchangeRate[i]);
        }

        int[] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " ");
        }

        int[] arr2 = new int[3]; // Объявляем массив на 3 элемента, заполняем значениями 1, 2 и 3
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        int[] arr3 = new int[3]; // Объявляем второй массив на 3 элемента, заполняем значениями 1, 2 и 3
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        boolean arraysEqual = true;
        if (arr3.length != arr3.length) {
            arraysEqual = false;
        } else {
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] != arr3[i]) {
                    arraysEqual = false;
                    break;
                }
            }
        }
        System.out.print("Массивы ");
        if (!arraysEqual) {
            System.out.print(" не ");
        }
        System.out.println("равны");

        int[] arr4 = new int[2];
        arr4[0] = 1;
        arr4[1] = 2;
        System.out.println(Arrays.toString(arr4)); // печать массива через метод

        int[] arr5 = new int[10];
        Arrays.fill(arr5, 1); // Первым параметром передаем массив, вторым — значение, которым его нужно заполнить
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[2];
        arr6[0] = 1;
        arr6[1] = 2;
        int[] arr7 = new int[2];
        arr7[0] = 1;
        arr7[1] = 2;
        System.out.println(Arrays.equals(arr6, arr7)); // сравнение массивов через метод

        int[] arr8 = new int[2];
        arr7[0] = 1;
        arr7[1] = 2;
        int[] arr9 = Arrays.copyOf(arr7, arr7.length); //Первым параметром идет сам массив, вторым — кол-во эл-в, кот. нужно скопировать в новый массив

        int[] arr10 = new int[2];
        arr10[0] = 2;
        arr10[1] = 1;
        Arrays.sort(arr10); // сортировка массива
        System.out.println(Arrays.toString(arr10));

        char[][] gameField = new char[3][3];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                System.out.print(gameField[j][i] + " ");
            }
            System.out.println();
        }


    }
}
