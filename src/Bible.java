import java.util.ArrayList;
import java.util.Scanner;

class Bible {
    public ArrayList<String> ident =new ArrayList<>();
    public ArrayList<String> author =new ArrayList<>();
    public ArrayList<String> name =new ArrayList<>();
    public ArrayList<String> data =new ArrayList<>();

    public ArrayList<String> ident1 =new ArrayList<>();
    public ArrayList<String> author1 =new ArrayList<>();
    public ArrayList<String> name1 =new ArrayList<>();
    public ArrayList<String> data1 =new ArrayList<>();

    public ArrayList<String> ident2 =new ArrayList<>();
    public ArrayList<String> author2 =new ArrayList<>();
    public ArrayList<String> name2 =new ArrayList<>();
    public ArrayList<String> data2 =new ArrayList<>();



    public void dobavleniyeKnig() {
    }
    public void vivodKnig() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("kakoy otdel");
        int num1 = scan1.nextInt();
        if(num1==1){
            for (int i=0; i<ident.size(); i++){
                System.out.print(ident.get(i)+"   ");
                System.out.print(author.get(i)+"   ");
                System.out.print(name.get(i)+"   ");
                System.out.print(data.get(i)+"   ");
                System.out.println();
            }
        }
        if(num1==2){
            for (int i=0; i<ident1.size(); i++){
                System.out.print(ident1.get(i)+"   ");
                System.out.print(author1.get(i)+"   ");
                System.out.print(name1.get(i)+"   ");
                System.out.print(data1.get(i)+"   ");
                System.out.println();
            }
        }
        if(num1==3){
            for (int i=0; i<ident2.size(); i++){
                System.out.print(ident2.get(i)+"   ");
                System.out.print(author2.get(i)+"   ");
                System.out.print(name2.get(i)+"   ");
                System.out.print(data2.get(i)+"   ");
                System.out.println();
            }
        }
    }
    public void vivodInfo() {
    }
    public void poisk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishi");
        String title = scanner.nextLine();
        for(int o=0; o<author.size(); o++ ){
            if(author.get(o).equals(title)){
                System.out.print(ident.get(o)+"   ");
                System.out.print(author.get(o)+"   ");
                System.out.print(name.get(o)+"   ");
                System.out.print(data.get(o)+"   ");
            }
        }
        for(int o=0; o<author1.size(); o++ ){
            if(author1.get(o).equals(title)){
                System.out.print(ident1.get(o)+"   ");
                System.out.print(author1.get(o)+"   ");
                System.out.print(name1.get(o)+"   ");
                System.out.print(data1.get(o)+"   ");
            }
        }
        for(int o=0; o<author2.size(); o++ ){
            if(author2.get(o).equals(title)){
                System.out.print(ident2.get(o)+"   ");
                System.out.print(author2.get(o)+"   ");
                System.out.print(name2.get(o)+"   ");
                System.out.print(data2.get(o)+"   ");
            }
        }
    }
    public void kolichestvoKnig() {
        System.out.println("Выберите цифру определенного отдела от 1-3");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num==1){
            System.out.println(author.size());
            System.out.println(author1.size());
            System.out.println(author2.size());
        }
        if (num==2){
            System.out.println(author1.size());
        }
        if (num==3){
            System.out.println(author2.size());
        }
    }
    public void vivodNameIKol() {
        System.out.print("Hudoj");System.out.println(author.size());
        System.out.print("Yur");System.out.println(author1.size());
        System.out.print("Teh");System.out.println(author2.size());

    }

}