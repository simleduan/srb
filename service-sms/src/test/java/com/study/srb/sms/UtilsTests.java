package com.study.srb.sms;

import com.study.srb.sms.util.SmsProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create by xiaocai on 2021/11/21 6:51
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UtilsTests {

    @Test
    public void testProperties(){
        System.out.println(SmsProperties.KEY_ID);
        System.out.println(SmsProperties.KEY_SECRET);
        System.out.println(SmsProperties.REGION_Id);
    }
}
