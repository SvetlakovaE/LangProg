class H {
	void helpOn (int what) {
		switch (what) {
                        case '1':
                                System.out.println("Оператор \"if\":\n");
                                System.out.println("if(условие) оператор; или {блок операторов}");
                                System.out.println("else оператор; или {блок оператора}");
                                break;
                        case '2':
                                System.out.println("Оператор switch:\n");
                                System.out.println("switch(выражение) {");
                                System.out.println("  case \'константа\':");
                                System.out.println("    последовательность операторов: ");
                                System.out.println("    break;");
                                System.out.println(" // '...");
                                System.out.println("}");
                                break;
                        case '3':
                                System.out.println("Оператор цикла \"for\":\n");
                                System.out.println("for(инициализация; условие; итерационное действие) ");
                                System.out.println("  оператор: или {блок опкраторов;}");
                                break;
                        case '4':
                                System.out.println("Оператор цикла \"while\":\n");
                                System.out.println("while(условие) {операторы;}");
                                break;
                        case '5':
                                System.out.println("Оператор цикла \"do-while\":\n");
                                System.out.println("do {");
                                System.out.println("  операторы;");
                                System.out.println("} while (условие);");
                                break;
                        case '6':
                                System.out.println("Оператор \"break\":\n");
                                System.out.println("break; или breake метка;");
                                break;
                        case '7':
                                System.out.println("Оператор \"continue\":\n");
                                System.out.println("continue; или continue метка;");
                                break;
                }
	}
	void showMenu() {
		System.out.println("Справочная система по операторам:");
                        System.out.println("    1. if");
                        System.out.println("    2. Switch");
                        System.out.println("    3. for");
                        System.out.println("    4. while");
                        System.out.println("    5. do-while");
                        System.out.println("    6. break");
                        System.out.println("    7. continue");
                        System.out.print("Выберите номер раздела или нажмите \"q\" для выхода:  ");
	}

	boolean isValid(int ch) {
		if(ch < 1  | ch > '7' & ch != 'q')
			return false;
		else
			return true;
	}
}


class Help {
	public static void main(String[] args)
	   throws java.io.IOException {
	   char choice, ignore;
	   H helpobj = new H();
	   for(;;) {
		do {
			helpobj.showMenu();
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
	   	} while(!helpobj.isValid(choice));
		if (choice == 'q') break;
		System.out.println("\n");
		helpobj.helpOn(choice);

	   }
	   
	   }
}
