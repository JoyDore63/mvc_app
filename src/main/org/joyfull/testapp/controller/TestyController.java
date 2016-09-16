package org.joyfull.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author joyd
 *
 */
@Controller
public class TestyController {
  
  @RequestMapping("/welcome")
  public ModelAndView hellowWorld() {
    String message = "<br><div style='text-align:center;'>"
        + "<h3>********** Hello World, Spring MVC Tutorial</h3>"
        + "This message is coming from TestAppHelloWorld.java **********</div><br><br>";

    return new ModelAndView("welcome", "message", message);
  }

}
