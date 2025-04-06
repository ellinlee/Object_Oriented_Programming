package lab8;

public class Lambda{
    public static arrayInterface counter(double value) {
        return array ->{
            int count = 0;
            for(int i = 0; i < array.length; i++) {
                if(value == array[i])
                    count = count + 1;
            }
            return count;
        };
    }

    public static final arrayInterface maximumValue = array ->{
        double max;
        max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
        }
        return max;
    };

    public static final arrayInterface minimumValue = array ->{
        double min;
        min = array[0];
        for(int i = 0; i< array.length; i++) {
            if(min > array[i])
                min = array[i];
        }
        return min;
    };

    public static final arrayInterface sum = array->{
        double sum = 0;
        for(int i = 0; i< array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    };

    public static final arrayInterface average = array->{
        double sum = 0;
        double average;
        for(int i = 0; i< array.length; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;
        return average;
    };


    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0};

        System.out.println(maximumValue.apply(array));
        System.out.println(minimumValue.apply(array));
        System.out.println(sum.apply(array));
        System.out.println(average.apply(array));
    }
}
