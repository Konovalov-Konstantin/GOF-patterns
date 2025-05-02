package composite;

public class Client {
    MenuComponent allMenus;

    public Client(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /* чтобы вывести всю иерархию меню — все меню и все их элементы, — достаточно вызвать метод print() для меню верхнего уровня.*/
    public void printMenu() {
        allMenus.print();
    }
}
