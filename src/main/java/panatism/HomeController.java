package panatism;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/fanatism")
	public String home() {
		return "home";
	}
}
