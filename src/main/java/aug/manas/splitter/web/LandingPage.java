package aug.manas.splitter.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LandingPage {
	@RequestMapping(value = "/home", method = GET)
	public String getLandingPage() {
		System.out.println("In the getlandingpage method");;
		return "home";
	}
}
