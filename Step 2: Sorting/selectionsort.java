public static void selection_sort(int nums[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int mini = i;
        for (int j = i + 1; j < n; j++) {
            if (nums[j] < nums[mini]) {
                mini = j;
            }
        }
        int temp = nums[mini];
        nums[mini] = nums[i];
        nums[i] = temp;
    }

    System.out.println("After selection sort:");
    for (int i = 0; i < n; i++) {
        System.out.print(nums[i] + " ");
    }
    System.out.println();
}