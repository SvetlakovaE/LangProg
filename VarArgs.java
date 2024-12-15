class VarArgs{
	static void vaTest(int ... v){
		System.out.println("кол-во аргументов: " + v.length);
		System.out.println("содержимое: ");
		for(int i = 0; i < v.length; i++)
			 System.out.println(" аргументы " + i + ": " + v[i]);
		System.out.println();
	}

	static void vaTest2(String msg, int ... v){
		System.out.println("кол-во аргументов: " + (v.length + 1));
                System.out.println("содержимое: ");
		System.out.println(msg);
                for(int i = 0; i < v.length; i++)
                         System.out.println(" аргументы " + i + ": " + v[i]);
                System.out.println();
	}

	static void vaTest2(String msg)	{
		System.out.println("test");
	}

	public static void main(String[] args){
		vaTest(10);
		vaTest(10, 20, 30);
		vaTest();
		vaTest2("сообщение", 10, 20, 30);
		vaTest2("сообщение");
	}

}
