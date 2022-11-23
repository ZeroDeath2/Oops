import java.util.*;

class QuickSort{
	String array[];
    	int length;
	
	public static void swap(String array,int index1,int index2){
		String temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	void sort(String array[]) {
		if (array == null || array.length == 0) {
		    return;
		}
		this.names = array;
		this.length = array.length;
		quickSort(array, 0, length - 1);
	}		
	void quicksort(String array[],int lowindex,int highindex){
		int i = lowindex;
		int j = highindex;
		String pivot = array[highindex];
		while (i<=j){
			while(array[i].compareTo(pivot)<0){
				i++;
			}
			while(array[i].compareTo(pivot)>0){
				j--;
			}	
			if(i<=j){
				swap(array,i,j);
				i++;
				j--;			
			}		
		}
		if (lowindex<i){
			quicksort(array,lowindex,j);
		}
		if (i<lowindex){
			quicksort(array,i,highindex);		
		}
	}
	public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        String stringsList[] = {"raja", "gouthu", "rani", "gouthami", "honey", "heyaansh", "hello"};
        obj.sort(stringsList);

        for (String i : stringsList) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
