//передача объектов в качестве аргументов и возвращение объектов методами 
class Block {
    int a, b, c;
    int v;

    public Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        v = a*b*c;
    }

    public boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    public boolean  sameV(Block ob) {
        if(ob.v == v) return true;
        else return false;
    }

}

class ByValue {
    void noChange( int i, int j) {
        i = i+j;
        j = -j;
    }
}

class ByRef {
    int a, b;

    public ByRef(int i, int j) {
        a = i;
        b = j;
    }

    void change(ByRef ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
    
}

class ErrorMsg {
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Переполнение диска",
        "Выход индекса за границы массива"
    };

    //пример возврата в виде строки
    String gerErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) return msgs[i];
        else return "неизвестная ошибка";
    }
}

class Err {
    String msg;
    int severity;

    Err(String m, int s) {
        msg = m;
        severity = s;

    }   
}

class ErrorInfo {
    String[] msgs = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Переполнение диска",
        "Выход индекса за границы массива"
    };
    int[] howBad = {3,3,2,4};
    Err getErrorInfo(int i) {
        if(i >=0 & i < msgs.length) return new Err(msgs[i], howBad[i]);
        else return new Err("Неизвестная ошибка", 0);
    }
}

class pr004 {
    public static void main(String[] args) {
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(5,4,5);

        System.out.println("ob1 эквивалентен ob2 " + ob1.sameBlock(ob2));
        System.out.println("ob1 эквивалентен ob3 " + ob1.sameBlock(ob3));
        System.out.println("объем ob1 равен ob2 " + ob1.sameV(ob2));
        System.out.println(); 

        //пример передачи параметров по значению 
        ByValue ob4 = new ByValue();
        int a = 15, b = 20;
        System.out.println("a и b ПЕРЕД вызовом метода noChange(): " + a + " " + b);
        ob4.noChange(a, b); 
        System.out.println("a и b ПОСЛЕ вызовом метода noChange(): " + a + " " + b);
        //значение a и b после вызова метода noChange() не изменяется
        System.out.println(); 

        //пример передачи параметров по ссылке
        ByRef ob5 = new ByRef(15, 20);
        System.out.println("ob5.a и ob5.b ПЕРЕД вызовом метода change(): " + ob5.a + " " + ob5.b);
        ob5.change(ob5);
        System.out.println("ob5.a и ob5.b ПОСЛЕ вызовом метода change(): " + ob5.a + " " + ob5.b);
        //значение a и b внутри ob5 меняются методом change()
        System.out.println(); 

        //Демонстарция возврата строки методом 
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.gerErrorMsg(2));
        System.out.println(err.gerErrorMsg(10));        
        System.out.println(); 

        //демонтсрация возврата методом объекта, сконструированного из строки и целого числа
        ErrorInfo err2 = new ErrorInfo();
        Err e;
        e = err2.getErrorInfo(2);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity);
        e = err2.getErrorInfo(10);
        System.out.println(e.msg + ", уровень серьезности: " + e.severity);




    }
}
