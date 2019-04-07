package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.PersonCommand;

public class RegisterController extends MultiActionController {
		public ModelAndView  insert(HttpServletRequest req,HttpServletResponse res)
		{
				return new ModelAndView("register","Operation_Status","Record Insertrd Successfully done");
		}
		public ModelAndView  update(HttpServletRequest req,HttpServletResponse res)
		{
			return new ModelAndView("register","Operation_Status","Record Updated Successfully done");
		}
		public ModelAndView  delete(HttpServletRequest req,HttpServletResponse res)
		{
			return new ModelAndView("register","Operation_Status","Record deleted Successfully done");
		}
		public ModelAndView  view(HttpServletRequest req,HttpServletResponse res)
		{
			return new ModelAndView("register","Operation_Status","Record view Successfully done");
		}
		
		public ModelAndView  InvalidSubmit(HttpServletRequest req,HttpServletResponse res)
		{
			return new ModelAndView("register","Operation_Status","Invalid Request");
		}
}
