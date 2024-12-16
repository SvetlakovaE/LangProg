class GenericMathDemo {
    static <T extends Comparable <T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if(x.length != y.length)
            return false;    
        
        for (int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i]))
                return false;
        return true;
        
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4};
        Integer[] nums2 = {1,2,3,4};
        Integer[] nums3 = {1,2,3,4,5};
        Integer[] nums4 = {1,3,2,4,5};

        if(arraysEqual(nums, nums2)) 
            System.out.println("nums совпадает с nums2");
        else
            System.out.println("nums НЕ совпадает с nums2");
        
        if(arraysEqual(nums, nums3)) 
            System.out.println("nums совпадает с nums3");
        else
            System.out.println("nums НЕ совпадает с nums3");
        
        if(arraysEqual(nums, nums4)) 
            System.out.println("nums совпадает с nums4");
        else
            System.out.println("nums НЕ совпадает с nums4");

        String[] strs ={"1234", "23434324", "4353523", "4234231534"};
        String[] strs2 ={"1234", "23434324", "4353523", "4234231534"};

        if(arraysEqual(strs, strs2)) 
            System.out.println("strs совпадает с strs2");
        else
            System.out.println("strs НЕ совпадает с strs2");
    }
}
