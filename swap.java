import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of snacks

            int[] A = new int[N]; // Tastiness
            int[] B = new int[N]; // Sugar

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int maxSatisfaction = Integer.MIN_VALUE;

            // Try all subsets
            int totalComb = 1 << N; // 2^N subsets

            for (int mask = 0; mask < totalComb; mask++) {
                int sugar = 0;
                int taste = 0;
                for (int i = 0; i < N; i++) {
                    if ((mask & (1 << i)) != 0) {
                        sugar += B[i];
                        taste += A[i];
                    }
                }
            if (sugar <= 10) {
                    maxSatisfaction = Math.max(maxSatisfaction, taste);
                }
            }

            System.out.println(maxSatisfaction);
      }
	}
}
