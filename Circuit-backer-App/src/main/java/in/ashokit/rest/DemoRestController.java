package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoRestController {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod= "getDataFromb", name="mounika")
	public String getDataFromRedis() {
		System.out.println("** redis()-- method executed...");
		int i=1/0;
		return "data fetched from Redis Server";
	}
	
	public String getDataFromDb(Throwable t) {
		System.out.println("** db()-- method executed...");
		return "data fetched from Db Server";
	}

}
