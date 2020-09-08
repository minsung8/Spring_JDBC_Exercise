package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		
		role.setRoleId(500);
		role.setDescription("PROGRAMMER");
		
		// int cnt = roleDao.insert(role);
		// System.out.println(cnt + "건 입력하였습니다");
		
		// int cnt = roleDao.update(role);
		// System.out.println(cnt + "건 수정하였습니다");
		
		Role result = roleDao.selectById(500);
		System.out.println(result);
		
		int result2 = roleDao.deleteById(500);
		System.out.println(result2 + "건 삭제했습니다");
		
		
	}

}
