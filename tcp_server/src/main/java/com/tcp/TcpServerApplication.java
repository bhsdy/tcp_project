package com.tcp;

import com.tcp.server.TcpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TcpServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TcpServerApplication.class, args);
        TcpServer.run();
    }

}
