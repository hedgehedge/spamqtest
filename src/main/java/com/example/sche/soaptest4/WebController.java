package com.example.sche.soaptest4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    private Sender sender;

    @RequestMapping(value="/api/addmessage")
    public String addMessage(@RequestParam("msg")String msg) {
        sender.send(msg);

        return "Inserted: " + msg;
    }
}