package zerobase.jpatest100.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class test1 {

  //  @GetMapping("/first-url") // 내 방식
  @RequestMapping(value = "/first-url", method = RequestMethod.GET) // 강사님 방식
  public void first() {
    System.out.println("test중");
//    return "test1 성공";
  }

//  @RequestBody // >> 에러가 난다고 하지만, 나지 않았고 없어도 됨
//  @RequestMapping(value = "helloworld", method = RequestMethod.GET)
  @RequestMapping("/helloWorld")
  public String helloWorld(){
    return "Hello World!";
  }

}

