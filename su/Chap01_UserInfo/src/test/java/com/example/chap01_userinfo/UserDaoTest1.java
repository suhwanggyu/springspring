package com.example.chap01_userinfo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

public class UserDaoTest1
{
    private UserDao dao;
    private User user1;
    private User user2;
    private User user3;


    @Before
    public void setUp()
    {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        this.dao = context.getBean("userDao", UserDao.class);

        this.user1 = new User("gyumee", "박성철", "springno1");
        this.user2 = new User("leegw700", "이길원", "springno2");
        this.user3 = new User("bumjin", "박범진", "springno3");
    }



    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException
    {
        setUp();
        dao.deleteAll();
        assertThat(dao.getCount() == 0);


        User user = new User();
        user.setId("dfd");
        user.setPassword("spring");
        user.setName("백기선");
        dao.add(user);
        assertThat(dao.getCount() == 1);


        User user2 = dao.get(user.getId());
        assertThat(user2.getName() == (user.getName()));
        assertThat(user2.getPassword() == (user.getPassword()));


    }

    @Test
    public void count() throws SQLException, ClassNotFoundException
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao dao = context.getBean("userDao", UserDao.class);

        setUp();

        dao.deleteAll();
        assertThat(dao.getCount() == 0);

//
//        User user1 = new User("gyumee", "박성철", "springno1");
//        User user2 = new User("leegw700", "이길원", "springno2");
//        User user3 = new User("bumjin", "박범진", "springno3");


        dao.deleteAll();
        assertThat(dao.getCount() == 0);
        dao.add(user1);
        assertThat(dao.getCount() == 1);
        dao.add(user2);
        assertThat(dao.getCount() == 2);
        dao.add(user3);
        assertThat(dao.getCount() == 3);

    }

    @Test
    public void addAndGetCheck() throws SQLException, ClassNotFoundException
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao dao = context.getBean("userDao", UserDao.class);

        setUp();

        User user1 = new User("gyumee", "박성철", "springno1");
        User user2 = new User("leegw700", "이길원", "springno2");

        dao.deleteAll();
        assertThat(dao.getCount() == 0);

        dao.add(user1);
        dao.add(user2);

        User userget1 = dao.get(user1.getId());
        assertThat(userget1.getName() == user1.getName());
        assertThat(userget1.getPassword() == user1.getPassword());

        User userget2 = dao.get(user2.getId());
        assertThat(userget2.getName() == user2.getName());
        assertThat(userget2.getPassword() == user2.getPassword());
    }

    @Test
    public void getUserFailure() throws SQLException, ClassNotFoundException
    {
//        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
//        UserDao dao = context.getBean("userDao", UserDao.class);
        setUp();

        dao.deleteAll();

        assertThat(dao.getCount() == 0);

        org.junit.jupiter.api.Assertions.assertThrows(
                EmptyResultDataAccessException.class,
                ()->{
                    dao.get("unKnown_id");
                }
                );
    }

}
