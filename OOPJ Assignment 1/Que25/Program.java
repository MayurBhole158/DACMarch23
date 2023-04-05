class Program{
    public static void main(String[] args){
        float f = 123.14f;
        Float f1 = new Float(f);

        byte b = f1.byteValue();
        System.out.println("Float instance into byte : "+b);

        short s = f1.shortValue();
        System.out.println("Float instance into short : "+s);

        int i = f1.intValue();
        System.out.println("Float instance into short : "+i);

        long l = f1.longValue();
        System.out.println("Float instance into long : "+l);

        float f2 = f1.floatValue();
        System.out.println("Float instance into float : "+f2);

        double d = f1.doubleValue();
        System.out.println("Float instance into double : "+d);
    }
}