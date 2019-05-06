package com.shengsiyuan.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @author wangmeng
 * @date 2019/5/6
 * @desciption
 */
public class JodaTest3 {

    //标准UTC时间: 2019-05-06T11:11:11.123Z

    public static Date convertUTC2Date(String utcDate){

        DateTime dateTime = null;
        try {
            dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return dateTime.toDate();
    }

    public static String convertDate2UTC(Date javaDate){
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String converDate2LocalByDateFormat(Date javaDate,String dateFormat){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

    public static void main(String[] args) {
        System.out.println(JodaTest3.convertUTC2Date("2019-05-06T09:22:54.123Z"));
        System.out.println(JodaTest3.convertDate2UTC(new Date()));
    }

}
