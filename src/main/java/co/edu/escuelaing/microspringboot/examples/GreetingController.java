package co.edu.escuelaing.microspringboot.examples;

import co.edu.escuelaing.microspringboot.annotations.GetMapping;
import co.edu.escuelaing.microspringboot.annotations.RequestParam;
import co.edu.escuelaing.microspringboot.annotations.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public static String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hola " + name;
	}
}
