package com.gsta.ems.mock.entity.ts;


import com.baomidou.mybatisplus.annotation.TableId;
import com.gsta.ems.mock.util.NumUtil;
import com.gsta.ems.mock.util.Simulation;
import lombok.Data;

import java.util.Random;
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

        mock.setFaev(NumUtil.genNum(531.59998));
        mock.setBaev(NumUtil.genNum(10.0));
        mock.setFrev(NumUtil.genNum(0.60000));
        mock.setBrev(NumUtil.genNum(434.19998));

        mock.setPa(NumUtil.genNum(0.120000000));
        mock.setPb(NumUtil.genNum(0.100000000));
        mock.setPc(NumUtil.genNum(0.380000000));
        mock.setPt(mock.getPa() + mock.getPb() + mock.getPc());

        mock.setQa(NumUtil.genNum(0.060000000));
        mock.setQb(NumUtil.genNum(0.140000000));
        mock.setQc(NumUtil.genNum(0.540000000));
        mock.setQt(mock.getQa() + mock.getQb() + mock.getQc());

        mock.setSa(NumUtil.genNum(0.140000000));
        mock.setSb(NumUtil.genNum(0.140000000));
        mock.setSc(NumUtil.genNum(0.640000000));
        mock.setSt(mock.getSa() + mock.getSb() + mock.getSc());

        mock.setPfa(NumUtil.genNum(0.891000000));
        mock.setPfb(NumUtil.genNum(0.10000000));
        mock.setPfc(NumUtil.genNum(0.581000000));
        mock.setPft(mock.getPfa() + mock.getPfb() + mock.getPfc());

        mock.setVa(219.89999400);
        mock.setVb(220.399994000 );
        mock.setVc(220.0000);
        mock.setCa(0.60000);
        mock.setCb(0.0000);
        mock.setCc(3.4000);
        mock.setEnf(50.0000);
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
        Random r = new Random();

        next.setTs(ts);
        next.setId(id);
        next.setCreatetime(ts);

        next.setFaev(faev == null ? NumUtil.genNum(531.59998) : faev + Simulation.getFaevNum());
        next.setBaev(baev == null ? NumUtil.genNum(10.0) : baev);
        next.setFrev(frev == null ? NumUtil.genNum(0.6000000) : frev + Simulation.getFrevNum());
        next.setBrev(brev == null ? NumUtil.genNum(434.19998) : brev + Simulation.getBrevNum());

        next.setPa(pa == null ? NumUtil.genNum(0.120000000) : pa + Simulation.getPaNum());
        next.setPb(pb == null ? NumUtil.genNum(0.10000000) : pb + Simulation.getPbNum());
        next.setPc(pc == null ? NumUtil.genNum(0.380000000) : pc + Simulation.getPcNum());
        next.setPt(pa + pb + pc);

        next.setQa(qa == null ? NumUtil.genNum(0.060000000) : qa + Simulation.getQaNum());
        next.setQb(qb == null ? NumUtil.genNum(-0.14000000) : qb + Simulation.getQbNum());
        next.setQc(qc == null ? NumUtil.genNum(-0.540000000) :qc +  Simulation.getQcNum());
        next.setQt(qa + qb + qc);

        next.setSa(sa == null ? NumUtil.genNum(0.140000000) : sa + Simulation.getSaNum());
        next.setSb(sb == null ? NumUtil.genNum(0.140000000) : sb + Simulation.getSbNum());
        next.setSc(sc == null ? NumUtil.genNum(0.640000000) : sc + Simulation.getScNum());
        next.setSt(sa + sb +sc);

        next.setPfa(pfa == null ? NumUtil.genNum(0.891000000) : pfa + Simulation.getPfaNum());
        next.setPfb(pfb == null ? NumUtil.genNum(0.300000000) : pfb + Simulation.getPfbNum());
        next.setPfc(pfc == null ? NumUtil.genNum(0.581000000) : pfc + Simulation.getPfcNum());
        next.setPft(pfa + pfb + pfc);

        next.setVa(219.899994000);
        next.setVb(220.399994000 );
        next.setVc(220.0000);
        next.setCa(0.60000);
        next.setCb(0.0000);
        next.setCc(3.4000);
        next.setEnf(50.0000);

        return next;
    }


}
