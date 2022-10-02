package school.mjc.stage0.loops.task3;

public class RangeSum {


    public static void main(String[] args) {
        printSumInclusive(10,10);
    }







    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum=0;
        for (int i = firstBoarder; i <=secondBoarder ; i++) {
            sum+=i;

        }
        System.out.println(sum);
    }


}
