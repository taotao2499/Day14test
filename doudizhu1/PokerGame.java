package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
     static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌

        // 定义花色数组
        String[] colors = {"♥", "♠", "♣", "♦"};
        // 定义点数数组
        String[] numbers = {"3","4","5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        // 创建一个集合存储牌

        // 拼接牌
        for (String c : colors) {
            for (String n : numbers) {
                list.add(c + n);
            }
        }

        // 单独添加大小王
        list.add(" 大王");
        list.add(" 小王");

    }

    public  PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        //创建三个集合分别存储玩家的牌和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历集合，获取每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //留出三张底牌
            if (i <= 2){
                dipai.add(poker);
                continue;
            }
            //发牌
            if (i % 3 == 0){
                player1.add(poker);
            }
            if (i % 3 == 1){
                player2.add(poker);
            }
            if (i % 3 == 2){
                player3.add(poker);
            }
        }
        //看牌
        lookPoker("底牌",dipai);
        lookPoker("吴彦祖",player1);
        lookPoker("成龙",player2);
        lookPoker("刘德华",player3);

    }

    public  void lookPoker(String name,ArrayList<String> list){
        System.out.println(name+"的牌是：");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }





}
