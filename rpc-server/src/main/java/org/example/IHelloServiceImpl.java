package org.example;

/**
 * @author Gz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/3/10 001011:45
 */
public class IHelloServiceImpl implements IHelloService{

    @Override
    public String sayHello(String context) {

        return "hello".concat(context);
    }

    @Override
    public User findUserById(int id) {
        User user = new User();
        user.setName("G");
        user.setAge(18);
        return user;
    }

    @Override
    public String saveUser(User user) {
        return "success" + user;
    }
}
