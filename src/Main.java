public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задача 1

        int[] arr = generateRandomArray();
        int summa = 0;

        for (int elm : arr) {
            summa += elm;
        }
        System.out.println("Сумма трат за месяц составила:" + summa + " рублей");

        // Задача 2

        int minimal = arr[0];
        int maximum = arr [0];


        for (int i=0;i<arr.length;i++){
            if (arr[i]<minimal){
                minimal=arr[i];
            }
            if (arr[i]>maximum){
                maximum = arr[i];

            }
        }
        System.out.println("Минимальная сумма затрат составила " + minimal + " рублей");
        System.out.println("Максимальная сумма затрат составила " + maximum + " рублей");

        // Задача 3

        System.out.println("Средняя сумма трат за месяц составила: " + (float)summa/arr.length);

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i=reverseFullName.length-1;i>=0;i--);

        System.out.print(reverseFullName[i]);
    }
}