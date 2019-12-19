package com.it.vehicle.mapper;

import com.it.vehicle.entity.GoodsOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Date;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml", "classpath:spring/spring-mybatis.xml"})
public class GoodsOrderMapperTest {
    @Autowired
    private GoodsOrderMapper goodsOrderMapper;

    @Test
    public void insertSelective() {
        String[] strings = new String[]{"开封市", "洛阳市", "平顶山市", "安阳市",
                "鹤壁市"
                , "新乡市", "焦作市", "濮阳市", "许昌市", "漯河市", "三门峡市", "商丘市",
                "周口市", "驻马店市", "南阳市", "信阳市"};
        String[] strings1=new String[]{"张三","李四","王五","甲","乙","丙"};
        String[] strings2=new String[]{"物怡儿","物君芮","物靖婵","物霭筠","物苹雪","物洁卉","物琼穗","物翠凌"};
        String[] strings3=new String[]{"河南省一横公司","河南省而哼公司"};
        String[] strings4=new String[]{"河南省承运公司一号","河南省承运公司二号"};
        Random random = new Random();
        Date date=new Date();
        for (int i = 0; i < 800; i++) {
            Integer integer = 111110 + i;
            int integer1 = random.nextInt(100);
            Float f = (float) integer1 + 0.5f;
            GoodsOrder order = new GoodsOrder();
            order.setOrderNumber(String.valueOf(integer));
            order.setSenderAddress("郑州市");
            order.setReceiveAddress(strings[random.nextInt(16)]);
            order.setOrderWeight(f);
            order.setSenderName(strings1[random.nextInt(5)]);
            order.setReceiveName(strings2[random.nextInt(7)]);
            order.setOrderCarrier(strings4[random.nextInt(1)]);
            order.setOrderConsign(strings3[random.nextInt(1)]);
            order.setDeliveryTime(date);
            order.setOrderVolume(random.nextFloat());
//            System.out.println(order);
            goodsOrderMapper.insertSelective(order);
        }
    }
}