public void mergeSort(int[] arr) {
    if (arr == null || arr.length < 2) return;
    mergeSortHelper(arr, 0, arr.length - 1);
}

private void mergeSortHelper(int[] arr, int low, int high) {
    if (low >= high) return;
    int mid = low + (high - low) / 2;
    mergeSortHelper(arr, low, mid);
    mergeSortHelper(arr, mid + 1, high);
    merge(arr, low, mid, high);
}

private void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int i = low;    
    int j = mid + 1;  
    int k = 0;        

    while (i <= mid && j <= high) {
        if (arr[i] <= arr[j]) temp[k++] = arr[i++];
        else temp[k++] = arr[j++];
    }

    while (i <= mid) temp[k++] = arr[i++];     
    while (j <= high) temp[k++] = arr[j++];  

    for (int x = 0; x < temp.length; x++) {
        arr[low + x] = temp[x];
    }
}