package com.team6.api.server;


import com.team6.module.chat.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final ChatService chatService;

    @GetMapping("/test")
    public String test() {

        return chatService.test();

    }

}