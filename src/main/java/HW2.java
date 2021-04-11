import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {

        // Ep1
        System.out.println("\t         ---------- Задание 1 ------------  \t");
        int[] nums = {1, 0, 0, 1, 0, 0, 1};

        System.out.println("Начальный вариант:    \t" + Arrays.toString(nums));
        invertor(nums);
        System.out.println("Обработанный вариант: \t" + Arrays.toString(nums));

        //Ep2
        System.out.println("\t \t \t ---------- Задание 2 ------------  \t");
        int[] pusherArr = new int[10];
        pusher(pusherArr);
        System.out.println("В массив напихали такие значения : " + Arrays.toString(pusherArr));

        // Ep3
        System.out.println("\t \t \t ---------- Задание 3 ------------  \t");
        int[] massX = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходнный вариант:    \t" + Arrays.toString(massX));
        x2(massX);
        System.out.println("Обработанный вариант: \t" + Arrays.toString(massX));

        //Ep4
        System.out.println("\t \t \t ---------- Задание 4 ------------  \t");
        final int wall = 10;
        int[][] array4 = new int[wall][wall];
        diagonali(array4);
        for (int i = 0; i < array4.length; i++) {
            for (int y = 0; y < array4.length; y++) {
                System.out.print(array4[i][y] + "  ");

            }
            System.out.println();
        }

        // Ep5
        System.out.println("\t \t \t ---------- Задание 5 ------------  \t");
        int[] balance = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Maximum:    \t" + findMax(balance));
        x2(balance);
        System.out.println("Minimum:    \t" + findMin(balance));

        // Ep6
        System.out.println("\t \t \t ---------- Задание 6 ------------  \t");
        int[] array6 = {1, 5, 3, 2, 2, 4, 5, 2, 4, 3, 9, 1};
        int[] array61 = {1, 2, 3, 2, 0, 4, 5, 2, 4, 0, 3, 1};
        int[] array62 = {1, 5, 3, 2, 1, 4, 5, 2, 4, 2, 2, 1};
        int[] array63 = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1};

        System.out.println("Проверяем баланс первого массива:    \t" + Arrays.toString(array6) + balance6(array6));
        System.out.println("Проверяем баланс второго массива:    \t" + Arrays.toString(array61) + balance6(array61));
        System.out.println("Проверяем баланс третьего массива:   \t" + Arrays.toString(array62) + balance6(array62));
        System.out.println("Проверяем баланс четвёртого массива: \t" + Arrays.toString(array63) + balance6(array63));


        // Ep7
        System.out.println("\t \t \t ---------- Задание 7 ------------  \t");
        int[] kucha = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходнный массив :    \t" + Arrays.toString(kucha));
        buldozer(kucha, 2);
        System.out.println("Сдвиг массива + 2:    \t" + Arrays.toString(kucha));
        buldozer(kucha, -4);
        System.out.println("Сдвиг массива - 4:    \t" + Arrays.toString(kucha));


    }




    private static void invertor(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (array[i]  == 0) ? 1 : 0;

    }

    private static void pusher (int[] array2) {
        for (int i = 0; i < array2.length; i++)
            array2[i] = 1 + i * 3;
    }

    private static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
            }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (i < min) {
                min = array[i];

            }
        return min;
    }


    private static void x2 (int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;

    }

    private static void diagonali( int [][] array) {
        int x, y;
        for (x = 0, y = array.length - 1; x < array.length; x++, y--){
            array[x][y] = 1;
            array[x][x] = 1;

        }

    }

    private static boolean balance6 (int[] array) {
        int sideA = 0;
        int sideB = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sideB += array[i];
            for (int y = i + 1; y < array.length; y++)
                sideA += array[y];
            if (sideB == sideA) return true;
            sideA = 0;
        }
        return false;
    }


    private static void buldozer (int[] array, int distance) {
        boolean vektor = distance < 0;
        if (vektor) distance = -distance;
        distance %=array.length;
        int konec = array.length -1;
        for (int i = 0; i < distance; i++) {
            int temp = (vektor) ? array[0] : array[konec];
            for (int y = 0; y <  konec; y++) {
            if (vektor) array [y] = array[y + 1];
            else array[konec - y] = array[konec - y -1];
            }
            if (vektor) array[konec] = temp;
            else array[0] = temp;
        }

    }


}



