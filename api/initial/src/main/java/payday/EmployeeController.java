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
import java.util.LinkedList.*;


@RestController
public class EmployeeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //Get all employees
    @RequestMapping(value = "api/business/{bid}/employees", method = RequestMethod.GET)
    public @ResponseBody LinkedList employeesGET(@PathVariable(value="bid") long bid, HttpServletRequest request){
        System.out.println(bid);
        Employee test = new Employee(1234, "bob2");
        Employee test2 = new Employee(2345, "steve2");
        Employee test3 = new Employee(3456, "ed");
        Employee test4 = new Employee(4567, "george");

        Employee[] array = {test, test2, test3, test4};

        LinkedList list = new LinkedList();
        list.addLast(test);
        list.addLast(test2);
        list.addLast(test3);
        list.addLast(test4);

        return list;

    }

    //create new employee

    @RequestMapping(value = "api/business/{bid}/employee", method = RequestMethod.POST)
    public @ResponseBody String employeePOST(@PathVariable(value="bid") long bid, @RequestBody Employee employee, HttpServletRequest request){
        System.out.println(bid + employee.getId()+" "+ employee.getContent());

        return "OK 200";

    }

    //Get employee

    @RequestMapping(value = "api/business/{bid}/employee/{eid}", method = RequestMethod.GET)
    public @ResponseBody Employee employeeGET(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid,HttpServletRequest request){
        System.out.println(bid + " eid " + eid);

        //return "OK 200";
        return new Employee(1234,"YOUR MOM");
    }

    //Update employee
    @RequestMapping(value = "api/business/{bid}/employee/{eid}", method = RequestMethod.PUT)
    public @ResponseBody Employee employeePUT(@PathVariable(value="bid") long bid, @PathVariable(value="eid") long eid,@RequestBody Employee employee, HttpServletRequest request){
        System.out.println(bid +" update employee " + eid);

        return employee;

    }

    //Delete employee
    @RequestMapping(value = "api/business/{bid}/employee/{eid}", method = RequestMethod.DELETE)
    public @ResponseBody String employeeDELETE(@PathVariable(value="bid") long bid,  @PathVariable(value="eid") long eid,HttpServletRequest request){
        System.out.println(bid +" delete employee " + eid);

        return "OK 200";

    }

}