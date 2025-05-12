package a08Test1;

import java.util.ArrayList;
import java.util.Collections;

public class text1 {
    public static void main(String[] args) {
        //随机点名器

        ArrayList<String> list = new ArrayList<>();

        //添加元素
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "田七");
//        Random r = new Random();
//        int index = r.nextInt(list.size());
//        String name = list.get(index);
//        System.out.println(name);

        //打乱集合元素顺序
        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);


    }
}
