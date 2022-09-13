package com.gsta.ems.mock;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.RandomUtil;
import com.gsta.ems.mock.util.NumUtil;
import org.junit.jupiter.api.Test;

/**
 * @author neo
 * @since 1.0
 */
public class RandomDoubleTest {

   @Test
   public void testGenerateRandomDouble(){
       double d = RandomUtil.randomDouble(0.0, 10.0);
       double dd = NumberUtil.round(d, 3).doubleValue();
       System.out.println(dd);
   }

    @Test
    public void testGenerateRandomDouble2(){
        System.out.println(NumUtil.genNum(10.0));
        System.out.println(NumUtil.genNum(100.0));
        System.out.println(NumUtil.genNum(1000.0));
    }

}
