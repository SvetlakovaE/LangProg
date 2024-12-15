//Демонстрация рекурсии
class Factorial{
    //рекурсивный метод 
    int factR(int n) {
        int result;

        if(n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    //итеративный метод
    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) {
            result *=t;
        }
        return result;
    }
}
//примеры использования статических переменных и методов
class staticDemo {
    int x;
    static int y;
    int sum() {
        return x +y;
    }
}

class StaticMeth {
    static int val = 1024;

    static int valDib2() {
        return val/2;
    }
}

class StaticBlock {
    static double rootf2;
    static double rootf3;

    static {
        System.out.println("Внутри статического блока");
        rootf2 = Math.sqrt(2.0);
        rootf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Вычисление факториала рекурсивным методом: ");
        System.out.println("Фактоарил 3 равен: " + f.factR(3));
        System.out.println("Фактоарил 4 равен: " + f.factR(4));
        System.out.println("Фактоарил 5 равен: " + f.factR(5));
        System.out.println();
        System.out.println("Вычисление факториала итеративным методом: ");
        System.out.println("Фактоарил 3 равен: " + f.factI(3));
        System.out.println("Фактоарил 4 равен: " + f.factI(4));
        System.out.println("Фактоарил 5 равен: " + f.factI(5));
        System.out.println();

        //создаение объектов для демонатсрации статических переменнных
        staticDemo ob1 = new staticDemo();
        staticDemo ob2 = new staticDemo();

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Переменные ob1.x и ob2.x независимы");
        System.out.println("ob1.x:  " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();
        
        //объекты используют одну копию статической переменной 
        System.out.println("Статическая переменная \"у\" является общей");
        staticDemo.y = 19;
        System.out.println("Значение staticDemo.y = " + staticDemo.y);
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        staticDemo.y = 190;
        System.out.println("Значение staticDemo.y = " + staticDemo.y);
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        //Демонстрация вызова статистического метода 
        System.out.println("val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDib2(): " + StaticMeth.valDib2());
        System.out.println();

        StaticMeth.val = 2;
        System.out.println("val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDib2(): " + StaticMeth.valDib2());
        System.out.println();

        //Демонстрация вызова статического блока
        StaticBlock ob = new StaticBlock("Внутри коснтруктора");
        System.out.println("Квадратный корень из 2: " + StaticBlock.rootf2);
        System.out.println("Квадратный корень из 3: " + StaticBlock.rootf3);

    }
}
