class Solution {
    public String reverseWords(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        // Split the string into words
        // \\s+ handles multiple spaces
        String[] words = s.split("\\s+");

        // Build the answer from right to left
        StringBuilder answer = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            answer.append(words[i]);

            // Add space between words
            if (i > 0) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}