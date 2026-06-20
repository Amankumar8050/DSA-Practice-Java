/*
Problem: Largest and Second Largest
Platform: CodeChef
Pattern: Array + Single Pass Traversal + Tracking Maximums
Approach:
- The problem asks for the maximum sum of two DISTINCT integers.
- Maintain two variables:
    1. largest        -> stores the largest element so far.
    2. secondLargest  -> stores the second largest distinct element.
- Traverse the array only once:
    a) If the current element is greater than largest:
         - Update secondLargest to previous largest.
         - Update largest to current element.
    b) Else if the current element is greater than secondLargest
       and is not equal to largest:
         - Update secondLargest.
- Finally, print (largest + secondLargest).

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

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {

                int x = sc.nextInt();

                if (x > largest) {
                    secondLargest = largest;
                    largest = x;
                }
                else if (x > secondLargest && x != largest) {
                    secondLargest = x;
                }
            }

            System.out.println(largest + secondLargest);
        }
    }
}
