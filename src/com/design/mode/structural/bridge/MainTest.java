package com.design.mode.structural.bridge;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/11
 * 省去了很多类
 */
public class MainTest {
    public static void main(String[] args) {
        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        huaWeiPhone.setAbstractSale(new OfflineSale("线下",9999));
        String phone = huaWeiPhone.getPhone();
        System.out.println(phone);


        XiMiPhone xiMiPhone = new XiMiPhone();
        xiMiPhone.setAbstractSale(new OnlineSale("线上",2222));
        String phone1 = xiMiPhone.getPhone();
        System.out.println(phone1);
    }
}
