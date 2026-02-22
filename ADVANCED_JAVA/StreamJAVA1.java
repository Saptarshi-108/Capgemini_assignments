package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


interface MathsOperate{
	int operate(int a,int b);
}
public class StreamProg{
	public static void main(String args[]) {
		MathsOperate sumops = (int a,int b) -> a+b;
		MathsOperate subops = (int a, int b)-> a-b;
		
		// Predicate --> Functional Interface (primarily for checking specific conditions, returns boolean values only).
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(4));
		Predicate<String> WordStartingWithA = x -> x.startsWith("A");
		System.out.println(WordStartingWithA.test("Adonis"));
		Predicate<String> WordEndswithZ = x-> x.endsWith("Z");
		System.out.println(WordEndswithZ.test("BallZ"));
		Predicate<String> BothStartEnd = WordStartingWithA.and(WordEndswithZ);
		System.out.println(BothStartEnd.test("AdonisWakaZakasZ"));
		
		
		//Function --> Functional Interface (for carrying out specific DEFINED functions)
		Function<Integer,Integer> doubleIt = x -> 2*x;
		Function<Integer,Integer> tripleIt = x -> 3*x;
		System.out.println(doubleIt.apply(100));
		System.out.println(doubleIt.andThen(tripleIt).apply(50));
		System.out.println(doubleIt.compose(tripleIt).apply(50));
		
		//Consumer --> Void interface that takes input but nothing returned.Works like void function.
		Consumer<Integer> print = x -> System.out.println(x);
		print.accept(25);
		List<Integer> list = Arrays.asList(1,2,34,56,78);
		Consumer<List<Integer>> printList = x-> {
			System.out.println(list);
		};
		printList.accept(list);
		
		//Supplier --> No input, only output. 
		Supplier<String> giveHelloWorld = () -> "Hello World";
		System.out.println(giveHelloWorld.get());
		
		//BiPredicate,BiConsumer,BiFunction -> takes two inputs.--> same as their single counterparts.
		
		UnaryOperator<Integer> a = x->2*x; //it returns a new element and does not change the input var.
		BinaryOperator<Integer> b = (x,y) -> x+y; //same as Unary but for two.
		
		//MethodReference --> use method without invoking and in place of lambda expression.
		// :: --> this is method reference;
		List<String> students = Arrays.asList("Ram","Shyam","Ghanshyam");
		students.forEach(x->System.out.println(x));
		students.forEach(System.out::println);
		
		//Constructor reference --> 
		List<String> names = Arrays.asList("A","B","C");
		
		
	}
}
