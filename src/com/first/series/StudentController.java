package com.first.series;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
//@RequestMapping("/welcome")
public class StudentController {
 
    @RequestMapping(value="/studentAdmissionForm.html",method=RequestMethod.GET)
    public ModelAndView getAdmissionForm(){
        ModelAndView model = new ModelAndView("loginForm");
        //model.addObject("name","name");
        return model;
    }
 
    @RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.GET)
public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentId")String SID){
        ModelAndView model = new ModelAndView("submitForm");
        model.addObject("name",name);
        model.addObject("ID",SID);
        return model;
    }
}