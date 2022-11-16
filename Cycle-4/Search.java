import java.util.*;

class Search{
	public static void main(String[] args){
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.print("Enter number of elements(0<n<10) : ");
		no = sc.nextInt();
		System.out.println("\nEnter the elements: \n");
		for(int i=0;i<no;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.print("Enter element to be searched : ");
		int key = sc.nextInt();
		int mid,b,t;
		int pos =-1;
		b=0;
		t=no-1;
		while (t>=b){
			mid=(t+b)/2;
			if (array[mid]==key){
				pos=mid;
				break;
			}
			else if(array[mid]<key){
				b=mid;
			}
			else if(array[mid]>key){
				t=mid;
			}
		}
		if(pos!=-1){
			System.out.print("Element found at index "+pos+"\n");
		}
		else{
			System.out.println("Element NOT FOUND\n");
		}
	}
	
}
