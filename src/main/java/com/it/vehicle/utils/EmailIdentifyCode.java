package com.it.vehicle.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmailIdentifyCode {

    public static void main(String[] args) {
        //测试一下
        String authCode = achieveCode();
        sendAuthCodeEmail("xiaoxiaozhouhp@163.com",authCode);
    }

    //发送邮件代码
    public static void sendAuthCodeEmail(String email, String authCode) {
        try {
            SimpleEmail mail = new SimpleEmail();
            mail.setHostName("smtp.qq.com");//发送邮件的服务器
            mail.setSmtpPort(465);
            mail.setCharset("UTF-8");
            mail.setAuthentication("1911560799@qq.com","lazwnmbxgcjtbhgd");//刚刚记录的授权码，是开启SMTP的密码
            mail.setFrom("1911560799@qq.com","阿里物流");  //发送邮件的邮箱和发件人
            mail.setSSLOnConnect(true); //使用安全链接
            mail.addTo(email);//接收的邮箱
            //System.out.println("email"+email);
            mail.setSubject("注册验证码");//设置邮件的主题
            mail.setMsg("尊敬的用户:你好!\n 注册验证码为:" + authCode+"\n"+"     (有效期为五分钟)\n"+"如非本人操作请忽略");//设置邮件的内容
            mail.send();//发送
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }


    // 随机验证码
    public static String achieveCode() {  //由于数字 1 、 0 和字母 O 、l 有时分不清楚，所以，没有数字 1 、 0
        String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };
        List list = Arrays.asList(beforeShuffle);//将数组转换为集合
        Collections.shuffle(list);  //打乱集合顺序
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)); //将集合转化为字符串
        }
        return sb.toString().substring(3, 8);  //截取字符串第4到8
    }

}
