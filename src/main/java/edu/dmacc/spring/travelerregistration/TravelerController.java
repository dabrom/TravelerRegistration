package edu.dmacc.spring.travelerregistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class TravelerController {
	@Autowired TravelerDao dao;
	private static final String[] countries = {"Bordeaux", "Prague", "Ireland", "Switzerland"};


	@RequestMapping(value = "/form")
	public ModelAndView traveler() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("travelerForm");
		modelAndView.addObject("traveler", new Traveler());
		modelAndView.addObject("countries", countries);
		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processTraveler(Traveler traveler) {
		System.out.println("In processTraveler");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertTraveler(traveler);
		System.out.println("Value in getName" + traveler.getName());
		modelAndView.setViewName("travelerResult");
		modelAndView.addObject("t", traveler);
		return modelAndView;
	}
	@Bean 
	public TravelerDao dao() {
		TravelerDao bean = new TravelerDao();
		return bean;
	}
	
	@RequestMapping(value = "/viewAll")
		public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Traveler> allTravelers = dao.getAllTravelers();
		modelAndView.setViewName("viewAllTravelers");
		modelAndView.addObject("all", allTravelers);
		return modelAndView;
	}
	
}