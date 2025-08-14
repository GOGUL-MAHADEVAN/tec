import java.util.Scanner;
public class Strmet
{
 public static void main(String[] args)
 {
    String s1="welcome to java";
    String s2=s1;
    String s3=new String("welcome to java");
    String s4=s1.intern();
    System.out.println("        == compassion     ");
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1==s4);
    System.out.println(s2==s3);
    System.out.println(s3==s4);
    System.out.println("      equals compassion    ");
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s3));
    System.out.println(s2.equals(s3));
    System.out.println(s1.equals(s2));
    System.out.println(s2==s4);
    System.out.println(s1.substring(3));
    System.out.println(s1.substring(1,3));
    System.out.println(s1.startsWith("wel"));
    System.out.println(s1.endsWith("java"));
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println("Hi".trim());
    System.out.println(s1.replace('o','O'));
    System.out.println(s1.replaceAll("o","O"));
    System.out.println(s1.replaceFirst("o","O"));
    String[] s5=s1.split("O");
    String[] s6=s1.split("O",4);
    for (String a : s5)
    System.out.println(a);
    for (String a : s6)
    System.out.println(a);
    System.out.println(s1.toCharArray());
    System.out.println(s1.codePointAt(0));
    System.out.println(s1.contains("or"));
    System.out.println("\nPrinting Hash Values: ");
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
    System.out.println("\nOther Methods: ");
    System.out.println(s1.toCharArray());
    System.out.println(s1.codePointAt(0));
    System.out.println(s1.contains("or"));
}
}
