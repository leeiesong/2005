package com.qf;

import lombok.SneakyThrows;
import org.junit.*;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
//    @Before
//    public void init(){
//        System.out.println("准备环境");
//    }

    @BeforeClass
    public static void init() {
        System.out.println("准备环境...");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

//    @After
//    public static void destory() {
//        System.out.println("结束环境...");
//    }

    @AfterClass
    public static void destory() {
        System.out.println("结束环境...");
    }

    @SneakyThrows
    @Test
    public void testMysql() throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///3306/mydb");
        System.out.println(connection);

    }
}
