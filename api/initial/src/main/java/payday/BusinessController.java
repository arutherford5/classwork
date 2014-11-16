package payday;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/business")
    public Business business(@RequestParam(value="name", defaultValue="World") String name) {
        return new Business(counter.incrementAndGet(),
                            String.format(template, name));
    }
}