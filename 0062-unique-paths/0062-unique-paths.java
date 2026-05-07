// Bottom-Up Approach (Space Optimized)
class Solution {
    public int uniquePaths(int m, int n) {
        int[] prev = new int[n];

        // Pehli row mein sab cells ka answer 1 hai
        for(int j = 0; j < n; j++) 
            prev[j] = 1;

        // Baaki rows ke liye calculate karo
        for(int i = 1; i < m; i++){
            int[] curr = new int[n];
            curr[0] = 1;  // Pehle column ka answer hamesha 1
            
            for(int j = 1; j < n; j++){
                // Current cell = upar se + left se
                curr[j] = prev[j] + curr[j-1];
            }
            prev = curr;  // Current ko prev bana do
        }
        return prev[n-1];
    }
}