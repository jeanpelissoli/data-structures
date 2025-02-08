package bubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BubbleSort {


	public static void bubbleSort(List<Integer> list) {
		int temp;
		int n = list.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.println("J: " + j + "   List J: " + list.get(j) + "   List J + 1: " + list.get(j + 1));
				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 8, 4, 3, 1, 5, 9, 2));
		bubbleSort(list);
		System.out.println(list.get(0));
		System.out.println(list);


	}
}
