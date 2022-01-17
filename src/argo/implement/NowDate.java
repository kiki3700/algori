package argo.implement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowDate {
	public static void main(String[] args) {
		Date nowDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = format.format(nowDate);
		System.out.println(strDate);
	}
}
