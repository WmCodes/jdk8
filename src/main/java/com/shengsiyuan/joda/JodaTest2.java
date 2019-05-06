package com.shengsiyuan.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * @author wangmeng
 * @date 2019/5/6
 * @desciption
 */
public class JodaTest2 {

    public static void main(String[] args) {
        DateTime today = new DateTime();

        DateTime tomorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("-----------------------");

        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);

        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);

        DateTime dateTime = new DateTime();
        DateTime dateTime2 = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));

    }
}
