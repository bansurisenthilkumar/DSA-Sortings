package Sorting;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13,46,24,52,20,9};
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			for(int j =0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int k =0;k<=n-1;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
