class ReverseWords {
    public static void main(String[] args) {
        // Sample string array
        String[] arr = {"hello", "world", "java", "shubham"};

        System.out.println("Reversed words:");
        for (String word : arr) {
            String reversed = "";

            // Reverse using loop
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.println(reversed);
        }
    }
}
