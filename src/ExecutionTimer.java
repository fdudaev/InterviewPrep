public class ExecutionTimer {
    public static long[] monitorExecutionTime(long[] a, int index, int count) {

        int counter = 0;
        while (counter < count) {

            long startTime = System.nanoTime();

            a[index] = 2;
            counter++;

            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;

            System.out.println("loop " + counter + " was execution in : " + totalTime + " nano seconds");

        }
        return new long[]{};
    }

    public static void main(String[] args) {

        long[] a = new long[500000000];

        monitorExecutionTime(a, 50000009, 3);

    }
}