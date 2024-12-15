

class AccessDemo {
    private int alpha; //Переменная с закрытыми доступом
    public int beta; //открытй доступ
    int gamma; //доступ оп умолчанию
    
    //метод доступа к закрытой переменной
    void setAlpha(int a) {
        if(a <= 100)
            alpha = a;
        else
            System.out.println("Значение первышает допустимую границу ");
    }

    int getAlpha() {
        return alpha;
    }
}

class FailSoftArray {
    private int[] a;
    private int errval;
    public int lenght;

    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;
    }
    
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val){
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if(index >=0 & index < lenght) return true;
        return false;
    }

}

class Modif{
    public static void main(String[] args) {
        AccessDemo ad = new AccessDemo();
        //ad.alpha = 99;
        ad.beta = 1854;
        ad.gamma = 222;

        ad.setAlpha(199);
        System.out.println("Значение alpha: " + ad.getAlpha());
        ad.setAlpha(99);
        System.out.println("Значение alpha: " + ad.getAlpha());

        //Использование "отказоучтойчивости" массиваЖ
        System.out.println();
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        System.out.println("Вывод значений без сообщений без ошибках");
        for (int i = 0; i < (fs.lenght*2); i++) {
            fs.put(i, i*10);
        }
        for (int i = 0; i < (fs.lenght*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Сообщаем об ошибках");
        for (int i = 0; i < (fs.lenght*2); i++) {
            if(!fs.put(i, i*10)) System.out.println("Индекс " + i + " выходит за гарницы массива");
        }
        for (int i = 0; i < (fs.lenght*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Индекс " + i + " выходит за гарницы массива");
        }
        System.out.println();

    }
}
