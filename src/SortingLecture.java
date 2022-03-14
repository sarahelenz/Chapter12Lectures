public class SortingLecture {

	public static void main( String args[] ){

		final int LIST_SIZE=10000;
		System.out.print("Creating Array...");
		int temp, counter = 0;
		boolean alreadyThere;
		int[] 	a= new int[LIST_SIZE], 
				b= new int[LIST_SIZE], 
				c= new int[LIST_SIZE], 
				d= new int[LIST_SIZE];

		while( counter < LIST_SIZE ) {
			do{
				alreadyThere = false;
				temp = (int)(Math.random()*(LIST_SIZE+1));
				for(int y = 0; y < LIST_SIZE; y++ ) {
					if(a[y] == temp ) {
						alreadyThere = true;
						break;
					}
				}
			}while(alreadyThere);
			a[counter] = temp;
			b[counter] = temp;
			c[counter] = temp;
			d[counter] = temp;
			counter++;
		}

		System.out.println("Array Created\n");

		////////////PRINT ARRAY IF SMALL////////////////
//		printArray(a);


		////////////////////Bubble//////////////////////
		long t_start = System.nanoTime();
		bubbleSort(b);
		long t_end = System.nanoTime();
		double total_Time = (t_end - t_start)/1000000000.0;
		System.out.println("BubbleTime: " + total_Time + " seconds.");

		////////////////////Selection//////////////////////
		t_start = System.nanoTime();
		selectionSort(c);
		t_end = System.nanoTime();
		total_Time = (t_end - t_start)/1000000000.0;
		System.out.println("Selection: " + total_Time + " seconds.");

		////////////////////Insertion//////////////////////
		t_start = System.nanoTime();
		insertionSort(d);
		t_end = System.nanoTime();
		total_Time = (t_end - t_start)/1000000000.0;
		System.out.println("Insertion: " + total_Time + " seconds.");

		////////////////////Merge//////////////////////

		t_start = System.nanoTime();
		mergeSort(a, 0, a.length-1);
		t_end = System.nanoTime();
		total_Time = (t_end - t_start)/1000000000.0;
		System.out.println("MergeTime: " + total_Time + " seconds.");


	}

	public static void bubbleSort( int[] list ) {
		int temp;

		for(int k = 0; k < list.length-1; k++) 
			for(int j = 0; j < list.length-1; j++) 
				if( list[j] > list[j+1] ) {
					temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
	}
	
	public static void insertionSort( int[] list ) {
		int j, k,itemToInsert, n = list.length;
		boolean stillLooking;

		for( k = 1; k< n;++k) {
			itemToInsert = list[k];
			j=k-1;
			stillLooking = true;
			while( (j>=0) && stillLooking )
				if( itemToInsert < list[j] ) {
					list[j+1] = list[j];
					--j;
				}
				else
					stillLooking = false;
			list[j+1]=itemToInsert;
		}
	}

	public static void selectionSort( int[] list) {
		int temp;

		for( int k = 0; k < list.length -1; k++ ) {
			int minPosition = k;

			for( int j = k+1; j<list.length; j++ ) {
				if( list[j] < list[minPosition] )
					minPosition = j;
			}
			if( minPosition != k ) {
				temp = list[minPosition];
				list[minPosition]=list[k];
				list[k]=temp;
			}

		}
	}

	public static void mergeSort(int array[],int lo, int n){
		int low = lo;
		int high = n;
		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;
		mergeSort(array, low, middle);
		mergeSort(array, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;
		while ((lo <= end_low) && (start_high <= high)) {
			if (array[low] < array[start_high]) {
				low++;
			} else {
				int Temp = array[start_high];
				for (int k = start_high- 1; k >= low; k--) {
					array[k+1] = array[k];
				}
				array[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}

	public static void printArray( int[] a ){
		System.out.print("[");
		for(int x = 0; x < a.length; x++){
			System.out.print(a[x]);
			if( x != a.length - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}

}
