package farm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import farm.model.Animal;

@Controller
public class AnimalController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping(value = "/animal", method = RequestMethod.GET)
	public ModelAndView showForm() {
        return new ModelAndView("animalHome", "animal", new Animal());
    }
	
	@RequestMapping(value = "/addAnimal", method = RequestMethod.POST)
	public String submit(@Validated @ModelAttribute("animal")Animal animal, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", animal.getSpecies());
        model.addAttribute("food", animal.getFood());
        model.addAttribute("product", animal.getProducts());
        model.addAttribute("count", animal.getNumOf());
        return "animalView";
	}
}
