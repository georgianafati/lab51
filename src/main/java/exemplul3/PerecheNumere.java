package exemplul3;

public class PerecheNumere {
    private int a;
    private int b;
    public void setB(int b) {
        this.b = b;
    }
    public void setA(int a) {
        this.a = a;
    }

    public PerecheNumere() {
    }

    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b= b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public boolean fibonaci (int a, int b)
    {
        int n0=0,n1=1,n3=0;
        for(int i=0;i<40;i++)
        {
            n3=n1+n0;
            n0=n1;
            n1=n3;
            if(a==n0&&b==n1)
                return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    public int CMMC() {
        int nr1=a;
        int nr2=b;
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        int cmmc = (nr1 * nr2)/a;
        return cmmc;
    }
}

