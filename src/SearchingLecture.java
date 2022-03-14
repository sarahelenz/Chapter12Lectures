import javax.swing.JOptionPane;

public class SearchingLecture {

	public static void main(String args[]) {
		final int LIST_SIZE=10;
		
		int list[]= new int[LIST_SIZE]; 
	
		for(int x = 0; x < list.length;x++){
			list[x]=x+1;
			System.out.print(list[x] + " ");
		}
		
		String o = "Please enter a number that you would like to find in the array";
		int lookFor = Integer.parseInt( JOptionPane.showInputDialog(o) );
		
		//int found = sequential(array,lookFor);
		//int found = binary(list,lookFor);
		int found = binary(list,0,list.length-1,lookFor);
		
		
		if( found != -1 )
			System.out.println( "\nFound in element #" + found );
		else
			System.out.println( "\nNot Found" );
		
	}
	
	public static int sequential(int[] hi, int a){
		
		for(int x = 0; x < hi.length; x++)
			if(hi[x]==a)
				return x;
		
		return -1;
	}
// */
//	public static int binary( int[] a, int k) {
//		int low = 0, high = a.length - 1, mid;
//		while (low <= high) {
//			mid = low + (high - low) / 2;  // Note: not (low + high) / 2
//			if (a[mid] > k)
//				high = mid - 1;
//			else if (a[mid] < k)
//				low = mid + 1;
//			else
//				return mid; // found
//		}
//		return -1; // not found
//	}
//		*/
	
//	*/
	public static int binary(int[] x, int min, int max, int key){
		
		if(min>max)
			return -1;
		else {
			int mid = (min+max)/2;
			
			if(x[mid] == key)
				return mid;
			else if(x[mid] < key )
				return binary(x, mid+1, max, key);
			else
				return binary(x, min, mid-1, key);
		}
	}
//	*/
	
	
}
