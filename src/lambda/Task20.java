package lambda;

import java.util.*;

public class Task20 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        Plant p1=new Plant(1,"Rose",0.5);
        Plant p2=new Plant(5, "Apple tree",2);
        Plant p3 =new Plant(9,"Oak",5.6);
        Plant p4 =new Plant(2,"carnberry",0.6);

        ArrayList<Plant> plantList=new ArrayList<>();
        plantList.add(p1);
        plantList.add(p2);
        plantList.add(p3);
        plantList.add(p4);
        for (Plant p:plantList){
            p.printPlant();
        }

        System.out.println("---------------\n Type the key for sorting:");
        String key=input.next();

//        ArrW sort=(arr,k)->{
//            if(k=="age"){
//                arr.sort(Comparator.comparing(Plant::getAge));
//            }
//        };

//        Comparator<Plant> compareAge=plantList.sort(Comparator.comparing(Plant::getAge));

        if (key=="age"){
            plantList.sort(Comparator.comparing(Plant::getAge));
        } else if (Objects.equals(key, "height")) {
            plantList.sort(Comparator.comparing(Plant::getHeight));
        }else if(key=="species"){
            plantList.sort(Comparator.comparing(Plant::getSpecies));
        }else{
            System.out.println("no match found");
        }

        for (Plant p:plantList){
            p.printPlant();
        }
        System.out.println();
    }

}

class Plant{
    int age;
    String species;
    double height;

    Plant (int age,String sp,double height){
        this.age=age;
        this.species=sp;
        this.height=height;
    }

    void printPlant(){
        System.out.println(this.species+" "+this.age+" "+this.height);
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }
}
