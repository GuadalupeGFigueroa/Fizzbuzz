package org.factoriaf5.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
		int number;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrasa el número final");
		number = scanner.nextInt();

		for (int i = 1; i <= number ; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.print("FizzBuzz");
				
			}else if(i % 3 == 0){
				System.out.print("Fizz");
			}
			else if(i % 5 == 0){
				System.out.print("Buzz");
			}else{
				System.out.println(i);
			}

			}
		scanner.close();	
		}
	}


