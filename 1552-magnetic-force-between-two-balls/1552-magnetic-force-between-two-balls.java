class Solution {
    static boolean isValidAnswer(int[] position, int m, int minDst) {
        int ballCount = 1;
        int lastPosition = 0;

        for (int i = 0 ; i < position.length; i++) {
            if (position[i] - position[lastPosition] >= minDst) {
                ballCount++;
                lastPosition = i;

                if (ballCount == m) {
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s = 0 ;
        int e = position[n - 1] - position[0];
        int ans = -1 ; 

        while (s <= e) {
            int mid = s + (e - s ) / 2 ;

            if (isValidAnswer(position,m,mid)) {
                ans = mid ;
                s = mid + 1;
            }else {
                e = mid - 1 ;
            }
        }
        return ans ;
    }
}