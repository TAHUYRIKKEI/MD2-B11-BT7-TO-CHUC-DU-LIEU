import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static <Persion> void xuLyDanhSachCu(Queue<Persion>ListNu, Queue<Persion> ListNam, ArrayList<Persion> listPeron){
        for (int i = 0; i < listPeron.size(); i++) {
            Persion holder = listPeron.get(i);
            if (holder.equals().equals("Nu")){
                ListNu.add(holder);
            }else {
                ListNam.add(holder);
            }
        }
    }
    public static <Persion> ArrayList newList(Queue<Persion>ListNu, Queue<Persion>ListNam){
        ArrayList<Persion>newListPeron = new ArrayList<>();
        for (Persion p:
                ListNu) {
            newListPeron.add(p);
        }
        for (Persion p:
                ListNam) {
            newListPeron.add(p);
        }
        return newListPeron;
    }
    public static <Persion> ArrayList inputData(){
        ArrayList<Persion> listPeron = new ArrayList<>();
        Persion persion1 = new Persion("Nhat Anh","Nam","2016");
        Persion persion2 = new Persion("Minh Anh","Nam","2019");
        Persion persion3 = new Persion("Bap","Nu","2017");
        Persion persion4 = new Persion("Bong","Nu","2019");
        Persion persion5 = new Persion("Dat","Nam","2011");
        listPeron.add(persion1);
        listPeron.add(persion2);
        listPeron.add(persion3);
        listPeron.add(persion4);
        listPeron.add(persion5);

        return listPeron;
    }



    public static void showData(ArrayList<Persion>list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() +"; gioi tinh:"+ list.get(i).getGender() + " ; nam sinh :" + list.get(i).getDayOfBirth()) ;

        }
    }



    public static <Persion> void main(String[] args) {
        Queue<Persion> ListNu = new LinkedList<>();
        Queue<Persion> liestNam = new LinkedList<>();
        ArrayList<Persion> listPeron = inputData();
        xuLyDanhSachCu(ListNu,liestNam,listPeron);
        ArrayList<Persion> newlistPerson;
        newlistPerson = newList(ListNu,liestNam);
        showData(newlistPerson);


    }

    private static <Persion> void showData(ArrayList<Persion> newlistPerson) {
    }
}