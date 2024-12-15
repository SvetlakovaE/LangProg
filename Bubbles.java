class Bubbles {
    public static void main(String[] args) {
        int[] nums = {32, -42, 3112, 3, 20, 302, -25, 12, 31, -333};
        int a, b, t, vnes = 0 , vnutr = 0;
        int size = 10;

        //Отображение исходного массива
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();
        //Сортировка

        for(a=1; a<size; a++) {
            System.out.println("Итерация " + a + " внешний цикл");
            vnes++;
            for(b=size-1; b>=a; b--) {
                System.out.println("Итерация " + b + "внутренний цикл");
                vnutr++;
                if(nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        //отображение отсротированного массива:
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println("\nКоличество проходов внешнего цикла " + vnes + "\nКоличество проходов внутрененго цикла " + vnutr);
        System.out.println();
    }
}
