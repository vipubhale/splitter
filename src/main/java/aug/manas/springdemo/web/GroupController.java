package aug.manas.springdemo.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aug.manas.springdemo.data.GroupRepository;
import aug.manas.springdemo.model.Group;

@Controller
public class GroupController {
	
	@Autowired(required=true)
	GroupRepository repository;
	
	@RequestMapping(value = "/mygroups", method = GET)
	public ModelAndView showMyGroups(ModelMap model) {
		List<Group> entries = repository.findAll();
		ModelAndView modelAndView = new ModelAndView("groups");
		modelAndView.addObject("groups", entries );
		return modelAndView;
	}
}
