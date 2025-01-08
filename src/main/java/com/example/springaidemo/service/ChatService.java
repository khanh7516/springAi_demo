package com.example.springaidemo.service;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
  private final ChatModel chatModel;

  public ChatService(ChatModel chatModel) {
    this.chatModel = chatModel;
  }

  public String getResponse(String prompt) {
    return chatModel.call(prompt);
  }


}
