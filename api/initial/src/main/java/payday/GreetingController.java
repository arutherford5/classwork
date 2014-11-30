package payday;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private RestTemplate restTemplate = new RestTemplate();

    //Get all greetings
    @RequestMapping(value = "api/greetings", method = RequestMethod.GET)
    public @ResponseBody LinkedList greetingsGET(HttpServletRequest request){
        Greeting test = new Greeting(1234, "bob2",3333333);
        Greeting test2 = new Greeting(2345, "steve2",4444444);
        Greeting test3 = new Greeting(3456, "ed",55555555);
        Greeting test4 = new Greeting(4567, "george",666666);

        Greeting[] array = {test, test2, test3, test4};

        LinkedList list = new LinkedList();
        list.addLast(test);
        list.addLast(test2);
        list.addLast(test3);
        list.addLast(test4);

        return list;

    }
    //get greeting from DB
    @RequestMapping(value = "api/greeting/{gid}", method = RequestMethod.GET)
    public @ResponseBody String greetingPUT(@PathVariable(value="gid") long gid, HttpServletRequest request){
        System.out.println(gid);


        return "OK 200";

    }
    //create new greeting
    @RequestMapping(value = "api/greeting", method = RequestMethod.POST)
    public @ResponseBody String greetingPOST(@RequestBody Greeting greeting, HttpServletRequest request){
    	System.out.println(greeting.getContent() + " " + greeting.getId());

        return "OK 200";

    }
    //edit a greeting
    @RequestMapping(value = "api/greeting/{tid}", method = RequestMethod.PUT)
    public @ResponseBody String greetingPUT(@PathVariable(value="tid") long tid, @RequestBody Greeting greeting, HttpServletRequest request){
        System.out.println(tid + " " + greeting.getContent() + " " + greeting.getId());


        return "OK 200";

    }
    //delete a greeting
    @RequestMapping(value = "api/greeting/{tid}", method = RequestMethod.DELETE)
    public @ResponseBody String greetingDELETE(@PathVariable(value="tid") long tid, HttpServletRequest request){
        System.out.println(tid + " greeting record deleted");

        return "200 OK";
    }
}