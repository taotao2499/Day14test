package a08Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        //不重复的点名器
        //创建一个集合存储名字
        ArrayList<String> list1 = new ArrayList<>();
        //添加名字
        Collections.addAll(list1,"张三丰","李四狐","王五","赵荆轲","田七七","知更鸟","胡汉三","要命");
        //创建一个集合存储已经点到的名字
        ArrayList<String> list2 = new ArrayList<>();

        //外循环
        for (int i = 1; i <= 8; i++) {
            System.out.println("第"+i+"轮点名开始");
            //获取集合的长度
            int count = list1.size();
            //随机点名
            Random r = new Random();
            //内循环
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }

            //此时表示一轮点名结束
            list1.addAll(list2);
            list2.clear();
        }

    }
}
