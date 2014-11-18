package payday;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("api/employee")
    public Employee employeee(@RequestParam(value="name", defaultValue="World") String name) {
        return new Employee(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("api/employee/all")
    public Employee employeeeAll(@RequestParam(value="name", defaultValue="World") String name) {
        return new Employee(counter.incrementAndGet(),
                            String.format(template, name));
    }
}