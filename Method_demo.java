
class Computer{
    public void playMusic(){
        System.out.println("Music is playing.....");
    }
    public String getPen(int cost){
        if(cost<=10){
            return "Pen";
        }
        else{
            return "Nothing";
        }
    }
}
public class Method_demo {
    public static void main(String[] args){
        Computer obj = new Computer();
        obj.playMusic();
        String Res = obj.getPen(12);
        System.out.println(Res);
    }
}
