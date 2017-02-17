package aug.manas.splitter.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error) {
		logger.debug("Entering in the method login ");
		ModelAndView model = new ModelAndView();
		logger.error("Error param is ::"+ error);
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		model.setViewName("login");

		return model;

	} 

	@RequestMapping(value = "/logout", method = GET)
	public ModelAndView logout() {
		logger.debug("Entering in the method logout ");
		SecurityContextHolder.getContext().setAuthentication(null);
		ModelAndView model = new ModelAndView();
		model.addObject("msg", "You've been logged out successfully.");
		model.setViewName("login");
		return model;
	}
}
