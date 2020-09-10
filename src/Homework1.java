public class Homework1 {

    public static int fact ( int n){
        if (n == 1)
            return 1;

        else
            return n * fact(n - 1);
    }
    //вывести таблицу умножения на экран - 1б
    //подсказка - использовать двойной for
    public static void table () {
        for (int i = 1; i <= 9; i++) {
            for (int q = 1; q <= 9; q++) {
                System.out.println(i + "*" + q + "=" + i * q);
            }
        }

    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5б
    //для любого числа - 1б
    //подсказка - в случае для любого числа используйте while
    public static int sum ( int n){
        if (n == 0) return 0;
        else return n % 10 + sum(n / 10);


    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5б
    public static boolean isLeapYear ( int year){
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5б
    public static int daysInYear ( int year){
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1б
    public static int dayOfTheWeek (String n){
        if (n == "Понедельник") return 1;
        if (n == "Вторник") return 2;
        if (n == "Среда") return 3;
        if (n == "Четверг") return 4;
        if (n == "Пятница") return 5;
        if (n == "Суббота") return 6;
        if (n == "Воскресенье") return 7;

        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5б
    public static void printArray ( int[] array){
        System.out.print('[');
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "] \n");
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5б
    public static void printArray ( int[][] array){


        for (int[] ints : array) {
            System.out.print('[');
            for (int i = 0; i < ints.length - 1; i++) {
                System.out.print(ints[i] + ", ");
            }
            System.out.print(ints[ints.length - 1] + "] \n");
        }


    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1б
    public static int[] sort ( int[] array){
        int c;


        for (int q = 0; q < array.length; q++)
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    c = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = c;
                }
            }


        return array;
    }


    //здесь можете тестировать свои решения
    public static void main (String[]args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1, 5, 3, 7, 10, 2, 5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1, 5, 3, 7, 10, 2, 5}, {1, 5, 3, 7, 10, 2, 5}};
        printArray(array2D);
    }



}
