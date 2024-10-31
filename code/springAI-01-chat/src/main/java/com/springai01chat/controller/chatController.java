package com.springai01chat.controller;

import com.springai01chat.common.Result;
import jakarta.annotation.Resource;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class chatController {
    @Resource
    private OpenAiChatClient openAiChatClient;

    @RequestMapping("/chat")
    public Result chat(@RequestParam("msg") String msg){
        String call = openAiChatClient.call(msg);
        return Result.success(call);
    }
}
