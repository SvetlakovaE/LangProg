class pr001{ 
	public static void main(String args[]) {
		System.out.println("Первая java программа");
		//преобразование типов
		
		//целые типы данных
		byte b; //8 bit
		b = -128;
		b = 127;
		b = (byte)130;
		System.out.println(b);
		short sh; //16 bit
		sh = (short)65536;
		int intg; //32 bit
		intg= 2000000000;
		intg = intg*intg*intg;
		System.out.println(intg);
		long l;	//64 bit
		l=intg;
		l = l*l*l;
		System.out.println(l);

		//Вещественные типы:
		float f; //32
		double dd; //64
		sh = b;
		b = (byte)sh;
		dd = 1.6;
		intg = (int)dd;
		dd = (double)intg/3;
		f = intg;
		System.out.println(intg + "  " + dd);

		//Символьный тип:
		char ch; //16 bit
		ch = 'А';
		ch++; ++ch;
		ch = (char)48;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		ch='0';
		System.out.println(((int)ch));
		

		//логический тип:
		boolean bool, bool2 = false; //1 bit
		bool = true;
		System.out.println(!bool);
		System.out.println(bool && bool2);
		System.out.println(bool || bool2);
		System.out.println(bool ^ bool2);
		System.out.println("Перенос строки\n" + "Табуляция\t" + "\"кавычки\" в строке " + (!bool & (bool2 | bool)));
		ch = '\'';

	}
}
