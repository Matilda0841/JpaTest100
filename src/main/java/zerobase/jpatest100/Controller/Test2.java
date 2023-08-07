package zerobase.jpatest100.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

  @RequestMapping(value = "/hello-spring", method = RequestMethod.GET)
  public String helloSpring() {
    return "Hello Spring!";
  }

  @GetMapping("/hello-rest")
  public String helloRest(){
    return "Hello Rest";
  }

  @GetMapping("/api/helloWorld")
  public String helloApiWorld(){
    return "Hello rest Api";
  }
}
