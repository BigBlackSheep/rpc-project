package org.example;

/**
 * @author Gz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/3/10 001011:14
 */
public interface IHelloService {
    
    public String sayHello(String context);

    public User findUserById(int id);

    public String saveUser(User user);
}
