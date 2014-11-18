package payday;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("api/transaction")
    public Transaction transcation(@RequestParam Map<String,String> requestParams) throws Exception{
        String name = requestParams.get("name");
        String description = requestParams.get("description");
        String category = requestParams.get("category");
        int number = Integer.parseInt(requestParams.get("number"));
        int businessID = Integer.parseInt(requestParams.get("businessID"));

        System.out.println(name + description + category + number + businessID);
        //int number = 7;
        //String description = requestParams.get("description");
        //String category = requestParams.get("category");

        return new Transaction(counter.incrementAndGet(),businessID,String.format(template, name), number, category,description);
        
    }
    //@RequestMapping("api/transactionID")
    //public Transaction transcationID(@RequestParam(value="name", defaultValue="World") String name) {
      //  return new Transaction(counter.incrementAndGet(),
        //                   String.format(template, name));
    //}
   @RequestMapping("api/editTransaction")
    public boolean editTransaction(@RequestParam(value)){

    }
}