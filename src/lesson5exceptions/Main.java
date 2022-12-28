package lesson5exceptions;

public class Main {
    public static void main(String[] args){
        PersonAccount lion = new PersonAccount();
        lion.setCurrentAmount(500.98);
        System.out.println(lion.returnTheMoney(300));
        System.out.println(lion.getCurrentAmount());
        PersonAccount.returnIndex();
        lion.setIdPerson(15);
        System.out.println("The requested money is: " + lion.transferMoney(398.8));
        System.out.println("The second request money is: " + lion.transferMoney(50.5));
    }
}
