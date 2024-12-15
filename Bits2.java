import java.util.Random;
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits=n;
    }

    void show(long val) {
        long mask = 1;
        //Сдвиг влево значение 1
        mask <<= numbits -1;
        int spacer = 0;
        for(; mask != 0; mask>>>=1) {
            if ((val&mask) !=0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer%8) ==0 ) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
    
}

class Bits2 {
 public static void main(String[] args) {
        // сброс 6го бита  - изменение регистра латиницы
        char ch;
        System.out.println("Преобразование букв из нижнего регистра в верхний ");
        for (int i = 0; i < 25; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }

        //отображение числа в двоичной форме
        System.out.println("\n");
        int t;
        byte val;
        val = 2;
        for (t = 128; t > 0; t=t/2) {
            if((val&t) !=0)
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println("\n");

        //Преобразование букв из верхнего регистра  в нижний
        System.out.println("Преобразование букв из верхнего регистра в нижний ");
        for (int i = 0; i < 25; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
        System.out.println("\n");

        //шифрование сообщения при помощи операции "исключающее ИЛИ"
        String msg = "Незашифрованная строка";
        String encmsg = "";
        String decmsg = "";

        Random rand = new Random();
        int key = rand.nextInt(127);

        System.out.print("ИСходное сообщение: ");
        System.out.println(msg);
        
        //Шифрование
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.print("Закодированное Сообщение: ");
        System.out.println(encmsg);

        //расшифровка
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.print("ДЕкодированное Сообщение: ");
        System.out.println(decmsg);
        System.out.println("");

        //Операция "побитовое НЕ"
        byte b = -34;
        for (int t2 = 128; t2 > 0; t2=t2/2) {
            if((b&t2) !=0)
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        b = (byte) ~b;
        for (int t2 = 128; t2 > 0; t2=t2/2) {
            if((b&t2) !=0)
                System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println("\n");

        //Побитовый сдвиг 
        int val2 = 1;
        for (int i = 0; i < 7; i++) {
            for (int t2 = 128; t2 > 0; t2=t2/2) {
                if((val2&t2) !=0)
                    System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val2 = val2 << 1; //свдвиг влево
        }
        for (int i = 0; i < 8; i++) {
            for (int t2 = 128; t2 > 0; t2=t2/2) {
                if((val2&t2) !=0)
                    System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val2 = val2 >> 1; //свдвиг впарво
        }     
        
            //Использование класса Showbits
            System.out.println();
            ShowBits b3 = new ShowBits(8);
            ShowBits i3 = new ShowBits(32);
            ShowBits li3 = new ShowBits(64);
            
            System.out.println("двоичное представление значения 123: ");
            b3.show(123);
            System.out.println("двоичное представление значения 12323: ");
            i3.show(12323);
            System.out.println("двоичное представление значения 123111111111: ");
            li3.show(123111111111L);

            //операция ?
            //получение модуля числа
            int absval;
            val=-32;
            absval = val < 0 ? -val : val;
            System.out.println("val and absval: " + val + " " + absval);

            //Предотвращение деления на 0:
            int res;
            for (int i = -5; i < 6; i++) {
                res = i !=0 ? 100 / i : 0;
                if(i !=0)
                    System.out.println("100 / " + i + " = " + res);
            }
    }
}
