

public class Test04 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        int src[]=a,des[]=b;
        int srcPos=2;
        int desPos=3;
        int length=2;
        System.arraycopy(src, srcPos, des,desPos,length);
        for(int i=0; i<b.length; i++)
            System.out.print(b[i]+" ");
    }
    
}
