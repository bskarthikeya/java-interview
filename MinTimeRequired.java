package com.walmart.karthik.test;

import java.io.IOException;
import java.util.Scanner;

public class MinTimeRequired {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minTime function below.
    static long minTime(long[] machines, long goal) {

        float dayOutput = 0f;
        for (int i = 0; i < machines.length; i++) {
            dayOutput = dayOutput + (1 / (float)machines[i]);
        }
        System.out.println("Daily Output of all Machines = " + dayOutput);
        long day = 1;
        float output = 0;
        while (output <= goal) {
            output = day * dayOutput;
            System.out.println("Day = " + day + " Output = " + output);
            if (output >= goal)
                break;
            else
                day++;
        }
        return day;

    }

    public static void main(String[] args) throws IOException {

        String[] nGoal = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nGoal[0]);

        long goal = Long.parseLong(nGoal[1]);

        long[] machines = new long[n];

        String[] machinesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long machinesItem = Long.parseLong(machinesItems[i]);
            machines[i] = machinesItem;
        }

        long ans = minTime(machines, goal);

        System.out.println(ans);

        scanner.close();
    }
}
