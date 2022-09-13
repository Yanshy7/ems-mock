package com.gsta.ems.mock.entity.ts;


import com.baomidou.mybatisplus.annotation.TableId;
import com.gsta.ems.mock.util.NumUtil;
import lombok.Data;

import java.util.UUID;

/**
 * 映射 jetlinks 中电表的超级表
 */
@Data
public class PropertiesEModbus {

    @TableId("_ts")
    private Long ts;                      //         | TIMESTAMP            |           8 |          |
    private String id;                    //         | BINARY               |         256 |          |
    private Long createtime;              //         | BIGINT               |           8 |          |
    private Double faev;                  //         | DOUBLE               |           8 |          |
    private Double baev;                  //         | DOUBLE               |           8 |          |
    private Double frev;                  //         | DOUBLE               |           8 |          |
    private Double brev;                  //         | DOUBLE               |           8 |          |
    private Double pt;                    //         | DOUBLE               |           8 |          |
    private Double pa;                    //         | DOUBLE               |           8 |          |
    private Double pb;                    //         | DOUBLE               |           8 |          |
    private Double pc;                    //         | DOUBLE               |           8 |          |
    private Double qt;                    //         | DOUBLE               |           8 |          |
    private Double qa;                    //         | DOUBLE               |           8 |          |
    private Double qb;                    //         | DOUBLE               |           8 |          |
    private Double qc;                    //         | DOUBLE               |           8 |          |
    private Double st;                    //         | DOUBLE               |           8 |          |
    private Double sa;                    //         | DOUBLE               |           8 |          |
    private Double sb;                    //         | DOUBLE               |           8 |          |
    private Double sc;                    //         | DOUBLE               |           8 |          |
    private Double pft;                   //         | DOUBLE               |           8 |          |
    private Double pfb;                   //         | DOUBLE               |           8 |          |
    private Double pfa;                   //         | DOUBLE               |           8 |          |
    private Double pfc;                   //         | DOUBLE               |           8 |          |
    private Double va;                    //         | DOUBLE               |           8 |          |
    private Double vb;                    //         | DOUBLE               |           8 |          |
    private Double vc;                    //         | DOUBLE               |           8 |          |
    private Double ca;                    //         | DOUBLE               |           8 |          |
    private Double cb;                    //         | DOUBLE               |           8 |          |
    private Double cc;                    //         | DOUBLE               |           8 |          |
    private Double enf;                   //         | DOUBLE               |           8 |          |
    private Double aaa;                   //         | DOUBLE               |           8 |          |
    private Double bbb;                   //         | DOUBLE               |           8 |          |
    private String deviceid;              //         | BINARY               |         256 | TAG      |

    /**
     * 静态工厂方法：生成模拟的数据
     *
     * @return
     */
    public static PropertiesEModbus mock() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesEModbus mock = new PropertiesEModbus();
        mock.setTs(ts);
        mock.setId(id);
        mock.setCreatetime(ts);
        mock.setFaev(NumUtil.genNum(10.0));
        mock.setBaev(NumUtil.genNum(10.0));
        mock.setFrev(NumUtil.genNum(10.0));
        mock.setBrev(NumUtil.genNum(10.0));
        mock.setPt(NumUtil.genNum(10.0));
        mock.setPa(NumUtil.genNum(10.0));
        mock.setPb(NumUtil.genNum(10.0));
        mock.setPc(NumUtil.genNum(10.0));
        mock.setQt(NumUtil.genNum(10.0));
        mock.setQa(NumUtil.genNum(10.0));
        mock.setQb(NumUtil.genNum(10.0));
        mock.setQc(NumUtil.genNum(10.0));
        mock.setSt(NumUtil.genNum(10.0));
        mock.setSa(NumUtil.genNum(10.0));
        mock.setSb(NumUtil.genNum(10.0));
        mock.setSc(NumUtil.genNum(10.0));
        mock.setPft(NumUtil.genNum(10.0));
        mock.setPfa(NumUtil.genNum(10.0));
        mock.setPfb(NumUtil.genNum(10.0));
        mock.setPfc(NumUtil.genNum(10.0));
        mock.setVa(NumUtil.genNum(10.0));
        mock.setVb(NumUtil.genNum(10.0));
        mock.setVc(NumUtil.genNum(10.0));
        mock.setCa(NumUtil.genNum(10.0));
        mock.setCb(NumUtil.genNum(10.0));
        mock.setCc(NumUtil.genNum(10.0));
        mock.setEnf(NumUtil.genNum(10.0));
        return mock;
    }

    /**
     * 实例方法：生成下一个模拟的数据
     *
     * @return
     */
    public PropertiesEModbus next() {
        long ts = System.currentTimeMillis();
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        PropertiesEModbus next = new PropertiesEModbus();
        next.setTs(ts);
        next.setId(id);
        next.setCreatetime(ts);
        next.setFaev(faev == null ? NumUtil.genNum(10.0) : faev + NumUtil.genNum(10.0));
        next.setBaev(baev == null ? NumUtil.genNum(10.0) : baev + NumUtil.genNum(10.0));
        next.setFrev(frev == null ? NumUtil.genNum(10.0) : frev + NumUtil.genNum(10.0));
        next.setBrev(brev == null ? NumUtil.genNum(10.0) : brev + NumUtil.genNum(10.0));
        next.setPt(pt == null ? NumUtil.genNum(10.0) : pt + NumUtil.genNum(10.0));
        next.setPa(pa == null ? NumUtil.genNum(10.0) : pa + NumUtil.genNum(10.0));
        next.setPb(pb == null ? NumUtil.genNum(10.0) : pb + NumUtil.genNum(10.0));
        next.setPc(pc == null ? NumUtil.genNum(10.0) : pc + NumUtil.genNum(10.0));
        next.setQt(qt == null ? NumUtil.genNum(10.0) : qt + NumUtil.genNum(10.0));
        next.setQa(qa == null ? NumUtil.genNum(10.0) : qa + NumUtil.genNum(10.0));
        next.setQb(qb == null ? NumUtil.genNum(10.0) : qb + NumUtil.genNum(10.0));
        next.setQc(qc == null ? NumUtil.genNum(10.0) : qc + NumUtil.genNum(10.0));
        next.setSt(st == null ? NumUtil.genNum(10.0) : st + NumUtil.genNum(10.0));
        next.setSa(sa == null ? NumUtil.genNum(10.0) : sa + NumUtil.genNum(10.0));
        next.setSb(sb == null ? NumUtil.genNum(10.0) : sb + NumUtil.genNum(10.0));
        next.setSc(sc == null ? NumUtil.genNum(10.0) : sc + NumUtil.genNum(10.0));
        next.setPft(pft == null ? NumUtil.genNum(10.0) : pft + NumUtil.genNum(10.0));
        next.setPfa(pfa == null ? NumUtil.genNum(10.0) : pfa + NumUtil.genNum(10.0));
        next.setPfb(pfb == null ? NumUtil.genNum(10.0) : pfb + NumUtil.genNum(10.0));
        next.setPfc(pfc == null ? NumUtil.genNum(10.0) : pfc + NumUtil.genNum(10.0));
        next.setVa(va == null ? NumUtil.genNum(10.0) : va + NumUtil.genNum(10.0));
        next.setVb(vb == null ? NumUtil.genNum(10.0) : vb + NumUtil.genNum(10.0));
        next.setVc(vc == null ? NumUtil.genNum(10.0) : vc + NumUtil.genNum(10.0));
        next.setCa(ca == null ? NumUtil.genNum(10.0) : ca + NumUtil.genNum(10.0));
        next.setCb(cb == null ? NumUtil.genNum(10.0) : cb + NumUtil.genNum(10.0));
        next.setCc(cc == null ? NumUtil.genNum(10.0) : cc + NumUtil.genNum(10.0));
        next.setEnf(enf == null ? NumUtil.genNum(10.0) : enf + NumUtil.genNum(10.0));
        return next;
    }


}
