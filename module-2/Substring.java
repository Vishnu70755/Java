public class Substring {
    public static void main(String[] args) {
        java.lang.String str = "vishnu IS  the bESt";
        java.lang.String s1 = str.toUpperCase();
        java.lang.String s2 = str.toLowerCase();
        java.lang.String s3 = str.substring(5, 15); // Correct the indices as needed
        java.lang.String s4 = str.substring(9);
        int l=str.length();
        boolean bo=str.contains("vish");
        char ch[]=str.toCharArray();
        String s=str.replace('i', 'o');
        String st[]=str.split("");
        String stri=str.concat(" and Awesome");
        String v=str+" is great";
        char chs=str.charAt(8);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(l);
        System.out.println(ch);
        System.out.println(s);
        System.out.println(str);
        System.out.println(stri);
        System.out.println(bo);
        System.out.println(v);
        System.out.println(chs);


    }
}
