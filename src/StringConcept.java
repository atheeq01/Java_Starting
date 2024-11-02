public class StringConcept {
    public static void main(String[] args){
        String  a="Tutor Joes";
        String  b="tutoR joes";
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("A HashCode : "+a.hashCode());
        System.out.println("B HashCode : "+b.hashCode());
        System.out.println("Equals : "+a.equals(b));
        System.out.println("Equals Ignore Case : "+a.equalsIgnoreCase(b));
        System.out.println("Length : "+a.length());
        System.out.println("CharAt: "+a.charAt(0));
        System.out.println("Uppercase :"+a.toUpperCase());
        System.out.println("Lowercase :"+a.toLowerCase());
        System.out.println("Replace : "+a.replace("Joes","Stantley"));
        System.out.println("Contains : "+a.contains("Joes"));
        System.out.println("Empty : "+a.isEmpty());
        System.out.println("EndWith : "+a.endsWith("es"));
        System.out.println("StratWith : "+a.startsWith("es"));
        System.out.println("Substring : "+a.substring(5));
        System.out.println("Substring : "+a.substring(0,3));
        char[] carray=a.toCharArray();
        for(char c:carray)
            System.out.print(c+" ");
        System.out.println("");
        String c=" tutor ";
        System.out.println("Length : "+c.length());
        System.out.println("C : "+c);
        System.out.println("C Trim : "+c.trim());
        System.out.println("C Trim Length: "+c.trim().length());


    }
}
