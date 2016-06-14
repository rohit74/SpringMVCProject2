package com.first.series;
 
import java.util.Map;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("/welcomeas")
public class HelloController  {
    @RequestMapping("/{country}/{userName}")
    public ModelAndView getStudentLogin(@PathVariable Map<String,String> pathVars){
        String name = pathVars.get("userName");
        String country = pathVars.get("country");
        ModelAndView model = new ModelAndView("HelloPage");
        model.addObject("welcomeMessage","details submitted by suraj "+name+" .You are from "+country);
        return model;   
    }
 
//  @Override
//  protected ModelAndView handleRequestInternal(
//          HttpServletRequest request, HttpServletResponse response) throws Exception {
//      // TODO Auto-generated method stub
//      ModelAndView model = new ModelAndView("HelloPage");
//      model.addObject("welcomeMessage","Welcome to Spring World...");
//      return model;
//  }
 
    @RequestMapping("/hi")
    public ModelAndView hiWorld(){
        ModelAndView model = new ModelAndView("HelloPage");
        //model.addObject("welcomeMessage","Hello World");
        return model;   
    }
}