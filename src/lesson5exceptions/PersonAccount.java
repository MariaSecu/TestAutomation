package lesson5exceptions;

public class PersonAccount {
    private String personName;
    private int idPerson;
    private double currentAmount;

    public PersonAccount() {

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public double returnTheMoney(double returnMoney) {
        if (currentAmount >= returnMoney) {
            currentAmount = currentAmount - returnMoney;
            try {
                int a = 23 / 0;
            } catch (Exception mariaExeptie) {
                mariaExeptie.printStackTrace();
            } finally {
                System.out.println("indiferent de exceptie sau nu, executam si finally");
            }
            return returnMoney;
        } else
            return 0;
    }

    public static void returnIndex() {
        int[] data = new int[5];
        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(data[i]);
            }
        } catch (ArrayIndexOutOfBoundsException mException) {
        } finally {
            System.out.println("Programul este executat");
        }

    }

    public double transferMoney(double money) {
        if (idPerson > 0 && currentAmount>=money) {
            currentAmount -= money;
        }else {
            System.out.println("Insufficient resources");
        }
            try {
                int b = 12 / 0;
            } catch (ArithmeticException monthMoney) {
            }finally {
                System.out.println("This is an exception");
            }
      return currentAmount;
    }
}
