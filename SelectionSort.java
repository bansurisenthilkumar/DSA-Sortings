package Sorting;

public class SlectionPrac {

	public static void main(String[] args) {
	
		int[] arr = {90,100,70,80,60,110};
		int n = arr.length;
		for(int i=0;i<n-2;i++) {
			int min = i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int k=0;k<=n-1;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
