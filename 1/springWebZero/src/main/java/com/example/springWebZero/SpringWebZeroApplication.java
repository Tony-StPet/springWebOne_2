package com.example.springWebZero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebZeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebZeroApplication.class, args);
	}

	@GetMapping("/page1")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/page3")
	public String page3(@RequestParam(value = "username", defaultValue = "Неизвестный") String name) {
		System.out.println("получено имя " + name);//для отладки
		return "Здравствуй, "+name+"!";
	}
	@GetMapping("/sumresult")
	public String sumresult(@RequestParam(value = "a", defaultValue = "0") int a,
							@RequestParam(value = "b", defaultValue = "0") int b) {

		System.out.println("получены числа:: a = " + a + "  b = "+ b );//для отладки
		return "Сумма чисел а и б = " +  (a+b);
	}
}
