package com.coolgood.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by christ on 15/1/13.
 * Make move.
 */
public class Property implements Serializable {
    /*
    公司属性start
     */

//  金融
    public static final int FINANCIAL = 0x00000001;
//  电子商务
    public static final int ECOMERCE = 0x00000002;
//  文化传播
    public static final int CULTURE_COMMUNICATION = 0x00000003;
//  房产中介
    public static final int HOUSE_AGENT = 0x00000004;
//  物流
    public static final int LOGISTICS =  0x0000005;
//  教育发展
    public static final int EDUCATION = 0x0000006;
//  商务咨询
    public static final int BUSINESS_CONSULTING = 0x0000007;
//  餐饮管理
    public static final int RESTAURANT_MANAGEMENT = 0x0000008;
//  知识产权咨询服务
    public static final int INTELLECTUAL_PROPERTY = 0x000009;
//  科技公司
    public static final int TECHNOLOGY = 0x0000000a;
//  广告公司
    public static final int ADVERTISEMENT = 0x0000000b;
//  贸易公司
    public static final int TRADE = 0x0000000c;
//  装饰设计公司
    public static final int DECORATION_DESIGN = 0x0000000d;
//  清洁服务
    public static final int CLEAN_SERVICE = 0x0000000e;
//  医药医疗
    public static final int MEDICAL = 0x0000000f;
//  会计、律师事务所
    public static final int ACCOUNTANT_LAWYER_FIRM = 0x00000010;
//  影视制作
    public static final int VIDEO_PRODUCTION = 0x00000011;
//  农药工业
    public static final int PESTICIDE_INDUSTRY = 0x00000012;
//  国际船舶代理
    public static final int INTERNATIONAL_SHIPPING_AGENCY = 0x00000013;
//  电能发展
    public static final int ELECTRIC_ENERGY = 0x00000014;
//  航空服务
    public static final int AIR_SERVICE = 0x00000015;
//  通信发展
    public static final int COMMUNICATION = 0x00000016;
//  轻工科技
    public static final int LIGHT_INDUSTRY = 0x00000017;
//  空调工程
    public static final int AIR_CONDITIONING = 0x00000018;
//  物业管理
    public static final int PROPERTY_MANAGEMENT = 0x00000019;
//  光纤通信
    public static final int FON_FIBER_OPTIC_COMMUNICATIONS = 0x0000001a;
//  国际公关
    public static final int INTERNATIONAL_PR = 0x0000001b;
//  绿色食品
    public static final int GREEN_FOOD_PLANTING = 0x0000001c;
//  投资咨询
    public static final int INVESTMENT_CONSULTING = 0x0000001d;
//  市场经营管理
    public static final int MARKET_MANAGEMENT = 0x0000001e;
//  企业管理
    public static final int BUSINESS_MANAGEMENT = 0x0000001f;
//  通讯科技
    public static final int IAC_TECHNOLOGY = 0x00000020;
//  教育科技
    public static final int EDUCATION_TECHNOLOGY = 0x00000021;
//  电梯有限公司
    public static final int ELECTRICAL_ELEVATOR = 0x00000022;
//  土建工程
    public static final int CIVIL_WORK = 0x00000023;
//  环保科技
    public static final int ENVIRONMENTAL_TECHNOLOGY = 0x00000024;

    /*
    公司属性end
     */



    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer,String> citys = new TreeMap<Integer, String>();
        Scanner sc = new Scanner(new FileInputStream("src/com/coolgood/entity/国家行政区划代码"));
        while(sc.hasNextLine()) {
            String data = sc.nextLine();
//        data +=sc.nextLine();
//        char[] chs = data.toCharArray();
//        for(char c:chs)
//        System.out.println((byte) c);
            String[] mate = data.split("\\s+");
//        System.out.println(mate[0]+", "+mate[1]); //test ok
            citys.put(Integer.parseInt(mate[0]),mate[1]);
        }
        System.out.println(citys.size()+":"+citys);
    }
}
