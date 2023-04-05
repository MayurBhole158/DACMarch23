class Program{
    public static void main(String[] arg){
        double d = 15.2;

        String str = Double.toString(d);
        System.out.println("double value into String: "+str);

        Double f1 = new Double(d);
        System.out.println("double value into Double instance: "+f1);

        String str1 = new String(str);
        Double f2 = Double.valueOf(str1);
        System.out.println("String instance into Double instance: "+f2);

        //System.out.println("double value into Binary: "+Long.doubleToLongBits(d));
        //System.out.println("double value into Octal: "+Double.toOctalString(d));
        System.out.println("double value into hexadecimal string: "+Double.toHexString(d));
      
    }
}