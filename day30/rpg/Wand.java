package day30.rpg;

public class Wand {
    private String name; //杖の名前
    private double power; //杖の魔力
    //nameフィールドのsetter(引数が必要)
    public void setName(String name){
        this.name = name;
    }
    //nameフィールドのgetter(値を返すことが目的)
    public String getName(){
        return this.name;
    }
    //powerフィールドのsetter(引数が必要)
    public void setPower(double power){
        if(power < 0.5 || power > 100d){
            throw new IllegalArgumentException("魔力が異常です。");
        }
        this.power = power;
    }
    //powerフィールドのgetter(値を返すことが目的)
    public double getPower(){
        return this.power;
    }
    @Override //名前とパワーが等しければOK！とオーバーライドする
    public boolean equals(Object o){
        if(this == o){return true;}
        if(o instanceof Wand){
            Wand wand = (Wand)o;
            if(wand.getName().equals(this.name) && wand.getPower() == this.power){
                return true;
            }
        }
        return false;
    }
}
