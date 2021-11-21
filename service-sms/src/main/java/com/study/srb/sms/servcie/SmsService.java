package com.study.srb.sms.servcie;

import java.util.Map;

/**
 * create by xiaocai on 2021/11/21 6:52
 **/
public interface SmsService {
    void send(String mobile, String templateCode, Map<String,Object> param);
}
