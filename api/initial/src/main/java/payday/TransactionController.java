package payday;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("api/transaction")
    public Transaction transcation(@RequestParam(value="name", defaultValue="World") String name) {
        return new Transaction(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("api/transactionID")
    public Transaction transcationID(@RequestParam(value="name", defaultValue="World") String name) {
        return new Transaction(counter.incrementAndGet(),
                            String.format(template, name));
    }
}