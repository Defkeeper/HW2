package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int yearOFBirth = 1998;
	int monthOFBirth = 5;
	int dayOFBirth = 12;
	int sum = yearOFBirth + monthOFBirth + dayOFBirth;

	boolean monthBiggerDay = monthOFBirth > dayOFBirth;

	char[] name = new char[7];
	name[0] = 'А';
	name[1] = 'л';
	name[2] = 'е';
	name[3] = 'к';
	name[4] = 'с';
	name[5] = 'е';
	name[6] = 'й';

	double myAge = 22.0;
	double partYear = 5.0/12.0;
	double sum2 = myAge + partYear;


	System.out.println("Сумма моего года, месяца и дня рождения: " + sum);
	System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
	System.out.println("Массив с моим именем: " + Arrays.toString(name));
	System.out.println("Мне " + sum2);
    }
}
