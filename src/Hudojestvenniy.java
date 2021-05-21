import java.util.Scanner;

public class Hudojestvenniy extends Bible{
    public void dobavleniyeKnig(){
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Kolichestvo knig");
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Pishi");
            String title = scanner.nextLine();
            ident.add(title);
            title = scanner.nextLine();
            author.add(title);
            title = scanner.nextLine();
            name.add(title);
            title = scanner.nextLine();
            data.add(title);
        }
    }
    public void vivodKnig() {
        for (int i=0; i<ident.size(); i++){
            System.out.print(ident.get(i)+"   ");
            System.out.print(author.get(i)+"   ");
            System.out.print(name.get(i)+"   ");
            System.out.print(data.get(i)+"   ");
            System.out.println();
        }
    }
    public void vivodInfo() {
        System.out.println("HUD");
        vivodKnig();
    }
    public void poisk(){
        System.out.println("AVTOR: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        for(int o=0; o<author.size(); o++ ){
            if(author.get(o).equals(title)){
                System.out.print(ident.get(o)+"   ");
                System.out.print(author.get(o)+"   ");
                System.out.print(name.get(o)+"   ");
                System.out.print(data.get(o)+"   ");
            }
        }
    }
    public void vivodNameIKol() {
        System.out.print("Hudoj");System.out.println(author.size());

    }
}
