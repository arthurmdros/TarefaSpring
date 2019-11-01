package net.codejava.customer;
 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class CustomerController {
	CustomerService customerService = new CustomerService();
	
	@RequestMapping("/")
	public ModelAndView home() {
	    List<Customer> listCustomer = customerService.listAll();
	    ModelAndView mav = new ModelAndView("index");
	    mav.addObject("listCustomer", listCustomer);
	    return mav;
	}		
}