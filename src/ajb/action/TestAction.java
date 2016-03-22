package ajb.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

import ajb.service.UserService;

@Controller
@Scope("prototype")
/*使用@Controller注解标识TestAction之后，
 	@Controller对应表现层的Bean，也就是Action
 	就表示要把TestAction交给Spring容器管理，
  	在Spring容器中会存在一个名字为"testAction"的action，
	这个名字是根据TestAction类名来取的。
	@Scope("prototype")表示将Action的范围声明为原型，
	可以利用容器的scope="prototype"来保证每一个请求有一个单独的Action来处理，
	避免struts中Action的线程安全问题。spring 默认scope 是单例模式(scope="singleton")，
	这样只会创建一个Action对象，每次访问都是同一Action对象，数据不安全，
	struts2 是要求每次次访问都对应不同的Action，scope="prototype" 
	可以保证当有请求的时候都创建一个Action对象。”
	*/
public class TestAction {
	// 注入userService
	@Resource(name = "userService")
 	private UserService userService;
	
}
