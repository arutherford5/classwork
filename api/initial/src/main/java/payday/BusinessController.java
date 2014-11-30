package payday;

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
public class BusinessController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private RestTemplate restTemplate = new RestTemplate();


    //GET business info
    @RequestMapping(value = "api/business/{bid}", method = RequestMethod.GET)
    public @ResponseBody String businessGET(@PathVariable(value="bid") long bid, HttpServletRequest request){
        System.out.println(bid);

        return "OK 200";

    }
    //PUT business info (edit business info)
    @RequestMapping(value = "api/business/{bid}", method = RequestMethod.PUT)
    public @ResponseBody String businessPUT(@PathVariable(value="bid") long bid, @RequestBody Business business, HttpServletRequest request){
        System.out.println(bid + " " + business.getContent() + " " + business.getId());


        return "OK 200";

    }

    //get all worktimes
    @RequestMapping(value = "api/business/{bid}/employees/{eid}/worktimes", method = RequestMethod.GET)
    public @ResponseBody String worktimesGET(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid, HttpServletRequest request){
        System.out.println(bid + " worktimes" + eid);


        return "OK 200";

    }

    //Create worktime
    @RequestMapping(value = "api/business/{bid}/employees/{eid}/worktime", method = RequestMethod.POST)
    public @ResponseBody String worktimePOST(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid, @RequestBody Business business, HttpServletRequest request){
        System.out.println(bid +" new worktime " + eid);

        return "OK 200";

    }

    //Get worktime
    @RequestMapping(value = "api/business/{bid}/employees/{eid}/worktime/{wid}", method = RequestMethod.GET)
    public @ResponseBody String worktimesGET(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid, @PathVariable(value="wid") long wid,HttpServletRequest request){
        System.out.println(bid + " worktimes" + eid);


        return "OK 200";

    }

    //Update worktime
    @RequestMapping(value = "api/business/{bid}/employees/{eid}/worktime/{wid}", method = RequestMethod.PUT)
    public @ResponseBody String worktimePUT(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid,@PathVariable(value="wid") long wid,@RequestBody Business business, HttpServletRequest request){
        System.out.println(bid +" new worktime " + eid + " wid: " + wid);

        return "OK 200";

    }

    //Delete worktime
    @RequestMapping(value = "api/business/{bid}/employees/{eid}/worktime/{wid}", method = RequestMethod.DELETE)
    public @ResponseBody String worktimeDELETE(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid, @PathVariable(value="wid") long wid,HttpServletRequest request){
        System.out.println(bid +" delete worktime " + eid + " wid: " + wid);

        return "OK 200";

    }

    //Business ID Login
    @RequestMapping(value = "api/business/{bid}/login", method = RequestMethod.POST)
    public @ResponseBody String busloginPOST(@PathVariable(value="bid") long bid, @RequestBody Business business, HttpServletRequest request){
        System.out.println(bid + " " + business.getContent() + " " + business.getId());


        return "OK 200";

    }
}