package demo.SegmentFault.day20190924;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wangjiang on 2019/9/24.
 */
public class Person {
    private int id;
    private  String name;
    private Date date;

    public Person(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getEntryDate() {
        return date;
    }
}
