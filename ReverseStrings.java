//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseStrings {
    public static void main(String[] args) {
       String str = "helloworld";
       String result = "";

       for (int i = str.length()-1; i>=0; i--)
           result+=str.charAt(i);

       System.out.println(result);
    }
}