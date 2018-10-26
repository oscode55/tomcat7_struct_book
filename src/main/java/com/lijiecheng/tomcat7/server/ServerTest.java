package com.lijiecheng.tomcat7.server;

import org.apache.catalina.core.AprLifecycleListener;

import java.net.ServerSocket;

/**
 * @ProjectName: tomcat7_struct_book
 * @Package: com.lijiecheng.tomcat7.server
 * @ClassName: ServerTest
 * @Author: myname
 * @Description: ${description}
 * @Date: 2018/10/25 17:32
 * @Version: 1.0
 */
public class ServerTest {
    //        GlobalNamingResources 组件 统一命名访问对象接口 JNDI
    ServerSocket serverSocket;//监听端口 是否有SHUTDOWN命令 判断是否关闭
    public static void main(String[] args) {
        AprLifecycleListener listener1;
    }
}
