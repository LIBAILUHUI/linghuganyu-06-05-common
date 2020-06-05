package com.linghuganyu.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: Administrator
 * @date: 2020年6月5日 下午2:04:59
 */
public class DateUtil {

	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		Calendar cal = Calendar.getInstance();
		cal.setTime(src);
		//月设置为第一天
		cal.set(Calendar.DAY_OF_MONTH, 1);
		//时分秒设置为0
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}
	
	
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		Calendar cal = Calendar.getInstance();
		cal.setTime(src);
		//月加1
		cal.add(Calendar.MONTH, 1);
		//获得月初
		Date change = getDateByInitMonth(cal.getTime());
		cal.setTime(change);
		//减去1秒
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	
	}
	
	
	//测试
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 1, 20);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("返回4月20号月初："+sdf.format(getDateByInitMonth(cal.getTime())));
		System.out.println("返回4月20号月末："+sdf.format(getDateByFullMonth(cal.getTime())));
	}
	
}
