package pair;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PairOfNumbers {
    @Test
            public void GetPairOfNumbers()
    {
    int[] ar = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};
    int key = 4;
    List<String> eResult = new ArrayList<>();
        eResult.add("{1,4}");
        eResult.add("{2,-2}");
        eResult.add("{-1,5}");
        eResult.add("{4,0}");
        eResult.add("{10,40}");

    List<String> aResult = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
        for(int j=i+1;j<ar.length;j++){
            if(sum(ar[i],ar[j]) == key){
                aResult.add(getPair(ar[i],ar[j]));
            }
            else if(diff(ar[i],ar[j]) == key){
                aResult.add(getPair(ar[i],ar[j]));
            }
            else if(mul(ar[i],ar[j]) == key){
                aResult.add(getPair(ar[i],ar[j]));
            }
            else if(div(ar[i],ar[j]) == (float)key){
                aResult.add(getPair(ar[i],ar[j]));
            }
        }
    }


    int i=0;
        for (String expected : eResult){
        Assert.assertEquals(aResult.get(i++),expected);

    }
}

    public int sum(int a, int b){
        return a+b;
    }
    public int diff(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public float div(float a, float b){
        if(a>b){
            return a/b;
        }
        else{
            return b/a;
        }
    }
    public String getPair(int a, int b){
        return "{" + a + "," + b + "}";
    }


}
