package day3problem;

public class SmallestElement {
public static void main(String[] args) {
	int[] arr=new int[] {55,75,88,2,26,98};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min)
			min=arr[i];
	}
	System.out.println("Smallest element present in given number:"+min);
	}
}

