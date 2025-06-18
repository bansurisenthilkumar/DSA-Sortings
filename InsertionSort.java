package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {14,9,15,12,6,8,13};
		int n = arr.length;
		for(int i=0;i<=n-1;i++) {
			int j =i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		
		for(int k=0;k<=n-1;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
