//package vetcilinic.RestController;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import vetcilinic.Repositories.CustomerRepository;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/customer")
//public class CustomerRestController {
//
//    final CustomerRepository customerRepository;
//    public CustomerRestController(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    // Customer List
//    @GetMapping("/customerList")
//    public Map<String,Object> customerList() {
//        Map<String,Object> hm = new LinkedHashMap<>();
//        hm.put("status",true);
//        hm.put("result",customerRepository.findAll());
//        return hm;
//    }
//
//}
