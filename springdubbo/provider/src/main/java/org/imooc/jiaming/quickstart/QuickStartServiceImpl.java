package org.imooc.jiaming.quickstart;

import org.imooc.jiaming.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

  @Override
  public String sendMessage(String message) {
    return "quickstart-provider-message:"+message;
  }
}
