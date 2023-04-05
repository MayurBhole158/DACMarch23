class Que16{
    public static void main(String[] args){
        int i = 158;
        String str = Integer.toString(i);
        System.out.println("int value into String: " +i);

        Integer i1 = new Integer(i);
        System.out.println("int value into Integer instance: "+i1);

        String str1 = new String(str);
        int i2 = Integer.valueOf(str1);
        System.out.println("String instance into Integer instance: "+i2);

        System.out.println("int value into Binary: "+Integer.toBinaryString(i));
        System.out.println("int value into Octal: "+Integer.toOctalString(i));
        System.out.println("int value into Hexadecimal: "+Integer.toHexString(i));

    }
}