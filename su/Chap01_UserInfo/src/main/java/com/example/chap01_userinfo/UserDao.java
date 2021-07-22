package com.example.chap01_userinfo;

import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
조회 기능이 있는 UserDao 클래스
 */
public class UserDao
{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    //사용자 데이터 추가
    public void add(User user) throws ClassNotFoundException, SQLException
    {
        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement(
                "insert into users(id, name, password) values(?,?,?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate(); //만들어진 ps를 실행한다.

        ps.close();
        c.close();
    }

    //사용자 데이터 가져오기
    public User get(String id) throws ClassNotFoundException, SQLException
    {
        Connection c = dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement(
                "select * from users where id = ?"
        );
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();

        User user = null;
        if (rs.next())
        {
            user = new User();
            user.setId(rs.getString("id"));
            user.setName(rs.getString("name"));
            user.setName(rs.getString("password"));

        }

        rs.close();
        ps.close();
        c.close();
        if (user == null)
        {
            throw new EmptyResultDataAccessException(1);
        }

        return user;
    }
    /*
    UserDao에 새로운 기능을 추가
     */
    public void deleteAll() throws SQLException
    {
        Connection c = dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement("delete from springbook.users");
        ps.executeUpdate();
        ps.close();
        c.close();
    }

    public int getCount() throws SQLException
    {
        Connection c = dataSource.getConnection();

        PreparedStatement ps = c.prepareStatement("select count(*) from springbook.users");

        ResultSet rs = ps.executeQuery();
        rs.next();

        int count = rs.getInt(1);
        rs.close();
        ps.close();
        c.close();

        return count;
    }

}
