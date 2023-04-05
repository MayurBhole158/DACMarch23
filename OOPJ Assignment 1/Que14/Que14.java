class Que14{
    public static void main(String[] args){
        short s = 105;
        Short s1 = new Short(s);

        byte b1 = s1.byteValue();
        System.out.println("Short instance into byte: "+b1);
    
        short s2 = s1.shortValue();
        System.out.println("Short instance into short: "+s2);
    
        int i = s1.intValue();
        System.out.println("Short instance into int: "+i);

        long l = s1.longValue();
        System.out.println("Short instance into long: "+l);

        float f = s1.floatValue();
        System.out.println("Short instance into float: "+f);

        double d = s1.doubleValue();
        System.out.println("Short instance into double: "+d);



    }
}