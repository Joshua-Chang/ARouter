package com.wangyi.order.impl;

import com.wangyi.annotation.ARouter;
import com.wangyi.common.order.drawable.OrderDrawable;
import com.wangyi.order.R;

@ARouter(path = "/order/getDrawable")
public class OrderDrawableImpl implements OrderDrawable {
    @Override
    public int getDrawable() {
        return R.drawable.ic_settings_input_component_black_24dp;
    }
}
