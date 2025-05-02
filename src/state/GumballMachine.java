//package state;
//
//public class GumballMachine {
//
//    @Override
//    public String toString() {
//        String state;
//        if (count > 0) {
//            state = "-- Автомат в ожидании монеток";
//        } else {
//            state = "-- В автомате нет жвачек";
//        }
//        return "-- В автомате: " + count + " жвачек\n" + state;
//    }
//
//  /* Четыре СОСТОЯНИЯ заданы цислами */
//    /**
//     * в автомате нет жвачек
//     */
//    final static int SOLD_OUT = 0;
//    /**
//     * в автомате нет монеток
//     */
//    final static int NO_QUARTER = 1;
//    /**
//     * в автомате есть монетки
//     */
//    final static int HAS_QUARTER = 2;
//    /**
//     * жвачка была продана
//     */
//    final static int SOLD = 3;
//
//    int state = SOLD_OUT;   // текущее состояние
//    int count = 0;          // количество шариков в автомате
//
//    public GumballMachine(int count) {      // если шаков больше нуля -> автомат переходит в состояние NO_QUARTER
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
//
//  /* бросить монетку в автомат */
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("В автомате уже есть монетка, вы не можете положить вторую");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("Вы положили монетку");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Извините, все жвачки распроданы");
//        } else if (state == SOLD) {
//            System.out.println("Подождите, мы выдаем вашу жвачку");
//        }
//    }
//
//  /* попытка вернуть монетку */
//    public void ejectQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Возьмите обратно вашу монетку");
//            state = NO_QUARTER;
//        } else if (state == NO_QUARTER) {
//            System.out.println("В автомате нет монеток, нечего возвращть");
//        } else if (state == SOLD) {
//            System.out.println("Жвачка уже куплена, возврат невозможен");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Жвачка кончилась, возврат невозможен — автомат не принимает монетки");
//        }
//    }
//
//  /* дернуть за рычаг */
//    public void turnCrank() {
//        if (state == SOLD) {
//            System.out.println("Вы уже получили вашу жвачку, чтоб получить еще одну - положите монетку!");
//        } else if (state == NO_QUARTER) {
//            System.out.println("Чтоб получить жвачку, сначала нужно бросить монетку");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Выдача невозможна — в автомате нет шариков");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("Вы дернули за рычаг...");
//            state = SOLD;
//            dispense(); // выдача шарика
//        }
//    }
//
//  /* выдача шарика */
//    public void dispense() {
//        if (state == SOLD) {
//            System.out.println("Возьмите жвачку в слоте");
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Жвачка закончилась!");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        } else if (state == NO_QUARTER) {
//            System.out.println("Сначала положите монетку");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Жвачка закончилась");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("Жевательная резинка не выдается");
//        }
//
//}
