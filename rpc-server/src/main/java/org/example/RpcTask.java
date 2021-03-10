package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/3/10 001011:19
 */
public class RpcTask implements Runnable{

    ServerSocket serverSocket;

    public RpcTask(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {
        while (true){
            Socket socket = null;
            ObjectInputStream objectInputStream = null;
            InputStream inputStream = null;

            try {
                Socket accept = serverSocket.accept();
                inputStream =  accept.getInputStream();
                objectInputStream = new ObjectInputStream(inputStream);
                RpcTransfer rpcTransfer = (RpcTransfer) objectInputStream.readObject();
                IHelloServiceImpl iHelloService = new IHelloServiceImpl();
                Class serviceClass = rpcTransfer.getServiceClass();
                Class[] paramsType = rpcTransfer.getParamsType();
                Object[] paramsValue = rpcTransfer.getParamsValue();
                String methodName = rpcTransfer.getMethodName();

                Method method = iHelloService.getClass().getMethod(methodName, paramsType);


            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
}
