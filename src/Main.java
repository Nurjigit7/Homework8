import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random =new Random();
//        int[] massiv=new int[20];
//        for (int i = 0; i < massiv.length; i++) {
//            massiv[i]=random.nextInt(1,20);
//            System.out.print(massiv[i]+"  ");
//        }
//        int max=massiv[0];
//        int min=massiv[0];
//        double orto=100;
//        for (int i = 0; i < massiv.length; i++) {
//            if (max<massiv[i]){
//                max=massiv[i];
//            }
//            if (min>massiv[i]){
//                min=massiv[i];
//            }
//            orto += (double) massiv[i] /massiv.length;
//
//        }
//        System.out.println();
//        System.out.println("max : "+max);
//        System.out.println("min : "+min);
//        System.out.println("ortocho san : "+orto);


//        Scanner sc =new Scanner(System.in);
//        metod(sc.nextInt());
//    }
//  static void metod(int a){
//        if (a>2023){
//            System.out.println(a + " tuura emes!");
//        } else {
//          System.out.println(2023-a + " jashtasyz!");
//        Scanner sc =new Scanner(System.in);
//        merod(sc.nextInt(), sc.nextInt());
//  }
//  static void merod (int a, int b){
//        if (a<b){
//            System.out.println(a);
//        }else if (a>b){
//            System.out.println(b);
//        }


//        Random ran = new Random();
//        metod(ran.nextInt(1, 10), ran.nextInt());
//    }
//
//    static void metod(int a, int b) {
//        for (int i = 0; i < b; i++) {
//            System.out.println(b + "");
//        }
//        for (int j = 0; j < 5; j++) {
//            System.out.println(a);

        //}


        System.out.println("\n 3: 4: 5: ");
        System.out.println(metod(3, 4, 5));
    }

    static int metod(int a, int b, int c) {
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0) {
                a += i;
            } else if (i % 4 == 0) {
                b += i;
            } else if (i % 5 == 0) {
                c += i;
            }
        }
        return a + b + c;
    }


}