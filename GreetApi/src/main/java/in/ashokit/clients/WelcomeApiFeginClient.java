package in.ashokit.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="Welcome-Api")
public interface WelcomeApiFeginClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
