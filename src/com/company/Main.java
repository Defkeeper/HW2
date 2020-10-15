package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int yearOFBirth = 1998;
	int monthOFBirth = 5;
	int dayOFBirth = 12;
	int sum = yearOFBirth + monthOFBirth + dayOFBirth;
		System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

	boolean monthBiggerDay = monthOFBirth > dayOFBirth;
		System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

		double myAge = 22.0;
		double partYear = 5.0/12.0;
		double sum2 = myAge + partYear;
		System.out.println("Мне " + sum2);

	char[] name = new char[7];
	name[0] = 'А';
	name[1] = 'л';
	name[2] = 'е';
	name[3] = 'к';
	name[4] = 'с';
	name[5] = 'е';
	name[6] = 'й';
	System.out.print("Массив с моим имнем: ");
	for(int j = 0; j <= 7; j++){
		System.out.print(name[j]);
	}
    }
}
