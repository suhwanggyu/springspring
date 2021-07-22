package com.example.chap01_userinfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

/*
UserDao 클라이언트 테스트

 */
public class UserDaoTest
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        //XML을 사용해서 애플리케이션 테스트하기
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("white");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);
//
        System.out.println(user.getId() + "등록성공");

        User user2 = dao.get(user.getId());

        user2.setPassword("love");

        /*
        수정 전, 조회성공이라는 메시지는 get()메소드가
        에러없이 끝났다는 의미일뿐

        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회성공");

         */

        if (!user.getId().equals(user2.getId()))
        {
            System.out.println("테스트 실패(id)");
        } else if (!user.getPassword().equals(user2.getPassword()))
        {
            System.out.println("테스트 실패(password)");
        }
        else
        {
            System.out.println("조회 테스트 성공");
        }



    }
}
