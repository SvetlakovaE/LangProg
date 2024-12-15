class pr002 {
	static int func1() {
		return 0;
	}

	public static void main(String args[])
       			throws java.io.IOException {
		int intg = 10, intgr = 20;
/*		char ch, answer = 'R';
		System.out.println("Попробуй угадать букву :-)");
		ch = (char)System.in.read();
		if (ch == answer)
			System.out.println("Угадал букву");
		else {
			System.out.print("Не угадали букву :-( Нужная буква по алфавиту ");
			if (ch < answer)
				System.out.println("выше находится");
			else 
				System.out.println("ниже находится");
		}
*/
		boolean bool = true;

		//int i;
		for(int i=0; i<10; i++)
			switch(i) {
				case 0:
					System.out.println("i = 0");
					break;
				case 1:
					System.out.println("i = 1");
					break;
				case 2:
                                        System.out.println("i = 2");
                                        break;
				case 3:
                                        System.out.println("i = 3");
                                        break;
				case 4:
                                        System.out.println("i = 4");
                                        break;
				default:
					System.out.println("i=5 или больше 5");

			}
		if (!bool)
			System.out.println("bool равен true");
		else
			System.out.println("bool равен false");
		
		System.out.println("\n");
		// Оператор for
		for(int i = 0, j = 10; i < j; i++, j--)
			System.out.println("i и j: " + i +" "+ j + "\n");

		for (int i = 0; i < 10;) {
			System.out.println("Проход №" + i);
			i++;
		}

		// бесконечный цикл
		//for(;;);
		int sum=0;
		for(int i = 1; i<=5; sum += i++);
		System.out.println("\nСумма: " + sum  + "\n");

		//цикл while
		char ch1 = 'А';
		while(ch1 <= 'я') {
			System.out.print(ch1 + " ");
			ch1++;
		}
		System.out.println();
		System.out.println(((int) 'е') + " " + ((int) 'ё') + "\n");

		//цикл do-while
/*		char ch2;
		do {
		 	System.out.print("Введите символ и нажмите \"RETURN\":");
			ch2 = (char) System.in.read();
		} while (ch2 !='q');

		//пример вызова статических функции
		int result = func1();
*/		
		System.out.println();
		//оператор break;
		for(int i = 0; i < 100; i++){
			System.out.println("Значение i: " + i);
			if (i == 5)
			       break;
			System.out.println("Следующая итерация");	
		}

		System.out.println();
		//Вложенный цикл и break
		for(int i = 0; i<3; i++) {
			System.out.println("Счетчик внешнего цикла: " + i);
			System.out.print("  Счетчик внутреннего цикла: ");
			int t=0;
			while(t<100) {
				if(t==10)
					break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}

		//ИСпользование break с меткой
		System.out.println();
		int i2;
		for( i2=1; i2 < 4; i2++) {
one:		  {
two:			{
three:				{
					System.out.println("\n i2 равно " + i2);
					if(i2==1) break one;
					if(i2==2) break two;
					if(i2==3) break three; 

					System.out.println("Не выполняется");
				}
				System.out.println("После блока three");	
			}
			System.out.println("После блока two");
		  }
		  System.out.println("После блока one");
		}
		System.out.println("После цикла for");

		//еще один пример break с меткой
		System.out.println();
done:
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++){
					System.out.println(k +  " ");
					if(k==5) break done;
				}
			       System.out.println("После цикла k");	       
			}
			System.out.println("После цикла j");
		}
		System.out.println("После внешнего цикла\n");
		
		//оператор continue
		for(int i = 0; i <= 100; i++) {
			if((i%2) != 0)
				continue;
			System.out.println(i);
		}
outerloop:
		for(int i = 1; i<10; i++) {
			System.out.print("\nПроход внешнего цикла №" + i + ", внунтреннний цикл ");
			for(int j = 1; j<10; j++) {
				if(j==5) continue outerloop;
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
