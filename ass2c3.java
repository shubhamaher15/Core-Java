import java.util.*;
class Cricket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no of cricketr data? ");
        int n = sc.nextInt();

        // Arrays to store player data
        int[] pid = new int[n];
        String[] pname = new String[n];
        int[] totalRuns = new int[n];
        int[] innings = new int[n];
        int[] notOut = new int[n];
        float[] average = new float[n];

        // Accept player details
        for (int i = 0; i < n; i++) {
            System.out.println("\nPlayer " + (i + 1) + " ka data:");
            System.out.print("PID: ");
            pid[i] = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Name: ");
            pname[i] = sc.nextLine();

            System.out.print("Total Runs: ");
            totalRuns[i] = sc.nextInt();

            System.out.print("Innings Played: ");
            innings[i] = sc.nextInt();

            System.out.print("Not Out Times: ");
            notOut[i] = sc.nextInt();

            // Calculate dismissals and average
            int dismissals = innings[i] - notOut[i];
            if (dismissals == 0) {
                average[i] = totalRuns[i]; // Avoid divide by zero
            } else {
                average[i] = (float) totalRuns[i] / dismissals;
            }
        }

        // Find player with max average
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (average[i] > average[maxIndex]) {
                maxIndex = i;
            }
        }

        // Display player with max average
        System.out.println("\n Player with Maximum Batting Average:");
        System.out.println("PID: " + pid[maxIndex]);
        System.out.println("Name: " + pname[maxIndex]);
        System.out.println("Total Runs: " + totalRuns[maxIndex]);
        System.out.println("Innings Played: " + innings[maxIndex]);
        System.out.println("Not Out Times: " + notOut[maxIndex]);
        System.out.printf("Batting Average: %.2f\n", average[maxIndex]);
    }
}
