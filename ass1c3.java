class ManualUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = {3, 4, 5, 7};

        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

          for (int i = 0; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }

          for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[k++] = arr2[i];
            }
        }

        System.out.println("Union of arrays:");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
