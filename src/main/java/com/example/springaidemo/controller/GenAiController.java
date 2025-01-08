package com.example.springaidemo.controller;

import com.example.springaidemo.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenAiController {
  private ChatService chatService;

  public GenAiController(ChatService chatService) {
    this.chatService = chatService;
  }

  @GetMapping("ask-ai")
  public String getResponse(@RequestParam String prompt) {
    return chatService.getResponse(prompt);

  }

}
