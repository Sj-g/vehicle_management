package com.it.vehicle.controller.admin;

import com.it.vehicle.dto.StatusCode;
import com.it.vehicle.dto.Message;
import com.it.vehicle.entity.GoodsOrder;
import com.it.vehicle.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * 订单的操作
 */
@Controller
public class GoodsOrderController {
    private final GoodsService goodsService;
    @Autowired
    public GoodsOrderController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    /**
     * 转发到定单页面
     * 获取订单数量和订单数据
     * @return 数据和页面
     */
    @RequestMapping("/getOrderPage")
    ModelAndView forwardPage(ModelAndView modelAndView){
        List<GoodsOrder> goodsOrders = goodsService.selectAllGoodsOrder();
        Long count=goodsService.getOrderCount();
        modelAndView.addObject("goodsOrders",goodsOrders);
        modelAndView.addObject("count",count);
        modelAndView.setViewName("admin/order");
        return modelAndView;
    }
    /**
     * 添加订单
     * @param goodsOrder 订单
     * @return 反馈信息
     */
    @PostMapping("/addGoodsOrder")
    Message addGoodsOrder(GoodsOrder goodsOrder) {
        if (goodsOrder == null) {
            return Message.status(StatusCode.ENTITY_NULL);
        }
        goodsService.addGoodsOrder(goodsOrder);
        return Message.success();
    }

    /**
     * 删除
     *
     * @param goodsOrderId 订单ID
     * @return 反馈信息
     */
    @GetMapping("/deleteGoods/{goodsOrderId}")
    @ResponseBody
    Message deleteGoodsOrder(@PathVariable Integer goodsOrderId) {
        if (goodsOrderId != null) {
            goodsService.deleteGoodsOrder(goodsOrderId);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 批量删除
     *
     * @param goodsOrderId 订单Id
     * @return 反馈信息
     */
    @GetMapping("/batchDeleteGoodsOrder")
    Message batchDeleteGoodsOrder(@RequestParam("goodsOrderId")List<Integer> goodsOrderId) {
        if (goodsOrderId != null && goodsOrderId.size() > 0) {
            goodsService.batchDeleteGoodsOrder(goodsOrderId);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }

    /**
     * 更新订单
     * @param goodsOrder 订单
     * @return 反馈信息
     */
    @PostMapping("/updateGoodsOrder")
    Message updateGoodsOrder(GoodsOrder goodsOrder) {
        if (goodsOrder != null) {
            goodsService.updateGoodsOrder(goodsOrder);
            return Message.success();
        }
        return Message.status(StatusCode.ENTITY_NULL);
    }
    /**
     * 查询全部
     */
    @GetMapping("/updateGoodsOrder")
    List<GoodsOrder> selectAllGoodsOrder(){
        return goodsService.selectAllGoodsOrder();
    }
    /**
     * 查询单个
     */
    @GetMapping("/selectGoodsOrderById/{goodsOrderId}")
    Message selectGoodsOrderById(Integer goodsOrderId){
        return Message.success().add("data",goodsService.selectGoodsOrderById(goodsOrderId));
    }
}
