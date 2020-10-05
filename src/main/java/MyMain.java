import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] arr = new int[11];
        int roll = 0;
        for (int j = 1; j <= n; j++) {
            roll = rollDie() + rollDie();
            for (int k = 2; k <= 12; k++) {
                if (roll == k) {
                    arr[k-2]++;
                }
                else {
                    continue;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pairs of dice would you like to roll?");

        for (int i = 0; i < sumOfTwoDice(Integer.parseInt(scan.next())).length; i++) {
            System.out.print(sumOfTwoDice(Integer.parseInt(scan.next()))[i] + " ");
        } 

        scan.close();
    }
}
