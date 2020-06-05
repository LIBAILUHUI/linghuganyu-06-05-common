package com.linghuganyu.commons.utils;


/**
 * 
 * @ClassName: FileUtil 
 * @Description: 文件工具类
 * @author: Administrator
 * @date: 2020年6月5日 下午2:05:26
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		if(null!=fileName && fileName.trim().length()>0) {
			//截取最后一个"."后，包头
			return fileName.substring(fileName.lastIndexOf("."));
		}
		return null;
	}
	
	
	//测试
	public static void main(String[] args) {
		System.out.println(getExtendName("lh.test.txt"));
	}
}
