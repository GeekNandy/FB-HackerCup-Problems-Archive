/**
 * 
 */
package round.qualification;

import java.util.Scanner;

/**
 * @author Sharad
 *
 */
public class StudiousStudent {

	static String genSmallestStr(String[] arr) {
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			for(int j = i + 1; j < len; j++) {
				if((arr[i]+arr[j]).compareTo(arr[j]+arr[i])>0) {
					String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String s: arr) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i = 0; i < N; i++) {
			int M = s.nextInt();
			String[] arr = new String[M];
			for(int j = 0; j < M; j++) arr[j] = s.next();
			System.out.println("Case #"+(i+1)+": "+genSmallestStr(arr));
		}
		s.close();
	}

}
