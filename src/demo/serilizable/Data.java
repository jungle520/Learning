package demo.serilizable;

import java.io.Serializable;

/**
 * Created by wangjiang on 2019/9/21.
 */
public class Data implements Serializable {
    private   int   n;
    public   Data(int   n)   {   this.n   =   n;   }
    public   String   toString()   {   return   Integer.toString(n);   }
}
