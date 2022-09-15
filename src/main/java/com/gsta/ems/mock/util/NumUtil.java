package com.gsta.ems.mock.util;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.RandomUtil;

/**
 * @author neo
 * @since 1.0
 */
public class NumUtil {

    /**
     *
     * @param max
     * @return
     */
    public static Double genNum(double max) {
        double d = RandomUtil.randomDouble(0.0,max);
        double dd = NumberUtil.round(d, 5).doubleValue();
        return dd;
    }

}
