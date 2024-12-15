class Strings {
    public static void main(String[] args) {
        String str = new String("Строка номер один");
        String str2 = new String(str);
        String str3 = "строка номер три";

        System.out.println(str + " " + str2 + " " + str3);

        //методы, работающие со строками
        //1. проверка на эквивалентность boolean equals(str)
        boolean eq;
        eq = str.equals(str2);
        System.out.println("Строки str и str2 эквивалентны: " + eq);
        eq = str.equals(str3);
        System.out.println("Строки str и str3 эквивалентны: " + eq);
    
        //2. Метод опредения длины строки int lenght()
        int lenght = str.length();
        System.out.println("Длина строки str: " + lenght);

        //3. Извлечение символов по индексу char charAt(index)
        char ch;
        ch = str.charAt(3);
        System.out.println("В строке str символ под индексом 3: " + ch);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println();

