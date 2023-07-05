public class Array {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        intArray[0] = 10;
        System.out.println(intArray[0]);

        float[] floatArray = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
        System.out.println(floatArray[4]);

        double [] doubleArray;
        doubleArray = new double[]{1.1d,2.2d,3.3d,4.4d,5.5d,6.6d,7.7d,8.8d,9.9d};
        double x_2 = doubleArray[1] = 22.22d;
        System.out.println(x_2);
        //System.out.println(doubleArray);
    }
}
