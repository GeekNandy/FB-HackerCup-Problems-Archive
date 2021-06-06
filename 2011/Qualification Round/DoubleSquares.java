/**
 * 
 */
package round.qualification;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Sharad
 *
 */
public class DoubleSquares {
	
	static Set<Integer> squares = new HashSet<>();
	
	static {
		for(int i = 1; i < 46341; i++) {
			squares.add(i*i);
		}
	}
	
	static int calcSquares(int X) {
		if(X == 0) return 1;
		int ctr = 0;
		Set<Integer> covered = new HashSet<>();
		for(int i = 0; i < Math.sqrt(X); i++) {
			int sq1 = i*i;
			int sq2 = X - sq1;
			if(!covered.contains(sq1) && !covered.contains(sq2) && squares.contains(sq2)) {
				covered.add(sq1);
				covered.add(sq2);
				ctr++;
			}
		}
		return ctr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println("Case #"+(i+1)+": "+calcSquares(s.nextInt()));
		}
		s.close();
	}

}
