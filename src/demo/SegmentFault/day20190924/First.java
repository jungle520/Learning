package demo.SegmentFault.day20190924;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wangjiang on 2019/9/24.
 */
public class First {

    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat();
        List<Person> people = new ArrayList<>();
        try {
            people.add(new Person(1, null, sdf.parse("2019-09-23 12:12:12")));
            people.add(new Person(2, "1", sdf.parse("2019-09-23 12:12:12")));
            people.add(new Person(3, null, sdf.parse("2019-09-24 12:12:12")));
            people.add(new Person(4, "1", sdf.parse("2019-09-24 12:12:12")));
            people.add(new Person(5, null, sdf.parse("2019-09-17 12:12:12")));
            people.add(new Person(6, null, sdf.parse("2019-09-24 12:12:12")));
            people.add(new Person(8, null, sdf.parse("2019-09-20 12:12:12")));
            people.add(new Person(9, null, sdf.parse("2019-09-23 12:12:12")));
            people.add(new Person(10, "1", sdf.parse("2019-09-20 12:12:12")));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        people.sort((t1, t2) -> {
            if (t1.getName() == null&&t2.getName()!=null) {
                return -1;
            } else if (t2.getName() == null&&t1.getName()!=null) {
                return -1;
            } else if (Objects.equals(t1.getName(),t2.getName())) {
                return t1.getEntryDate().compareTo(t2.getEntryDate());
            } else {
                return t1.getName().compareTo(t2.getName());
            }
        });
        System.out.println("SORT===========================");
        System.out.println(people);;
    }

}
