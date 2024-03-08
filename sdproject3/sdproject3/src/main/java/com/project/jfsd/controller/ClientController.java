package com.project.jfsd.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.project.jfsd.model.Admin;
import com.project.jfsd.model.Cars;
import com.project.jfsd.model.Customer;
import com.project.jfsd.service.AdminService;
import com.project.jfsd.service.CarService;
import com.project.jfsd.service.CustomerService;

@Controller
public class ClientController {
	@Autowired
	private AdminService adminservice;
	
	@Autowired
	private CustomerService customerservice;
	
	@Autowired
	private CarService carservice;
	@GetMapping("/carreg")
	public ModelAndView carregdemo()
	{
			 ModelAndView mv = new ModelAndView("carreg","car",new Cars());
			 return mv;
	}
	@PostMapping("/addcars")
	public ModelAndView addcardemo(@ModelAttribute("car") Cars car)
	{
		carservice.addCar(car); 
     	ModelAndView mv = new ModelAndView();
       mv.setViewName("carreg");
       mv.addObject("msg", "Registered Successfully");
       return mv;
		    
	}
	@GetMapping("/viewallregistrations")
	public ModelAndView viewallcarsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallregistrations");
		List<Cars> carlist=adminservice.viewallCars();
		mv.addObject("carlist",carlist);
		return mv;
	}
	@GetMapping("/deletecar")
	public String deletecardemo(@RequestParam("id") int id)
	{
		adminservice.deletecar(id);
		return "redirect:viewallregistrations";
	}
	@GetMapping("/custreg")
	public ModelAndView customerregdemo()
	{
			 ModelAndView mv = new ModelAndView("registration","cust",new Customer());
			 return mv;
	}
	@PostMapping("/addcustomer")
	public String addcustomerdemo(@ModelAttribute("cust") Customer customer)
	{
		customerservice.addcustomer(customer); 
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("employeeregistration");
//		mv.addObject("msg", "Employee Registration Successfully");
		return "redirect:login";
	}
	@GetMapping("/deletecust")
	public String deleteempdemo(@RequestParam("id") int id)
	{
		adminservice.deletecustomer(id);
		return "redirect:viewallcustomers";
	}

	@GetMapping("/viewallcustomers")
	public ModelAndView viewallempsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallcustomers");
		List<Customer> custlist=adminservice.viewallCustomer();
		mv.addObject("custlist",custlist);
		return mv;
	}
	@GetMapping("/login")
	public ModelAndView customerlogindemo()
	{
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@PostMapping("/checkcustlogin")
	public ModelAndView checkcustlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		Customer cust = customerservice.checkcustlogin(uname, pwd);
		
		if(cust!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			mv.setViewName("cars");
		}
		else
		{
			mv.setViewName("login");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
	}
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		return mv;
	}
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		
		Admin admin = adminservice.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}

}
