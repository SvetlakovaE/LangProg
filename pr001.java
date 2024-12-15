class pr001 {	
	public static void main(String args[]) {
		System.out.println("Первая Java программа");
		//Преобразование типов

		//Целые типы данных
		byte b;//8 бит
		b = -128;
		b = 127;
		b = (byte)256;
		System.out.println(b);
		short sh;//16 бит
		sh = (short)65536;
		int intg;//32 бит
		long l;// 64 бит
		intg = 2000000000;
		l = intg;
		intg = intg*intg*intg;
		System.out.println(intg);
		l = l*l*l;
		System.out.println(l);
		//Вецественные типы
		float f;//32 бит
		double dd;//64 бит
		sh = b;
		b =(byte)sh;
		dd = 1.5;
		intg =(int)dd;
		dd = (double)intg/3;
		f = intg;
		System.out.println(intg + " " + dd);
		//Символьный тип данных
		char ch;//16 бит
		ch = 'А';
		ch++; ++ch;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		//Логический тип
		boolean bool, bool2 = true;
		bool = true;
		System.out.println(!bool);
		System.out.println(bool && bool2);
		System.out.println(bool || bool2);
		System.out.println(bool ^ bool2);
		System.out.println("Перевод строки\n" + "Табуляция\t" + "\"Кавычки\" в строке" + (!bool & (bool2 | bool)));
		ch = '\'';
			
		

	}
}
