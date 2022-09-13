package com.gsta.ems.mock.entity.ts;


import com.baomidou.mybatisplus.annotation.TableId;
import com.gsta.ems.mock.util.NumUtil;
import lombok.Data;

import java.util.UUID;

/**
 * 映射 jetlinks 中气表的超级表
 */
@Data
public class PropertiesGModbus {

    @TableId("_ts")
    private Long ts;             //                  | TIMESTAMP            |           8 |          |
    private String id;           //                  | BINARY               |         256 |          |
    private Long createtime;     //                  | BIGINT               |           8 |          |
    private Double num;          //                  | DOUBLE               |           8 |          |
    private Double uset;         //                  | DOUBLE               |           8 |          |
    private Double hot;          //                  | DOUBLE               |           8 |          |
    private Double useh;         //                  | DOUBLE               |           8 |          |
    private Double fr;           //                  | DOUBLE               |           8 |          |
    private Double hif;          //                  | DOUBLE               |           8 |          |
    private Double ds;           //                  | DOUBLE               |           8 |          |
    private Double tem;          //                  | DOUBLE               |           8 |          |
    private Double pres;         //                  | DOUBLE               |           8 |          |
    private String deviceid;     //                  | BINARY               |         256 | TAG      |

    /**
     * 静态工厂方法：生成模拟的数据
     *
     * @return
     */
    public static PropertiesGModbus mock() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesGModbus mock = new PropertiesGModbus();
        mock.setTs(ts);
        mock.setId(id);
        mock.setCreatetime(ts);
        mock.setNum(NumUtil.genNum(10.0));
        mock.setUset(NumUtil.genNum(10.0));
        mock.setHot(NumUtil.genNum(10.0));
        mock.setUseh(NumUtil.genNum(10.0));
        mock.setFr(NumUtil.genNum(10.0));
        mock.setHif(NumUtil.genNum(10.0));
        mock.setDs(NumUtil.genNum(10.0));
        mock.setTem(NumUtil.genNum(10.0));
        mock.setPres(NumUtil.genNum(10.0));
        return mock;
    }

    /**
     * 实例方法：生成下一个模拟的数据
     *
     * @return
     */
    public PropertiesGModbus next() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesGModbus next = new PropertiesGModbus();
        next.setTs(ts);
        next.setId(id);
        next.setCreatetime(ts);
        next.setNum(num == null ?  NumUtil.genNum(10.0):num+NumUtil.genNum(10.0));
        next.setUset(uset == null ?  NumUtil.genNum(10.0):uset+NumUtil.genNum(10.0));
        next.setHot(hot == null ?  NumUtil.genNum(10.0):hot+NumUtil.genNum(10.0));
        next.setUseh(useh == null ?  NumUtil.genNum(10.0):useh+NumUtil.genNum(10.0));
        next.setFr(fr == null ?  NumUtil.genNum(10.0):fr+NumUtil.genNum(10.0));
        next.setHif(hif == null ?  NumUtil.genNum(10.0):hif+NumUtil.genNum(10.0));
        next.setDs(ds == null ?  NumUtil.genNum(10.0):ds+NumUtil.genNum(10.0));
        next.setTem(tem == null ?  NumUtil.genNum(10.0):tem+NumUtil.genNum(10.0));
        next.setPres(pres == null ?  NumUtil.genNum(10.0):pres+NumUtil.genNum(10.0));
        return next;
    }

}
