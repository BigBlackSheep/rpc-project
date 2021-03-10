package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Gz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/3/10 001011:16
 */
public class RpcProxy {

    ExecutorService executorService = Executors.newCachedThreadPool();

    public void publish(int port){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            executorService.submit(new RpcTask(serverSocket));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
