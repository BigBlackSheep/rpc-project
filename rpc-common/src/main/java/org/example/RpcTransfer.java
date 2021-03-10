package org.example;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Gz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/3/10 001011:09
 */
public class RpcTransfer  implements Serializable {
    private static final long serialVersionUID = -8493242193385803965L;
    private Class serviceClass;
    private Class[] paramsType;
    private Object[] paramsValue;
    private String methodName;

    @Override
    public String toString() {
        return "RpcTransfer{" +
                "serviceClass=" + serviceClass +
                ", paramsType=" + Arrays.toString(paramsType) +
                ", paramsValue=" + Arrays.toString(paramsValue) +
                ", methodName='" + methodName + '\'' +
                '}';
    }

    public Class getServiceClass() {
        return serviceClass;
    }

    public void setServiceClass(Class serviceClass) {
        this.serviceClass = serviceClass;
    }

    public Class[] getParamsType() {
        return paramsType;
    }

    public void setParamsType(Class[] paramsType) {
        this.paramsType = paramsType;
    }

    public Object[] getParamsValue() {
        return paramsValue;
    }

    public void setParamsValue(Object[] paramsValue) {
        this.paramsValue = paramsValue;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
