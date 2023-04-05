class Que9{
    public static void main(String[] args){
        byte b = 120;
        Byte b1 = new Byte(b);
        byte b2 = b1.byteValue();
        System.out.println("byte value :" +b2);   //Byte instance into byte

        short s = b1.shortValue();
        System.out.println("short value :" +s);  //Byte instance into short

        int i = b1.intValue();
        System.out.println("int value :"+i);   //Byte instance into int

        long l = b1.longValue();
        System.out.println("long value :"+l);   //Byte instance into long

        float f = b1.floatValue();
        System.out.println("long value :"+f);   //Byte instance into float

        double d = b1.doubleValue();
        System.out.println("double value :"+d);   //Byte instance into double

    }
}