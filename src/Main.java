public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = generateRandomArray();
        //task 1

        int sum = 0;
        for ( int i = 0; i < arr.length; i++) {
            sum = +arr[i];
        }
        System.out.printf( "Сумма трат за месяц составила %s рублей ",sum );
        System.out.println();

        //task 2

        int minWaste = arr[0];
        int maxWaste = arr[0];
        for (  int i = 1; i < arr.length; i++) {
            if (minWaste > arr[i]) {
                minWaste = arr[i];
            } else if (maxWaste < arr[i]) {
                maxWaste = arr[i];
            }
        }

        System.out.printf(" Минимальная сумма трат за день составила %s рублей.", minWaste );
        System.out.println();
        System.out.printf(" Максимальная сумма трат за день составила %s рублей.", maxWaste);
        System.out.println();


        //Task 3
        double spendingAverage = (double) sum /arr.length;
        System.out.printf( " Средняя сумма трат за месяц составила %s рублей " , spendingAverage);
        System.out.println();

        //Task 4
        char[] reversFulName =  { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reversFulName.length - 1; i >= 0;i-- ) {
            System.out.print( reversFulName[i]);

        }



        {
        }


    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
