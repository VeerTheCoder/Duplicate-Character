import java.util.Scanner;
class FindDuplicate{
    String duplicate(String str){
       int i,j;
       char c[]=new char[str.length()];
       String ns="";
       for(i=0;i<str.length();i++){
            c[i]=str.charAt(i);
        }
       for(i=0;i<str.length();i++){
            for(j=i+1;j<str.length();j++){
                    if(c[i]==c[j])
                        c[j]='*';
            }
            ns=ns+c[i];
       }
       return ns;
    }
}
class Work{
    public static void main(String[] a){
        FindDuplicate p=new FindDuplicate();
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        s=sc.next();
        System.out.print("After Replacing Duplicate Character:"+p.duplicate(s));
    }
}