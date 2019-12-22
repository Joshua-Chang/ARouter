package com.wangyi.arouter.test;

import com.wangyi.arouter.MainActivity;

/**
 * 模拟APT生成后的文件样子
 */
public class XActivity$$ARouter {
    public static Class<?> findTargetClass(String path) {
        if (path.equals("/app/MainActivity")) {
            return MainActivity.class;
        }
        return null;
    }
}
