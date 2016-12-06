package search;

public class binarySearch {

	public static void main(String[] args) {
		
		int low,high,k;
	int []l={2,3,4,5,7,8,9,10,78,97};
	low=0;
	high=l.length-1;
	k=98;
		
	int index=	binarySearch.rBsearch(l, low, high, k);

	System.out.println("Index"+index);
	}
	public static int rBsearch(int[] L, int low, int high, int k) {


	    int mid = (low + high) / 2;

	    if (low > high) {
	        return -1;
	    } else if (L[mid] == k) {
	        return mid;
	    } else if (L[mid] < k) {
	        return rBsearch(L, mid + 1, high, k);
	    } else {
	        return rBsearch(L, low, mid - 1, k);
	    }
	 }

}
