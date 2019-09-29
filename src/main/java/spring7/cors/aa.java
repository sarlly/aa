package spring7.cors;

public class aa {
    public static  void  main(String[]args){
      /*  int max=0;
        int smax=0;
        int s[]={1,2,3,4,5,6,7,8,9,0};
        if(s[0]>s[1])
        {
            max=s[0];
            smax=s[1];
        }
        else
        {
            max=s[1];
            smax=s[0];
        }
        int i=0;
        for(i=2;i<10;i++) {
            if (s[i] > max) {
                smax = max;
                max = s[i];
            } else {
                if (max > s[i] && s[i] > smax) {
                    smax = s[i];
                }
            }
           System.out.println(max);
        }*/
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.println(j+"*"+i+"="+i*j+",");
            }
            System.out.println(" ");
        }

    }
}
