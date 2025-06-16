static void bubble_sort(int[] arr, int n) {
    if (n == 1) return;

    int didSwap = 0;
    for (int j = 0; j <= n - 2; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            didSwap = 1;
        }
    }
    if (didSwap == 0) return;
    bubble_sort(arr, n - 1);
}