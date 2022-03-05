package extra;

public class LargestSmallest {
	
	public static void main(String[] args) {
	    
	    int[] arr = {5,3,19,10,7,21,11,40};
	    
	    int min1 = arr[0];
	    int min2 = 0;
	    
	    int max1 = arr[0];
	    int max2 = 0;
	    
	    for(int i=1;i<arr.length;i++) {
	        if(arr[i] > max1) {
	            max2 = max1;
	            max1 = arr[i]; 
	        }
	        else if(arr[i] < min1){
	            min2 = min1;
	            min1 = arr[i];
	        }
	    }
	    
	    System.out.println("1st Largest = "+max1+", 2nd Largest = "+max2);
	    System.out.println("1st Smallest = "+min1+", 2nd Smallest = "+min2);

	}

}
