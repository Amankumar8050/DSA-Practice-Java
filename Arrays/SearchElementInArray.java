/*
Problem: Search an element in an array
Platform: CodeChef
Topic: Arrays, Linear Search
Time Complexity: O(N)
Space Complexity: O(1)
*/

public class SearchElementInArray {

    public static String solve(int N, int X, int[] A) {
        for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                return "YES";
            }
        }
        return "NO";
    }
}
