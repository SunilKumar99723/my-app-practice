package com.mycompany.map;

//Check for each subarray whether it consists of all natural numbers up to its length or not
//Input: arr[] = {4, 5, 1, 3, 2}
//Output: True False True False True
//Explanation: 
//For i = 1, the subarray {arr[2]} contains all the numbers from [1, i] and of size i(=1). Therefore, the required output is True. 
//For i = 2, no subarray of size 2 exists which contains all the numbers in the range[1, i]. Therefore, the required output is False. 
//For i = 3, the subarray {arr[2], arr[3], arr[4]} contains all the numbers from [1, i] and of size i(=3). Therefore, the required output is True. 
//For i = 4, no subarray of size 4 exists which contains all the numbers in the range[1, i]. Therefore, the required output is False. 
//For i = 5, the subarray {arr[0], arr[1], arr[2], arr[3], arr[4]} contains all the numbers from [1, i] and of size i(=5). Therefore, the required output is True. 
// 
//
//Input: arr = {1, 4, 3, 2}
//Output: True False False True 
// 
//Java code of above approach
import java.util.*;

class CheckForEachSubarray {

//Function to check if a subarray of size i exists
//that contain all the numbers in the range [1, i]
static void checksubarrayExist1_N(int arr[], int N)
{

	// Store the position
	// of each element of arr[]
	Map<Integer, Integer> pos=new HashMap<>();

	// Traverse the array
	for (int i = 0; i < N; i++) {

	// Insert the position
	// of arr[i]
	pos.put(arr[i],i);
	}

	// Store position of each element
	// from the range [1, N]
	Set<Integer> st=new HashSet<>();

	// Iterate over the range [1, N]
	for (int i = 1; i <= N; i++) {

	// Insert the index of i into st
	st.add(pos.get(i));
	// Find the smallest element of st
	int Min = Collections.min(st);

	// Find the largest element of st
	int Max = Collections.max(st);

	// If distance between the largest
	// and smallest element of arr[]
	// till i-th index is equal to i
	if (Max - Min + 1 == i) {
		System.out.print("True ");
	}
	else {
		System.out.print("False ");
	}
	}
}

//Driver code
public static void main(String[] args)
{
	int arr[] = { 1, 4, 3, 2 };
	int N = arr.length;

	checksubarrayExist1_N(arr, N);
}
}
//This code is contributed by offbeat
