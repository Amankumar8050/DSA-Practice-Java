/*
Problem: Red Light, Green Light
Platform: CodeChef
Pattern: Observation + Counting
Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;

            for (int i = 0; i < N; i++) {
                int h = sc.nextInt();

                if (h > K) {
                    count++;
                }
            }

            System.out.println(count);
            T--;
        }
    }
}
