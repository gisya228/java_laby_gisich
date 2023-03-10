import java.util.Date;
import java.util.Scanner;
public class Main {
    static String fio;
    static Date getDateOfTask;
    static Date getDateOfFinishTask;
    static String ImputFio() {
        Scanner conin = new Scanner(System.in);
        System.out.println("Enter FIO ");
        fio = conin.nextLine();
        System.out.println("Your FIO " + fio);
        return fio;
    }
    static Date getDateOfBeginTask() {
        Date getDateOfTask = new Date();
        getDateOfTask.getDate();
        System.out.println("Date of begin " + getDateOfTask);
        return getDateOfTask;
    }
    static Date getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        Long time = getDateOfFinishTask.getTime();
        long anotherDate = +7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        getDateOfFinishTask = new Date(time);
        System.out.println("Date Of Finish Task = " + getDateOfFinishTask);
        return getDateOfFinishTask;
    }


    public static void main(String[] args) {
        ImputFio();
        getDateOfBeginTask();
        getDateOfFinishTask();
        Scanner in = new Scanner(System.in);
        System.out.print("введите количество слов: ");
        int n = in.nextInt();
        in.nextLine();
        boolean flag = true;
        String[] stringArray = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("введите слово: ");
            stringArray[i] = in.nextLine();
        }
        for (int i = 0; i < n; i++){
            if (stringArray[i] != null && !stringArray[i].trim().isEmpty()){
                for (int j = 0; j < stringArray[i].length() - 1; j++) {
                    char symb = stringArray[i].charAt(j);
                    char symb2 = stringArray[i].charAt(j + 1);
                    if (symb >= symb2)
                        flag = false;
                }
                if (flag) {
                    System.out.println("это слово " + stringArray[i]);
                    break;
                }
            }
            flag = true;
        }

    }
}