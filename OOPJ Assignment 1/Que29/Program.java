class Program{
    public static void main(String[] args){
        double d = 123.4;
        Double d1 = new Double(d);

        byte b = d1.byteValue();
        System.out.println("Double instance into byte : "+b);

        short s = d1.shortValue();
        System.out.println("Double instance into short : "+s);

        int i = d1.intValue();
        System.out.println("Double instance into short : "+i);

        long l = d1.longValue();
        System.out.println("Double instance into long : "+l);

        float f = d1.floatValue();
        System.out.println("Double instance into float : "+f);

        double d2 = d1.doubleValue();
        System.out.println("Double instance into double : "+d2);
    }
}