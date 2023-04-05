class Program{
    public static void main(String[] arg){
        float f = 458.2f;

        String str = Float.toString(f);
        System.out.println("float value into String "+str);

        Float f1 = new Float(f);
        System.out.println("float value into Float instance. "+f1);

        String str1 = new String(str);
        Float f2 = Float.valueOf(str1);
        System.out.println("String instance into Float instance: "+f2);

        System.out.println("float value into hexadecimal string: "+Float.toHexString(f));
      
    }
}