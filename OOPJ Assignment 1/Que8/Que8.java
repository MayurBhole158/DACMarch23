class Que8{
    public static void main(String[] args){
        byte b = 20;
        String str = Byte.toString(b);   //a. byte value into String
        System.out.println("Value a = " +b);
        
        Byte z = new Byte(b);
        byte b1 = z.byteValue();
        System.out.println("Value b = "+b1);   //b. byte value into Byte instance.

        //System.out.println(" ");
        String s = new String();
        s = "30";
        byte b2 = Byte.parseByte(s);
        System.out.println("Value c = "+b2);  //c. String instance into Byte instance
    }
}