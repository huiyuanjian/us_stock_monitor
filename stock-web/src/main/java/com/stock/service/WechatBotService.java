 package com.stock.service;


import com.stock.entity.USStockMsg;

import java.util.List;

 /**
  * @ClassName TelegramBotService
  * @Author 风间影月
  * @Version 1.0
  * @Description TelegramBotService
  **/
 public interface WechatBotService {

     public void sendMessage(String text);

     public void sendMessage(List<USStockMsg> msgList) throws Exception;

 }
