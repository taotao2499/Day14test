package a08Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //带概率的随机点名器

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,1,1,1,1,1,1);
        Collections.addAll(list, 0,0,0);
        //打乱顺序
        Collections.shuffle(list);
        //从list集合中随机获取一个元素
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        //创建两个集合分别存储男生和女生的名字
        ArrayList<String> boysList = new ArrayList<>();
        ArrayList<String> girlsList = new ArrayList<>();

        Collections.addAll(boysList, "张三丰","李四狐","王五","赵荆轲","田七七","知更鸟","胡汉三","要命");
        Collections.addAll(girlsList, "梨花诗","田密蜜","如花","黑天鹅","妈妈","星期日","七公主","王八蛋");

        if (number == 1){
            //随机获取一个男生的名字
            int boyIndex = r.nextInt(boysList.size());
            String boyName = boysList.get(boyIndex);
            System.out.println(boyName);
        }else {
            //随机获取一个女生的名字
            int girlIndex = r.nextInt(girlsList.size());
            String girlName = girlsList.get(girlIndex);
            System.out.println(girlName);
        }


    }
}
