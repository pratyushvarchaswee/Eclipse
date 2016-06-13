package sort;


public class QuickSort {

	public static void main(String args[]) {
		QuickSort qs = new QuickSort();

		int[] arr = { 10, 15, 478, 5, 6, 790, 8, 9 };
		
		
		System.out.println("Unsorted Array I/P");
		int i=0;
		while(i<arr.length)
		
		{
			System.out.print(" "+arr[i]);
			i++;
			
		}

		qs.quickSrt(arr, 0, 7);
		  i = 0;
		  System.out.println("Sorted O/P");
		while (i < 8) {
			System.out.print( arr[i]+" ");
			i++;
		}
	}

	public void quickSrt(int[] arr, int start, int end) {
		int index = 0;
		if (start < end) {
			index = pivot(arr, start, end);

			quickSrt(arr, start, index - 1);
			quickSrt(arr, index + 1, end);
		}
		System.out.println();
	}

	/***
	 * 
	 * @param arr
	 *            - array to be sorted
	 * @param start
	 * @param end
	 * @return pivot element or partition point
	 */
	public int pivot(int[] arr, int start, int end) {
		int pindex = start;

		for (int i = start; i < end; i++) {
			if (arr[i] <= arr[end]) {
				int temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
				// swap(arr[i],arr[pindex]);
				pindex++;
			}

		}

		int temp = arr[pindex];
		arr[pindex] = arr[end];
		arr[end] = temp;

		return pindex;
	}

	public void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}

}

// 10 15 4 5 6 7 8 9

