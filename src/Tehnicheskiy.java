import java.util.Scanner;

public class Tehnicheskiy extends Bible{
    String sup = "da";
    public void dobavleniyeKnig(){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Kolichestvo knig");
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Pishi");
            String title = scanner.nextLine();
            ident2.add(title);
            title = scanner.nextLine();
            author2.add(title);
            title = scanner.nextLine();
            name2.add(title);
            title = scanner.nextLine();
            data2.add(title);
        }
    }
    public void vivodKnig() {
        for (int i=0; i<ident2.size(); i++){
            System.out.print(ident2.get(i)+"   ");
            System.out.print(author2.get(i)+"   ");
            System.out.print(name2.get(i)+"   ");
            System.out.print(data2.get(i)+"   ");
            System.out.println();
        }
    }
    public void vivodInfo() {
        System.out.println("TEH");
        vivodKnig();
        System.out.println("Наличие компа " + sup);

    }
    public void poisk(){
        System.out.println("AVTOR: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        for(int o=0; o<author2.size(); o++ ){
            if(author2.get(o).equals(title)){
                System.out.print(ident2.get(o)+"   ");
                System.out.print(author2.get(o)+"   ");
                System.out.print(name2.get(o)+"   ");
                System.out.print(data2.get(o)+"   ");
            }
        }
    }
    public void vivodNameIKol() {
        System.out.print("Teh");System.out.println(author2.size());
    }
}
