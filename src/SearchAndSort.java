import java.util.*;
public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sortType = "";
		String dataType = "";
		String storeType = "";
		String data = "";
		String[] dataArrayTemp;
		int[] dataArrayInt;
		String[] dataArrayString;
		ArrayList<Integer> dataArrayListInt = new ArrayList<Integer>();
		ArrayList<String> dataArrayListString;
		
		do {
			System.out.println("What algorithm would you like to execute?");
			sortType = s.nextLine();
		}while(sortType.toLowerCase().equals("linear") == false 
			&& sortType.toLowerCase().equals("binary") == false 
			&& sortType.toLowerCase().equals("bubble") == false 
			&& sortType.toLowerCase().equals("selection") == false 
			&& sortType.toLowerCase().equals("insertion") == false 
			&& sortType.toLowerCase().equals("merge") == false);
		
		do {
			System.out.println("What type of data?");
			dataType = s.nextLine();
		}while(dataType.toLowerCase().equals("integers") == false 
			&& dataType.toLowerCase().equals("strings") == false);
		
		do {
			System.out.println("How is it stored?");
			storeType = s.nextLine();
		}while(storeType.toLowerCase().equals("array") == false 
			&& storeType.toLowerCase().equals("list") == false);
		
		boolean valid = true;
		do {
			try {
				valid = true;
				System.out.println("Enter the data.");
				data = s.nextLine();
				if(dataType.toLowerCase().equals("integers")) {
					dataArrayTemp = data.split(",");
					ArrayList<Integer> dataArrayTest = new ArrayList<Integer>();
					for(int i = 0; i < dataArrayTemp.length; i++) {
						dataArrayTest.add(Integer.parseInt(dataArrayTemp[i]));
					}
				}
			}catch(Exception e) {
				System.out.println("Invalid entry.");
				valid = false;
			}
			
		}while(valid == false);
		
		
		if(storeType.toLowerCase().equals("array")) {
			if(dataType.toLowerCase().equals("integers")) {
				dataArrayTemp = data.split(",");
				dataArrayInt = new int[dataArrayTemp.length];
				for(int i = 0; i < dataArrayTemp.length; i++) {
					dataArrayInt[i] = Integer.parseInt(dataArrayTemp[i]);
				}
				
				if(sortType.toLowerCase().equals("linear")) {
					System.out.println("What is the target value?");
					int target = s.nextInt();
					System.out.println("Target Index: " + linear(dataArrayInt, target));
				}
				else if(sortType.toLowerCase().equals("binary")) {
					System.out.println("What is the target value?");
					int target = s.nextInt();
					System.out.println("Target Index: " + binary(dataArrayInt, target));
				}
				else if(sortType.toLowerCase().equals("bubble")) {
					System.out.println("Bubble sort: " + Arrays.toString(bubble(dataArrayInt)));
				}
				else if(sortType.toLowerCase().equals("selection")) {
					System.out.println("Selection sort: " + Arrays.toString(selection(dataArrayInt)));
				}
				else if(sortType.toLowerCase().equals("insertion")) {
					System.out.println("Insertion sort: " + Arrays.toString(insertion(dataArrayInt)));
				}
				else {
					mergesort(dataArrayInt);
					System.out.println("Merge sort: " + Arrays.toString(dataArrayInt));
				}
			}
			else {
				dataArrayString = data.split(",");
				for(int i = 0; i < dataArrayString.length; i++) {
				}
				
				if(sortType.toLowerCase().equals("linear")) {
					System.out.println("What is the target value?");
					String target = s.nextLine();
					System.out.println("Target Index: " + linear(dataArrayString, target));
				}
				else if(sortType.toLowerCase().equals("binary")) {
					System.out.println("What is the target value?");
					String target = s.nextLine();
					System.out.println("Target Index: " + binary(dataArrayString, target));
				}
				else if(sortType.toLowerCase().equals("bubble")) {
					System.out.println("Bubble sort: " + Arrays.toString(bubble(dataArrayString)));
				}
				else if(sortType.toLowerCase().equals("selection")) {
					System.out.println("Selection sort: " + Arrays.toString(selection(dataArrayString)));
				}
				else if(sortType.toLowerCase().equals("insertion")) {
					System.out.println("Insertion sort: " + Arrays.toString(insertion(dataArrayString)));
				}
				else {
					mergesort(dataArrayString);
					System.out.println("Merge sort: " + Arrays.toString(dataArrayString));
				}
			}
		}
		else {
			if(dataType.toLowerCase().equals("integers")) {
				dataArrayTemp = data.split(",");
				for(int i = 0; i < dataArrayTemp.length; i++) {
					dataArrayListInt.add(Integer.parseInt(dataArrayTemp[i]));
				}
				
				if(sortType.toLowerCase().equals("linear")) {
					System.out.println("What is the target value?");
					int target = s.nextInt();
					System.out.println("Target Index: " + linear(dataArrayListInt, target));
				}
				else if(sortType.toLowerCase().equals("binary")) {
					System.out.println("What is the target value?");
					int target = s.nextInt();
					System.out.println("Target Index: " + binary(dataArrayListInt, target));
				}
				else if(sortType.toLowerCase().equals("bubble")) {
					System.out.println("Bubble sort: " + Arrays.toString(bubble(dataArrayListInt).toArray()));
				}
				else if(sortType.toLowerCase().equals("selection")) {
					System.out.println("Selection sort: " + Arrays.toString(selection(dataArrayListInt).toArray()));
				}
				else if(sortType.toLowerCase().equals("insertion")) {
					System.out.println("Insertion sort: " + Arrays.toString(insertion(dataArrayListInt).toArray()));
				}
				else {
					mergesort(dataArrayListInt);
					System.out.println("Merge sort: " + Arrays.toString(dataArrayListInt.toArray()));
				}
			}
			else {
				dataArrayListString = new ArrayList<String>(Arrays.asList(data.split(",")));
				for(int i = 0; i < dataArrayListString.size(); i++) {
				}
				
				if(sortType.toLowerCase().equals("linear")) {
					System.out.println("What is the target value?");
					String target = s.nextLine();
					System.out.println("Target Index: " + linearStrList(dataArrayListString, target));
				}
				else if(sortType.toLowerCase().equals("binary")) {
					System.out.println("What is the target value?");
					String target = s.nextLine();
					System.out.println("Target Index: " + binaryStrList(dataArrayListString, target));
				}
				else if(sortType.toLowerCase().equals("bubble")) {
					System.out.println("Bubble sort: " + Arrays.toString(bubbleStrList(dataArrayListString).toArray()));
				}
				else if(sortType.toLowerCase().equals("selection")) {
					System.out.println("Selection sort: " + Arrays.toString(selectionStrList(dataArrayListString).toArray()));
				}
				else if(sortType.toLowerCase().equals("insertion")) {
					System.out.println("Inserrtion sort: " + Arrays.toString(insertionStrList(dataArrayListString).toArray()));
				}
				else {
					mergesortStrList(dataArrayListString);
					System.out.println("Merge sort: " + Arrays.toString(dataArrayListString.toArray()));
				}
			}
		}
		s.close();
	}
	
	static int[] bubble(int[] data) {
		int n = data.length; 
        for (int i = 0; i < n - 1; i++) {
        	for (int j = 0; j < n - i - 1; j++) {
        		if (data[j] > data[j + 1]) 
                { 
                    int temp = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j + 1] = temp; 
                } 
        	}	
        }
        return data;
        	
	}
	static int[] selection(int[] data) {
		for(int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			int temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		return data;
	}
	static int[] insertion(int[] data) {
		int n = data.length;
		for(int i = 1; i < n; i++) {
			int key = data[i];
			int j = i - 1;
			while(j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = key;
		}
		return data;
	}
	
	static void mergesort(int data[]) {
		int n = data.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = data[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = data[i];
		mergesort(left);
		mergesort(right);
		merge(data, left, right);
	}

	public static void merge(int data[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			data[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			data[k] = right[j];
			j++;
			k++;
		}
	}
	
	
	static int linear(int[] data, int target) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	static int binary(int[] data, int target) {
		data = bubble(data);
		int low = 0;
		int high = data.length - 1;
		while(high >= low) {
			int middle = (low + high) / 2;
			if(data[middle] == target) {
				return middle;
			}
			else if(data[middle] < target) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		return -1;
	}
	
	
	static String[] bubble(String[] data) {
		int n = data.length; 
        for (int i = 0; i < n - 1; i++) {
        	for (int j = 0; j < n - i - 1; j++) {
        		if (data[j].compareTo(data[j + 1]) > 0) 
                { 
                    String temp = data[j]; 
                    data[j] = data[j + 1]; 
                    data[j + 1] = temp; 
                } 
        	}	
        }
        return data;
	}
	static String[] selection(String[] data) {
		for(int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[minIndex].compareTo(data[j]) > 0) {
					minIndex = j;
				}
			}
			String temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		return data;
	}
	static String[] insertion(String[] data) {
		int n = data.length;
		for(int i = 1; i < n; i++) {
			String key = data[i];
			int j = i - 1;
			while(j >= 0 && data[j].compareTo(key) > 0) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = key;
		}
		return data;
	}
	static void mergesort(String data[]) {
		int n = data.length;
		if (n < 2)
			return;
		int mid = n / 2;
		String left[] = new String[mid];
		String right[] = new String[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = data[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = data[i];
		mergesort(left);
		mergesort(right);
		merge(data, left, right);
	}

	public static void merge(String data[], String left[], String right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (right[j].compareTo(left[i]) >= 0) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			data[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			data[k] = right[j];
			j++;
			k++;
		}
	}
	static int linear(String[] data, String target) {
		for(int i = 0; i < data.length; i++) {
			if(data[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	static int binary(String[] data, String target) {
		data = bubble(data);
		int low = 0;
		int high = data.length - 1;
		while(high >= low) {
			int middle = (low + high) / 2;
			if(data[middle].equals(target)) {
				return middle;
			}
			else if(target.compareTo(data[middle]) > 0) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		return -1;
	}
	
	
	static ArrayList<Integer> bubble(ArrayList<Integer> data) {
		int n = data.size(); 
        for (int i = 0; i < n - 1; i++) {
        	for (int j = 0; j < n - i - 1; j++) {
        		if (data.get(j) > data.get(j + 1)) 
                { 
                    int temp = data.get(j); 
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                } 
        	}	
        }
        return data;
	}
	static ArrayList<Integer> selection(ArrayList<Integer> data) {
		for(int i = 0; i < data.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < data.size(); j++) {
				if(data.get(j) < data.get(minIndex)) {
					minIndex = j;
				}
			}
			int temp = data.get(minIndex);
			data.set(minIndex, data.get(i));
			data.set(i, temp);
		}
		return data;
	}
	static ArrayList<Integer> insertion(ArrayList<Integer> data) {
		int n = data.size();
		for(int i = 1; i < n; i++) {
			int key = data.get(i);
			int j = i - 1;
			while(j >= 0 && data.get(j) > key) {
				data.set(j + 1, data.get(j));
				j--;
			}
			data.set(j + 1, key);
		}
		return data;
	}
	static void mergesort(ArrayList<Integer> data) {
		int n = data.size();
		if (n < 2)
			return;
		int mid = n / 2;
		ArrayList<Integer> left = new ArrayList<Integer>(mid);
		ArrayList<Integer> right = new ArrayList<Integer>(n - mid);
		for (int i = 0; i < mid; i++)
			left.add(data.get(i));
		for (int i = mid; i < n; i++)
			right.add(data.get(i));
		mergesort(left);
		mergesort(right);
		merge(data, left, right);
	}

	public static void merge(ArrayList<Integer> data, ArrayList<Integer> left, ArrayList<Integer> right) {
		int nL = left.size();
		int nR = right.size();
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left.get(i) <= right.get(j)) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		while (i < nL) {
			data.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < nR) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
	}
	static int linear(ArrayList<Integer> data, int target) {
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i) == target) {
				return i;
			}
		}
		return -1;
	}
	static int binary(ArrayList<Integer> data, int target) {
		data = bubble(data);
		int low = 0;
		int high = data.size() - 1;
		while(high >= low) {
			int middle = (low + high) / 2;
			if(data.get(middle) == target) {
				return middle;
			}
			else if(data.get(middle) < target) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		return -1;
	}
	
	static ArrayList<String> bubbleStrList(ArrayList<String> data) {
		int n = data.size(); 
        for (int i = 0; i < n - 1; i++) {
        	for (int j = 0; j < n - i - 1; j++) {
        		if (data.get(j).compareTo(data.get(j + 1)) > 0) 
                { 
                    String temp = data.get(j); 
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                } 
        	}	
        }
        return data;
	}
	static ArrayList<String> selectionStrList(ArrayList<String> data) {
		for(int i = 0; i < data.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < data.size(); j++) {
				if(data.get(minIndex).compareTo(data.get(j)) > 0) {
					minIndex = j;
				}
			}
			String temp = data.get(minIndex);
			data.set(minIndex, data.get(i));
			data.set(i, temp);
		}
		return data;
	}
	static ArrayList<String> insertionStrList(ArrayList<String> data) {
		int n = data.size();
		for(int i = 1; i < n; i++) {
			String key = data.get(i);
			int j = i - 1;
			while(j >= 0 && data.get(j).compareTo(key) > 0) {
				data.set(j + 1, data.get(j));
				j--;
			}
			data.set(j + 1, key);
		}
		return data;
	}
	static void mergesortStrList(ArrayList<String> data) {
		int n = data.size();
		if (n < 2)
			return;
		int mid = n / 2;
		ArrayList<String> left = new ArrayList<String>(mid);
		ArrayList<String> right = new ArrayList<String>(n - mid);
		for (int i = 0; i < mid; i++)
			left.add(data.get(i));
		for (int i = mid; i < n; i++)
			right.add(data.get(i));
		mergesortStrList(left);
		mergesortStrList(right);
		mergeStrList(data, left, right);
	}

	public static void mergeStrList(ArrayList<String> data, ArrayList<String> left, ArrayList<String> right) {
		int nL = left.size();
		int nR = right.size();
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (right.get(j).compareTo(left.get(i)) >= 0) {
				data.set(k, left.get(i));
				i++;
			} else {
				data.set(k, right.get(j));
				j++;
			}
			k++;
		}
		while (i < nL) {
			data.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < nR) {
			data.set(k, right.get(j));
			j++;
			k++;
		}
	}
	static int linearStrList(ArrayList<String> data, String target) {
		for(int i = 0; i < data.size(); i++) {
			if(data.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}
	static int binaryStrList(ArrayList<String> data, String target) {
		data = bubbleStrList(data);
		int low = 0;
		int high = data.size() - 1;
		while(high >= low) {
			int middle = (low + high) / 2;
			if(data.get(middle).equals(target)) {
				return middle;
			}
			else if(target.compareTo(data.get(middle)) > 0) {
				low = middle + 1;
			}
			else {
				high = middle - 1;
			}
		}
		return -1;
	}
}