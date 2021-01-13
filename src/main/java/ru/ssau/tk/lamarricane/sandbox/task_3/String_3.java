package ru.ssau.tk.lamarricane.sandbox.task_3;

public class String_3 {
    public static void main(String[] args) {
        String str = "shark shark";
        String str1 = new String(str);
        String str2 = "shark shark";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1) {
            System.out.println("str==str1");
        }
        if (str.equals(str1)) {
            System.out.println("str.equals(str1)");
        }
    }
}
