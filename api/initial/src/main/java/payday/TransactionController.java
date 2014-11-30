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
public class TransactionController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //Get all transactions
    @RequestMapping(value = "api/business/{bid}/transactions", method = RequestMethod.GET)
    public @ResponseBody String transactionsGET(@PathVariable(value="bid") long bid, HttpServletRequest request){
        System.out.println(bid);

        return "OK 200";

    }

    //Create transaction
    @RequestMapping(value = "api/business/{bid}/transaction", method = RequestMethod.POST)
    public @ResponseBody String transactionPOST(@PathVariable(value="bid") long bid, @RequestBody Transaction transaction, HttpServletRequest request){
        System.out.println(bid + transaction.getId()+" "+ transaction.getContent() + transaction.getBusinessID() + transaction.getCategory() + transaction.getdescription());

        return "OK 200";

    }

    //get transaction
    @RequestMapping(value = "api/business/{bid}/transaction/{tid}", method = RequestMethod.GET)
    public @ResponseBody Transaction transactionGET(@PathVariable(value="bid") long bid, @PathVariable(value="tid") long tid,HttpServletRequest request){
        System.out.println(bid + " tid " + tid);

        //return "OK 200";
        return new Transaction(1234,1111,"content",23501,"category1","descrip1");
    }

    //Update transaction
    @RequestMapping(value = "api/business/{bid}/transaction/{tid}", method = RequestMethod.PUT)
    public @ResponseBody String transactionPUT(@PathVariable(value="bid") long bid, @PathVariable(value="tid") long tid,@RequestBody Transaction transaction, HttpServletRequest request){
        System.out.println(bid +" update transaction " + tid);

        return "OK 200";

    }

    //Delete transaction
    @RequestMapping(value = "api/business/{bid}/transaction/{tid}", method = RequestMethod.DELETE)
    public @ResponseBody String transactionDELETE(@PathVariable(value="bid") long bid,  @PathVariable(value="tid") long tid,HttpServletRequest request){
        System.out.println(bid +" delete transaction " + tid);

        return "OK 200";

    }

}