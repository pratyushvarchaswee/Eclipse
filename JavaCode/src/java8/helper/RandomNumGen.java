package java8.helper;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumGen {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		IntStream intStream = random.ints(0, 10);
		intStream.distinct().limit(10).forEach(System.out::println);

	}

}
