package com.xunqi.gulimall.cart.service;

import com.xunqi.gulimall.cart.vo.CartItemVo;
import com.xunqi.gulimall.cart.vo.CartVo;

import java.util.concurrent.ExecutionException;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-06-30 17:06
 **/
public interface CartService {

    /**
     * 将商品添加至购物车
     * @param skuId
     * @param num
     * @return
     */
    CartItemVo addToCart(Long skuId, Integer num) throws ExecutionException, InterruptedException;

    /**
     * 获取购物车某个购物项
     * @param skuId
     * @return
     */
    CartItemVo getCartItem(Long skuId);

    /**
     * 获取购物车里面的信息
     * @return
     */
    CartVo getCart() throws ExecutionException, InterruptedException;

    /**
     * 清空购物车的数据
     * @param cartKey
     */
    public void clearCartInfo(String cartKey);
}
