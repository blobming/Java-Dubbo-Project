package com.jiaming.mooc.springboot.dubbo.consumer.quickstart;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jiaming.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickstartConsumer {

  @Reference(url="dubbo://localhost:20880")
  ServiceAPI serviceAPI;

  public void sendMessage(String message){
    System.out.println(serviceAPI.sendMessage(message));
  }
}
