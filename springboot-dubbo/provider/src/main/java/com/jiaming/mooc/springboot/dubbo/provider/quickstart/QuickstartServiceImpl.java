package com.jiaming.mooc.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiaming.mooc.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {
  @Override
  public String sendMessage(String message) {
    return "quicmkstart-provider-message"+message;
  }
}
