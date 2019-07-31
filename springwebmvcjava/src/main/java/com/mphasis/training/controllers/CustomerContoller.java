package com.mphasis.training.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mphasis.training.bos.CustomerBo;
import com.mphasis.training.entities.Customer;

@Controller
public class CustomerContoller {

	@Autowired
	CustomerBo customerBo;
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String signuppage() {
		return "signup";
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView getLogin(@RequestParam("email")String email,
			@RequestParam("pwd")String pass) {
		ModelAndView mv=new ModelAndView();
		Customer customer;
		try {
			System.out.println("controller called");
			customer = customerBo.login(email, pass);
			mv.setViewName("welcome");
			mv.addObject("name",customer.getCname());
		} catch (Exception e) {
			mv.setViewName("login");
			mv.addObject("error", e.getMessage());
			e.printStackTrace();
		}
		
		return mv;
	}
	
	
/*	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView signup(@RequestParam("cname")String cname,
			@RequestParam("cemail")String email,
			@RequestParam("cpass")String pass,
			@RequestParam("phnum")String phno) {
		
		Customer cu=new Customer();
		cu.setCname(cname);
		cu.setCemail(email);
		cu.setCpass(pass);
		cu.setPhnum(Long.parseLong(phno));
		
		customerBo.signUp(cu);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name",cname);
		return mv;
		
		
		
	}*/
	/*@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute Customer cu) {
		
		customerBo.signUp(cu);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name",cu.getCname());
		return mv;
	}
	*/
	/*@RequestMapping("/customers")
	public ModelAndView getAll() {
		List<Customer> customers=customerBo.getAllCustomers();
		ModelAndView mv=new ModelAndView();
		mv.addObject("customers", customers);
		mv.setViewName("customers");
		return mv;
	}
	*/
	@RequestMapping(value = "/customers", 
			method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("customer",new Customer());
		model.addAttribute("customers",customerBo.getAllCustomers());
		return "customer";
	}
	
	
	@RequestMapping(value= "/customer/add", 
			method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("customer") Customer cu){
		if(cu.getCid()==0){
			//new customer, add it
			this.customerBo.signUp(cu);
		}else{
			//existing customer, call update
			/*Date d1=new java.util.Date();
			String s1=d1.toString();
			cu.setReg_date(s1);*/
			this.customerBo.editCustomer(cu);
		}
		return "redirect:/customers";
	}
	
	@RequestMapping("/remove/{cid}")
    public String removePerson(@PathVariable("cid") 
    int custid){
		
        this.customerBo.removeCustomer(custid);
        return "redirect:/customers";
    }
 
    @RequestMapping("/edit/{cid}")
    public String editPerson(@PathVariable("cid") int id,
    		Model model){
    	System.out.println("edit called"+model.getClass());
    	Customer cu=this.customerBo.getById(id);
    	System.out.println(cu.getCemail()+" "+cu.getCname());
        model.addAttribute("customer",cu );
        model.addAttribute("customers", this.customerBo.getAllCustomers());
        return "customer";
    }
}
