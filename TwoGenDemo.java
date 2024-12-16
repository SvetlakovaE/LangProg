//пример обощенного класса с двумя обобщенными типами
class TwoGen <T, V> {
    //объявление ссылка на объект обощенного типа
    T ob1;
    V ob2;

    //констурктор
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    //методы для проверки инофрмации об объектах
    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("Тип Т: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());

    }
}

class TwoGenDemo {
    public static void main(String[] args) {
        /*
        //объявление переменную класса Gen
        Gen <Integer> iOb;
        //создаем объект
        iOb = new Gen<Integer>(100);
        //ошибочное использование
        //iOb = new Gen<Integer>(100.0);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение v: " + v);
        System.out.println("");

        Gen <Double> dOb;
        dOb = new Gen<Double>(100.1);
        dOb.showType();
        double x = dOb.getOb();
        System.out.println("Значение x: " + x);
        System.out.println("");

        Gen <String> sOb;
        sOb = new Gen<>("Строка");
        sOb.showType();
        String s = sOb.getOb();
        System.out.println("Значение s: "  +s);
        System.out.println("");

        //неверное присваивание несовместимых объектов
        //dOb = iOb;
         */

        TwoGen <Integer, Integer>  tgOb;
        tgOb = new TwoGen <>(8, 16);
        tgOb.showType();
        int v1 = tgOb.getOb1();
        int v2 = tgOb.getOb2();
        System.out.println("Переменные v1: " + v1 + " и v2: " + v2);
        System.out.println("");

        TwoGen <Double, Integer>  tgOb2;
        tgOb2 = new TwoGen <>(8.5, 16);
        tgOb2.showType();
        double x1 = tgOb2.getOb1();
        int x2 = tgOb2.getOb2();
        System.out.println("Переменные x1: " + x1 + " и x2: " + x2);
        System.out.println("");

        
        TwoGen <Double, String>  tgOb3;
        tgOb3= new TwoGen <>(8.5, "Строка");
        tgOb3.showType();
        double s1 = tgOb3.getOb1();
        String s2 = tgOb3.getOb2();
        System.out.println("Переменные s1: " + s1 + " и s2: " + s2);
        System.out.println("");
    }
}
