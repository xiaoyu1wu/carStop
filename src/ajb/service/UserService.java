package ajb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ajb.dao.UserDao;

/*@Service对应的是业务层Bean*/
@Service("userService")
public class UserService {
	// 注入userDao，从数据库中根据用户Id取出指定用户时需要用到
	@Resource(name = "userDao")
	private UserDao userDao;
}
