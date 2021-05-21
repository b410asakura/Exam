import java.util.Scanner;

public class Yuridicheskiy extends Bible{
    public void dobavleniyeKnig(){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Kolichestvo knig");
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Pishi");
            String title = scanner.nextLine();
            ident1.add(title);
            title = scanner.nextLine();
            author1.add(title);
            title = scanner.nextLine();
            name1.add(title);
            title = scanner.nextLine();
            data1.add(title);
        }
    }
    public void vivodKnig() {
        for (int i=0; i<ident1.size(); i++){
            System.out.print(ident1.get(i)+"   ");
            System.out.print(author1.get(i)+"   ");
            System.out.print(name1.get(i)+"   ");
            System.out.print(data1.get(i)+"   ");
            System.out.println();
        }
    }
    public void vivodInfo() {
        System.out.println("YUR");
        vivodKnig();
    }
    public void poisk(){
        System.out.println("AVTOR: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        for(int o=0; o<author1.size(); o++ ){
            if(author1.get(o).equals(title)){
                System.out.print(ident1.get(o)+"   ");
                System.out.print(author1.get(o)+"   ");
                System.out.print(name1.get(o)+"   ");
                System.out.print(data1.get(o)+"   ");
                System.out.println();
            }
        }
    }
    public void vivodNameIKol() {
        System.out.print("Yur");System.out.println(author1.size());

    }


}
