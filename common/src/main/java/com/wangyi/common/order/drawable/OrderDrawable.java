package com.wangyi.common.order.drawable;

import com.wangyi.arouter_api.core.Call;
/**
 * 订单模块对外暴露接口，其他模块可以获取返回res资源
 */
public interface OrderDrawable extends Call {
    int getDrawable();
}
