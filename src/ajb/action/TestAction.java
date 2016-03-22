package ajb.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

import ajb.service.UserService;

@Controller
@Scope("prototype")
/*ʹ��@Controllerע���ʶTestAction֮��
 	@Controller��Ӧ���ֲ��Bean��Ҳ����Action
 	�ͱ�ʾҪ��TestAction����Spring��������
  	��Spring�����л����һ������Ϊ"testAction"��action��
	��������Ǹ���TestAction������ȡ�ġ�
	@Scope("prototype")��ʾ��Action�ķ�Χ����Ϊԭ�ͣ�
	��������������scope="prototype"����֤ÿһ��������һ��������Action������
	����struts��Action���̰߳�ȫ���⡣spring Ĭ��scope �ǵ���ģʽ(scope="singleton")��
	����ֻ�ᴴ��һ��Action����ÿ�η��ʶ���ͬһAction�������ݲ���ȫ��
	struts2 ��Ҫ��ÿ�δη��ʶ���Ӧ��ͬ��Action��scope="prototype" 
	���Ա�֤���������ʱ�򶼴���һ��Action���󡣡�
	*/
public class TestAction {
	// ע��userService
	@Resource(name = "userService")
 	private UserService userService;
	
}
