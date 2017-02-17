package aug.manas.splitter.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	private static final Logger logger = Logger.getLogger(HomeController.class);

	
	@RequestMapping(value = "/", method = GET)
	public ModelAndView goToDashboard() {
		logger.debug("Entered in the goToDashboard method");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); // get logged in username
		logger.debug("Logged in user is :: "+ auth.getName());
		ModelAndView modelAndView = new ModelAndView("home","loggedInUser",name);
		return modelAndView;
	}
}