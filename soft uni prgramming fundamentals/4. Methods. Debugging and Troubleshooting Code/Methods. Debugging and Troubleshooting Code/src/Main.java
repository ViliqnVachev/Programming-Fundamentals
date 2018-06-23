public class Main {

    public static void main(String[] args) {

      PrintReceipt();
}

    //methods





     static void PrintTop() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    static  void PrintMiddle(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    static void PrintBottom(){
        System.out.println("------------------------------");
        System.out.println("© SoftUni");
    }

    static void PrintReceipt(){
        PrintTop();
        PrintMiddle();
        PrintBottom();
    }
}
