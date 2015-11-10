package hello;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by nick on 04.11.15.
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
//        registry.addViewController("/2StepAuth").setViewName("2StepAuth");
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showForm(Person person) {
        return "form";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
        for (Person user : PersonDAO.persons ) {
            if (person.getName().equals(user.getName()) && person.checkPassword(user.getPassword())) {
                return "redirect:/results";
            }

//        if (bindingResult.hasErrors()) {
//            return "form";
//        }
//        return "redirect:/results";
        }
        return "form";

    }
}
