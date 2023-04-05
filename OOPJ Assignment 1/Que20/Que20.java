class Que20{
    public static void main(String[] arg){
        long l = 4582;
        Long l1 = new Long(l);
        System.out.println("long value into Long instance: "+l1);

        String str = Long.toString(l);
        System.out.println("long value into String: "+str);

        String str1 = new String(str);
        long l2 = Long.valueOf(str1);
        System.out.println("String instance into Long instance: "+l2);

        System.out.println("int value into Binary: "+Long.toBinaryString(l));
        System.out.println("int value into Octal: "+Long.toOctalString(l));
        System.out.println("int value into Hexadecimal: "+Long.toHexString(l));
      
    }
}