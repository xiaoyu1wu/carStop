package ajb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ajb.dao.UserDao;

/*@Service��Ӧ����ҵ���Bean*/
@Service("userService")
public class UserService {
	// ע��userDao�������ݿ��и����û�Idȡ��ָ���û�ʱ��Ҫ�õ�
	@Resource(name = "userDao")
	private UserDao userDao;
}
