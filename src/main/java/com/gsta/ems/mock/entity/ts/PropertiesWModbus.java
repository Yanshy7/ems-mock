package com.gsta.ems.mock.entity.ts;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gsta.ems.mock.util.NumUtil;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * 映射 jetlinks 中水表的超级表
 */
@Data
@Getter
@Setter
public class PropertiesWModbus {

    @TableId("ts")
    private Long ts;                 //              | TIMESTAMP            |           8 |          |
    private String id;               //              | BINARY               |         256 |          |
    private Long createtime;         //              | BIGINT               |           8 |          |
    private Double nopow;            //              | DOUBLE               |           8 |          |
    private Double num;              //              | DOUBLE               |           8 |          |
    private Double uset;             //              | DOUBLE               |           8 |          |
    private String deviceid;         //              | BINARY               |         256 | TAG      |

    /**
     * 静态工厂方法：生成模拟的数据
     *
     * @return
     */
    public static PropertiesWModbus mock() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesWModbus mock = new PropertiesWModbus();
        mock.setTs(ts);
        mock.setId(id);
        mock.setCreatetime(ts);
        mock.setNopow(RandomUtil.randomBoolean() ? 1.0D : 0.0D);
        mock.setNum(NumUtil.genNum(10.0));
        mock.setUset(NumUtil.genNum(10.0));
        return mock;
    }

    /**
     * 实例方法：生成下一个模拟的数据
     *
     * @return
     */
    public PropertiesWModbus next() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesWModbus next = new PropertiesWModbus();
        next.setTs(ts);
        next.setId(id);
        next.setCreatetime(ts);
        next.setNopow(RandomUtil.randomBoolean() ? 1.0D : 0.0D);
        next.setNum(num == null ?  NumUtil.genNum(10.0):num+NumUtil.genNum(10.0));
        next.setUset(uset == null ?  NumUtil.genNum(10.0):uset+NumUtil.genNum(10.0));
        return next;
    }
}
