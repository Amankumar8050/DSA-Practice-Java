/*
Problem: Chef and Video Compression
Platform: CodeChef
Pattern: Array + Group Counting + Observation
Approach:
- Consecutive equal elements form one group.
- Each group can be compressed into exactly one frame.
- Therefore, the answer is the number of consecutive distinct groups.

Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int groups = 1;

            for (int i = 1; i < N; i++) {
                if (A[i] != A[i - 1]) {
                    groups++;
                }
            }

            System.out.println(groups);
        }
    }
}  
