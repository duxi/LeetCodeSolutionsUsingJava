package com.dx;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloString {
	public static void main(String[] args) {
		// ����DΪ��ǰ����
		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);

		// D��Ϊ���µĿ�ʼ����
		d.set(Calendar.DAY_OF_MONTH, 1);

		int weekday = d.get(Calendar.DAY_OF_WEEK);

		// һ�ܵĵ�һ����������
		int firstDayOfWeek = d.getFirstDayOfWeek();

		int indent = 0;
		while (weekday != firstDayOfWeek) {
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}

		// ��ӡ�����յ�����
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
			// ��ӡ��һ��
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// ��*��ǵ�ǰ����
			if (day == today)
				System.out.print("*");
			else
				System.out.print(" ");

			// �Ƚ��ĵڶ���
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);

			// �ӱ��ܿ�ʼ�µ�һ��
			if (weekday == firstDayOfWeek)
				System.out.println();
		} while (d.get(Calendar.MONTH) == month);
		// ѭ���˳�ʱ��D���¸��µ�1��

		// �����Ҫ��ӡ��������
		if (weekday != firstDayOfWeek)
			System.out.println();
	}
}
