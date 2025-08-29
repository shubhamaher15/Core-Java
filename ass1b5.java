class BinaryPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if sum of row and column is even, else 0
                System.out.print(((i + j) % 2) + " ");
            }
            System.out.println();
        }
    }
}
