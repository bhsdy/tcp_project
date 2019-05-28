package com.tcp.controller;

import com.tcp.server.TcpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandController {

    @Autowired
    private TcpClient tcpClient;

    @GetMapping("/sent")
    public String sentMsg(){
        try {
            tcpClient.sendMsg("1111");
        } catch (Exception e) {
            return e.toString();
        }
        return "1111";
    }
}
