public class Main {

    public static void Main() {
        LibAdmin libAdmin = LibAdmin.loginAsAdmin();
        LibManager libManager = new LibManager(libAdmin); // set manager for admin (1<->1 relation)

        libManager.addBook(new LibBook("Хоббит"));
        libManager.addBook(new LibBook("Гарри Поттер")); // add book to bookStore
        libManager.addBook(new LibBook("Война и мир"));

        LibWorker workerDima = new LibWorker("Дмитрий");
        libManager.addWorker(workerDima);

        LibVisitor visitorVasya = new LibVisitor("Василий");
        LibVisitor visitorPetya = new LibVisitor("Петр");
        libManager.addVisitor(visitorPetya); // add visitor to list of visitors
        libManager.addVisitor(visitorVasya);

        libAdmin.addToBlackList(visitorPetya); // black list case

        LibOrder orderVasya = new LibOrder("Гарри Поттер");
        LibOrder orderPetya = new LibOrder("Война и мир");
        // if exist -> add book to order, add order to vasya
        if (null == libManager.orderBy(visitorVasya, orderVasya, workerDima)) {
            System.out.println("Нельзя выдать книгу читателю " + visitorVasya.getName());
        } else {
            System.out.println("Книга \"" + orderVasya.getBookName() + "\" зарегистрирована в заказе № " + orderVasya.getOrderNum());
        }

        if (null == libManager.orderBy(visitorPetya, orderPetya, workerDima)) {
            System.out.println("Нельзя выдать книгу читателю " + visitorPetya.getName());
        } else {
            System.out.println("Книга \"" + orderPetya.getBookName() + "\" зарегистрирована в заказе № " + orderPetya.getOrderNum());
        }


        System.out.println("\n" + libManager.getOrdersTableString());
    }
}