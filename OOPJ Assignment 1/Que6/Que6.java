class Que6{

    public static void main( String[] args )
    {
        boolean b = true;
        String str = String.valueOf(b);  //a. boolean value into String
        System.out.println("Value a = "+str);
    
        Boolean b1 = Boolean.valueOf(b);   //b. boolean value into Boolean instance.
        System.out.println("Value b = "+b1);     
        
        String str1 = new String("tRUe");
        boolean b2 = Boolean.parseBoolean(str1);   //c. String value into boolean value
        System.out.println("Value c = "+b2);

        String str2 = "TruE";
        boolean b3 = Boolean.valueOf(str2);   //d. String value into Boolean instance.
        System.out.println("Value d = "+b3);
        */
    }
}
