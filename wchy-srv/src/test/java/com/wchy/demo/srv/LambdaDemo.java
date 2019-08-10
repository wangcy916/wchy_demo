package com.wchy.demo.srv;

public class LambdaDemo {

    public static void main(String[] args) {

        UserDao userDao = () -> {
            return "jack";
        };

        System.out.println(userDao.getUserName());
        System.out.println(UserDao.getId() + UserDao.SERVICE_ID);
        userDao.say("hah");

    }

    interface UserDao {
        String SERVICE_ID = "userDao";
        String getUserName();
        default void say(String msg) {
            System.out.println("hello " + msg);
        }

        static String getId() {
            return "123";
        }
    }

}
