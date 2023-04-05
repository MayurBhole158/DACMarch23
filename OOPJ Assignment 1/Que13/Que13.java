class Que13{
    public static void main(String[] args){
        short a = 1235;
        String s = Short.toString(a);
        System.out.println("short value into String: "+s);
        Short s1 = new Short(a);
        System.out.println("short value into Short instance: "+s1);

        String str = new String(s);
        short s2 = Short.parseShort(str);
        System.out.println("String instance into Short instance: "+s2);
    }
}
