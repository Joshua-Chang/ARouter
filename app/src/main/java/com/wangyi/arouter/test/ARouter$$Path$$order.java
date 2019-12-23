package com.wangyi.arouter.test;

import com.wangyi.annotation.model.RouterBean;
import com.wangyi.arouter_api.core.ARouterLoadPath;
import com.wangyi.order.Order_MainActivity;

import java.util.HashMap;
import java.util.Map;
/**
 * 模拟ARouter路由器的组文件，对应的路径文件
 */
public class ARouter$$Path$$order implements ARouterLoadPath {
    @Override
    public Map<String, RouterBean> loadPath() {
        Map<String, RouterBean> pathMap=new HashMap<>();
        pathMap.put("/order/Order_MainActivity",RouterBean.create(RouterBean.Type.ACTIVITY, Order_MainActivity.class,"/order/Order_MainActivity","order"));
        return pathMap;
    }
}
