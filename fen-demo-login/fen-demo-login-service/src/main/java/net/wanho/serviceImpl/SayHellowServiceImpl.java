package net.wanho.serviceImpl;
import net.wanho.service.HellowServiceI;
import net.wanho.util.HellowUtil;
import org.springframework.stereotype.Service;

/**
 * Created by Boss on 2019/8/12.
 */
@Service
public class SayHellowServiceImpl implements HellowServiceI {
    @Override
    public String sayHellow() {
        Integer integer = HellowUtil.sayHellow();
        return "你好"+integer;
    }
}
