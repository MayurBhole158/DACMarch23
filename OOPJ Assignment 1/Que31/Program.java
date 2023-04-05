class Program{
    public static void main(String[] args){
        String str = new String("123A");  //Exception in thread "main" java.lang.NumberFormatException: For input string: "123A"
        int i = Integer.parseInt(str);
        System.out.println("Number :"+i);
    }
}