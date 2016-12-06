package java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java8.demo.Dish.Type;

public class StreamClasses {

	public static void main(String[] args) {

		Function<Dish, String> dis;
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800,
				Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish(
						"french fries", true, 530, Dish.Type.OTHER), new Dish(
						"rice", true, 350, Dish.Type.OTHER), new Dish(
						"season fruit", true, 120, Dish.Type.OTHER), new Dish(
						"pizza", true, 550, Dish.Type.OTHER), new Dish(
						"prawns", false, 300, Dish.Type.FISH), new Dish(
						"salmon", false, 450, Dish.Type.FISH));
		//supplying instance of Dish and getting instance of String
		        menu.stream()
				.filter(T -> T.getCalories() > 500)
				.map(Dish::getName)
				.forEach(System.out::println);
	//flavor 2	        
		List<String>   lstStr=    menu.stream()
				.filter(T -> T.getCalories() > 500)
				.map(Dish::getName)
				.collect(Collectors.toList());
		System.out.println("List<String>"+lstStr);
		
		Supplier<Dish> t;
		

	}

}
