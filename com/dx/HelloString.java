package com.dx;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloString {
	public static void main(String[] args) {
		// 构建D为当前日期
		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		// D组为本月的开始日期
		d.set(Calendar.DAY_OF_MONTH, 1);

		int weekday = d.get(Calendar.DAY_OF_WEEK);

		// 一周的第一天是星期日
		int firstDayOfWeek = d.getFirstDayOfWeek();

		int indent = 0;
		while (weekday != firstDayOfWeek) {
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}

		// 打印工作日的名称
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);
		System.out.println();

		for (int i = 1; i <= indent; i++)
			System.out.print("    ");

		d.set(Calendar.DAY_OF_MONTH, 1);
		do {
			// 打印的一天
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// 带*标记当前日期
			if (day == today)
				System.out.print("*");
			else
				System.out.print(" ");

			// 先进的第二天
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);

			// 从本周开始新的一行
			if (weekday == firstDayOfWeek)
				System.out.println();
		} while (d.get(Calendar.MONTH) == month);
		// 循环退出时，D是下个月的1天

		// 如果需要打印的最终行
		if (weekday != firstDayOfWeek)
			System.out.println();
	}
}
