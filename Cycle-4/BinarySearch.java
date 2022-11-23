import java.util.Scanner;
class Main {
	int binarySearch(int array[], int element, int low, int high) {
		while (low <= high) {
      		int mid = low + (high - low) / 2;
      		if (array[mid] == element)
        		return mid;
      		if (array[mid] < element)
        		low = mid + 1;
      		else
        		high = mid - 1;
    	}
    	return -1;
  	}
	public static void sort(int array[],int n){
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j =0;j<n-i-1;j++){
				if (array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}		
		}
		System.out.println("The sorted array : ");
		for(int i=0;i<n;i++){
			System.out.println(array[i]);	
		}
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of elements");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements : ");
	for(int i = 0; i < n; i++){
		a[i] = sc.nextInt();
	}

	System.out.println("Enter the element to be searched: ");
	int x = sc.nextInt();
	Main obj = new Main();
	sort(a,a.length);
    int result = obj.binarySearch(a, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
