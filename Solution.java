import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	
	static Scanner fs;
	
	public static void main(String[] args) {
		fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int p = fs.nextInt();
			int d = fs.nextInt();
			int m = fs.nextInt();
			int s = fs.nextInt();
			int count = 0;
			while (true) {
				if (s >= p) {
					s -= p;
					count++;
				} else {
					break;
				}
				p = Math.max(p - d, m);
			}
			out.println(count);
		}
		fs.close();
		out.close();
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int x : a) {
			arr.add(x);
		}
		Collections.sort(arr);
		for (int i = 0; i < a.length; i++) {
			a[i] = arr.get(i);
		}
	}
	
	static int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = fs.nextInt();
		}
		return a;
	}
}
