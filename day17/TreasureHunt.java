package day17;
import java.util.*;
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] fields = {"地","海","岩","木","★ "}; //「★」は表示したときの為に半角スペース付き
        int[][] map = new int[7][10];
        int chanse = 5;
        System.out.println("次の地図から宝を探してね。");
        System.out.printf("チャンスは%d回。%n",chanse);
        System.out.println();
        System.out.println("宝の地図です。");
        //周りを「5」で囲む配列を用意
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(i == 0 || i == map.length - 1 || j == 0 || j == map[0].length - 1){
                    map[i][j] = 5;
                    System.out.print(map[i][j]);
                }else{
                    map[i][j] = rand.nextInt(fields.length-1);
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
        //宝の地図を表示       
        for(int i = 1; i < map[0].length; i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for(int i = 1; i < map.length - 1; i++){
            System.out.printf("%d ",i + 1);
            for(int j = 1; j < map[0].length - 1; j++){ 
                System.out.print(fields[map[i][j]]);
            }
            System.out.println();
        }
        
        //宝の場所決め
        int treRow = rand.nextInt(map.length-2)+1;
        int treCol = rand.nextInt(map[0].length-2)+1;
        System.out.printf("行%d,列%d,%s%n",treRow+1,treCol+1,fields[map[treRow][treCol]]);
         //ヒント作り
        String[] direction = {"北","南","東","西",};
        String[] hints = new String[4];
        if(map[treRow-1][treCol] != 5){
            hints[0] = "宝の" + direction[0] + "に" + fields[map[treRow-1][treCol]] + "があります";
        }else{
            hints[0] = "宝の" + direction[0] + "にはなにもありません";
        }
        if(map[treRow+1][treCol] != 5){
            hints[1] = "宝の" + direction[1] + "に" + fields[map[treRow+1][treCol]] + "があります";
        }else{
            hints[1] = "宝の" + direction[1] + "にはなにもありません";
        }
        if(map[treRow][treCol+1] != 5){
            hints[2] = "宝の" + direction[2] + "に" + fields[map[treRow][treCol+1]] + "があります";
        }else{
            hints[2] = "宝の" + direction[2] + "にはなにもありません";
        }
        if(map[treRow][treCol-1] != 5){
            hints[3] = "宝の" + direction[3] + "に" + fields[map[treRow][treCol-1]] + "があります";
        }else{
            hints[3] = "宝の" + direction[3] + "にはなにもありません";
        }
        System.out.println();
        boolean isHit = false;
        while(true){
            chanse--;
            System.out.println("座標を入力してください。");
            System.out.print("行>>");
            int row = sc.nextInt();
            System.out.print("列>>");
            int col = sc.nextInt();
            if(treRow == row - 1 && treCol == col - 1){ //当たり
                isHit = true;
                break;
            }else if(chanse == 0){
                break;
            }
            System.out.print("宝はありませんでした。");
            int num1 = rand.nextInt(3);
            switch(num1){
                case 0://方向ヒント
                    int num2 = (row - 1) - treRow;
                    int num3 = (col - 1) - treCol;
                    if(num2 > 0){
                        System.out.printf("もっと%sです。%n",direction[0]);
                    }else if(num2 < 0){
                        System.out.printf("もっと%sです。%n",direction[1]);
                    }else if(num3 < 0){
                        System.out.printf("もっと%sです。%n",direction[2]);
                    }else{
                        System.out.printf("もっと%sです。%n",direction[3]);
                    }
                    break;
                    
                case 1://地形ヒント
                    System.out.printf("宝は「%s」にあります。%n",fields[map[treRow][treCol]]);
                    break;

                case 2://宝の周りヒント
                    int num4 = rand.nextInt(4);
                    switch(num4){
                        case 1:
                            System.out.printf("%s%n",hints[0]);
                            break;
                        case 2:
                            System.out.printf("%s%n",hints[1]);
                            break;
                        case 3:
                            System.out.printf("%s%n",hints[2]);
                            break;
                        case 4:
                            System.out.printf("%s%n",hints[3]);
                            break;
                    }
            }
        }
        System.out.println(isHit ? "宝がみつかりました！":"宝はみつかりませんでした。");
        System.out.println();
        System.out.println("「答え」");
        System.out.println("・宝は★ の場所にありました。");
        map[treRow][treCol] = 4; //宝の場所に★のインデックスを代入
        System.out.printf("行>>%d,列>>%d%n",treRow+1,treCol+1);
        System.out.println();
        for(int i = 1; i < map[0].length; i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for(int i = 1; i < map.length - 1; i++){
            System.out.printf("%d ",i + 1);
            for(int j = 1; j < map[0].length - 1; j++){ 
                System.out.print(fields[map[i][j]]);
            }
            System.out.println();
        }
        sc.close();
    }
}
