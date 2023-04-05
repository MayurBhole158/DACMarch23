class Que17{
    public static void main(String[] args){
        int i = 12;
        Integer i1 = new Integer(i);

        byte b = i1.byteValue();
        System.out.println("Integer instance into byte : "+b);

        short s = i1.shortValue();
        System.out.println("Integer instance into short : "+s);

        int i2 = i1.intValue();
        System.out.println("Integer instance into short : "+i2);

        long l = i1.longValue();
        System.out.println("Integer instance into long : "+l);

        float f = i1.floatValue();
        System.out.println("Integer instance into float : "+f);

        double d = i1.doubleValue();
        System.out.println("Integer instance into double : "+d);


    }
}