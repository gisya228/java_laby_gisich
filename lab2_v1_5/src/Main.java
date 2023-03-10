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
        System.out.print("Введите колво слов: ");
        int n = in.nextInt();
        in.nextLine();
        String vowels = "aeiouyAEIOUY";
        String odds = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";
        String alphabet = vowels + odds;
        boolean flagAlphabet = true;
        int k = 0;
        int l = 0;
        for(int i = 0; i < n; i++){
            System.out.print("введите слово: ");
            String word = in.nextLine();
            if (word != null && !word.trim().isEmpty()){
                for (int j = 0; j < word.length(); j++) {
                    char symb = word.charAt(j);
                    if (alphabet.indexOf(symb) == -1)
                        flagAlphabet = false;
                }
                if (flagAlphabet) {
                    k++;
                    int vowelsNumber = 0;
                    int oddsNumber = 0;
                    for (int j = 0; j < word.length(); j++) {
                        char symb = word.charAt(j);
                        if (odds.indexOf(symb) != -1)
                            oddsNumber++;
                        else
                            vowelsNumber++;
                    }
                    if (vowelsNumber == oddsNumber)
                        l++;
                }
            }
            flagAlphabet = true;
        }
        System.out.println("латинскими " + k);
        System.out.print("гласные и согласные " + l);
    }
}