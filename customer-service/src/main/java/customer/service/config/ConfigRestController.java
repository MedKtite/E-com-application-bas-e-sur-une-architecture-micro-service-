package customer.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConfigRestController {
    @Value("${global.params.p1}")
    private String p1;
    @Value("${global.params.p2}")
    private String P2;
    @Autowired
    private CustomerConfigParams customerConfigParams;

    @GetMapping("/testconfig1")
    public Map<String,String> configTest(){
        return Map.of("p1",p1,"p2",P2);
    }

    @GetMapping("/testconfig2")
    public CustomerConfigParams configTest2(){
        return customerConfigParams;
    }


}