class Que21{
    public static void main(String[] args){
        long l = 1234;
        Long l1 = new Long(l);

        byte b = l1.byteValue();
        System.out.println("Integer instance into byte : "+b);

        short s = l1.shortValue();
        System.out.println("Integer instance into short : "+s);

        int i2 = l1.intValue();
        System.out.println("Integer instance into short : "+i2);

        long l2 = l1.longValue();
        System.out.println("Integer instance into long : "+l2);

        float f = l1.floatValue();
        System.out.println("Integer instance into float : "+f);

        double d = l1.doubleValue();
        System.out.println("Integer instance into double : "+d);
    }
}