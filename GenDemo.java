//пример обощенного класса
class Gen <T> {
    //объявление ссылка на объект обощенного типа
    T ob;

    //констурктор
    Gen(T o) {
        ob = o;
    }
    //методы для проверки инофрмации об объектах
    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Тип Т: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
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
    }
}
