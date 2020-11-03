package ms.miaoshapro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fantooler
 * @Date 2020/11/3 14:29
 * @Version 1.0
 */
@RestController
public class ControTest {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
