package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static  HashMap<Integer,String> hm = new HashMap<>();
    //定义一个集合存储牌
     static ArrayList<Integer> list = new ArrayList<>();

    static {
        //准备牌

        //序号
        int serialNumber = 1;
        // 定义花色数组
        String[] colors = {"♥", "♠", "♣", "♦"};
        // 定义点数数组
        String[] numbers = {"3","4","5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        // 创建一个集合存储牌

        // 拼接牌
        for (String n : numbers) {
            for (String c : colors) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }

        // 单独添加大小王
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);



    }
    public  PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        //创建三个集合分别存储玩家的牌和底牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        //遍历集合，获取每一张牌
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            //留出三张底牌
            if (i <= 2){
                dipai.add(serialNumber);
                continue;
            }
            //发牌
            if (i % 3 == 0){
                player1.add(serialNumber);
            }else if (i % 3 == 1){
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }

        }
        //看牌
        lookPoker("底牌",dipai);
        lookPoker("吴彦祖",player1);
        lookPoker("成龙",player2);
        lookPoker("刘德华",player3);
    }
    public  void lookPoker(String name,TreeSet<Integer> ts){
        System.out.println(name+"的牌是：");
        for (int serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }



}
