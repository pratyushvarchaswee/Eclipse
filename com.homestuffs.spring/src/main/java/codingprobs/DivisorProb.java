package codingprobs;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Kristen loves playing with and comparing numbers. She thinks that if she
 * takes two different positive numbers, the one whose digits sum to a larger
 * number is better than the other. If the sum of digits is equal for both
 * numbers, then she thinks the smaller number is better. For example, Kristen
 * thinks that is better than and that is better than .
 * 
 * @author pratyushvarchaswee
 *
 */
public class DivisorProb {

	public static void main(String[] args) {

		System.out.println("i/p ur number");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> mapInt = new TreeMap<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				int temp = sumDigit(i);
				mapInt.put(Integer.valueOf(i), Integer.valueOf(temp));

			} else
				continue;
		}
		System.out.println(mapInt);

		Set<Integer> keys = mapInt.keySet();
		System.out.println(favNum(keys, mapInt));

	}

	public static int sumDigit(int num) {
		int digit = 0;
		for (char ch : Integer.toString(num).toCharArray()) {
			digit = digit + ch - '0';

		}

		return digit;
	}

	public static int favNum(Set<Integer> numKeys, Map<Integer, Integer> numMap) {
		Iterator<Integer> itr = numKeys.iterator();

		int fav = 0;
		int favKey = 0;

		while (itr.hasNext()) {
			Integer key = itr.next();
			int val = numMap.get(key);
			if (val > fav) {
				fav = val;
				favKey = key;
			}

		}
		return favKey;
	}

}
