package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.clients.WelcomeApiFeginClient;

@RestController
public class GreetRestController {
	
	private WelcomeApiFeginClient welcomeclient;
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		String welcomeResp=welcomeclient.invokeWelcomeApi();
		String msg="good morning..";
		return msg+welcomeResp;
	}

}
