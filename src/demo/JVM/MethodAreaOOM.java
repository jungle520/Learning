package demo.JVM;

import com.sun.media.sound.ReferenceCountingDevice;
import com.sun.org.apache.xml.internal.security.encryption.Reference;
import demo.Test;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Transmitter;

/**
 * Created by wangjiang on 2019/9/19.
 */
public class MethodAreaOOM {

    public  Object instance=null;

    private static  final  int  _1MB=1024*1024;

    private byte[]  bigSize=new byte[2 * _1MB];

    public static void main(String[] args) {
        MethodAreaOOM obj1=new MethodAreaOOM();
        MethodAreaOOM obj2=new MethodAreaOOM();
        obj1.instance=obj2;
        obj2.instance=obj1;

        obj1=null;
        obj2=null;



        System.gc();
    }
}
