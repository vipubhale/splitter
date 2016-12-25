package aug.manas.springdemo.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = GET)
	public ModelAndView goToDashboard() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); // get logged in username
		ModelAndView modelAndView = new ModelAndView("home","loggedInUser",name);
		return modelAndView;
	}
}