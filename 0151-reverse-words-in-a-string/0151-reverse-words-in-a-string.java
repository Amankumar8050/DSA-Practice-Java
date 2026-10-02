class Solution {
    public String reverseWords(String s) {

        // Step 1: Remove spaces from beginning and end
        s = s.trim();

        // Step 2: Divide the string into words
        String[] words = s.split("\\s+");

        // Step 3: Create a StringBuilder to store the answer
        StringBuilder answer = new StringBuilder();

        // Step 4: Start from the LAST word
        for (int i = words.length - 1; i >= 0; i--) {

            // Take the current word
            String currentWord = words[i];

            // Add the word to our answer
            answer.append(currentWord);

            // Add space if this is NOT the last word
            if (i > 0) {
                answer.append(" ");
            }
        }

        // Step 5: Convert StringBuilder into String
        return answer.toString();
    }
}