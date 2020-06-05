package com.linghuganyu.commons.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.linghuganyu.commons.utils.DateUtil;

/**
 * 
 * @ClassName: DateTest 
 * @Description: 测试日期工具类
 * @author: Administrator
 * @date: 2020年6月5日 下午2:37:56
 */
public class DateTest {

	@Test
	public void test() {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 1, 20);
		Date time = cal.getTime();
		String sql = "select * from t_order where create_time>='"+DateUtil.getDateByInitMonth(time)+"' and create_time<='"+DateUtil.getDateByFullMonth(time)+"' ";
		System.out.println(sql);
	}
}
