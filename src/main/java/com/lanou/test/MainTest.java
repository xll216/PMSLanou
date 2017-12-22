package com.lanou.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration
        ({"/SSM-*.xml"}) //加载配置文件
public class MainTest {

    @Test
    public void test() {

        String value = "ARTIFICIAL_MAC_DRILL;BIMS_BUSI_OBJ;CARGO_DEPOSIT_DETAIL;" +
                "CARGO_DEPOSIT_PERMIT;CARGO_TRANS_MEASURE;CARGO_TRANS_PERMIT;" +
                "CONTROLAREA_PASSPERMIT;FC_PASSAGE_PERMIT;FIREPROTDOOR_OPEN_PERMIT;" +
                "FIREUSING_PERMIT;FIRE_DISCONNECT_PERMIT;FIRE_DISCONNECT_WORK;" +
                "FIRE_PROTECTIVE;FIRE_PROTECTIVE_DETAIL;FIRE_PROTECTIVE_EXT;" +
                "FIRE_PROTECTIVE_PROTECT;GUARANTEE_PERMIT;HRADIATION_RISK_ANALY;" +
                "HRADIATION_RX_RISKCONTROL;HRADIATION_USERRADIATION;HRADIATION_WORK_CHECK;" +
                "HRADIATION_WORK_PERMIT;HRADIATION_WORK_PROTWORK;NEWOPEN_HOLE;PMS_BIMS_STORE;" +
                "PMS_BUSI_EXT_ITEM;PMS_BUSI_EXT_ITEMVAL;PMS_BUSI_PRINT;PMS_FLOWAPP_OPERLOG;" +
                "PMS_FLOW_APPLY;PMS_FLOW_BUSI_RELA;PMS_MAC;PMS_PLANT;PMS_RAY_USER;PMS_RELA_STAFF;" +
                "PMS_ROOM;PMS_SYS_ATTACHMENT;RAY_PERMIT;RAY_PERMIT_DETAIL;RDMS_PROJ_BASE;" +
                "RDMS_PROJ_BUDGET;RDMS_PROJ_CHANGE;RDMS_PROJ_CONTRACT;RECEIVE_METER_ANALY;" +
                "SPECIAL_WORK_PERMIT;SPECWORK_PERMIT;SYS_BUSI_ATTACHMENT;SYS_SEND_MAIL;" +
                "URGENT_PAYMENT;VEHICLE_PERMIT;";
        System.out.println("***"+value+"****");
        String data = value.toLowerCase();
        System.out.println("********");
        System.out.println("***"+data+"****");

    }
}
