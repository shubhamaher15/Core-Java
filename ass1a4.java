class EvenNumbersFromArray {
    public static void main(String[] args) {
        System.out.println("Even numbers from the given array:");

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
