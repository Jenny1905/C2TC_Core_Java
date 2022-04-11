package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Example1 {


	public static void main(String args[])
	{

		List<Integer> number = Arrays.asList(2,3,4,5);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x*x).
							collect(Collectors.toList());
		System.out.println(square);

		
	}
	}
