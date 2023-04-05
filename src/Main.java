// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        short initialBalance = 429; // начальный баланс
        short paymentAmount = 1960; // сумма пополнения баланса

        short bonusRubles; // переменная, в которой будет хранится значение бонусных рублей
        short finalBalance; // переменная, в которой будет хранится итоговый баланс
        if (paymentAmount > 999) { // если сумма пополнения больше 999 рублей
            bonusRubles = (short) (paymentAmount / 100); // то сумма пополнения делится на 100 = это будут бонусные рубли
            finalBalance = (short) (initialBalance + paymentAmount + bonusRubles); /* а итоговый баланс складывается из
            начального баланса, суммы пополнения и бонусных рублей */
            System.out.println("Бонусных рублей " + bonusRubles); // выводим в консоль текст + значение бонусных рублей
        } else { // иначе, то есть если суииа пополнения меньше или равна 999 рублям
            finalBalance = (short) (initialBalance + paymentAmount); /* бонусных рублей нет, считаем только итоговый
            баланс путем сложения начального баланса и суммы пополнения */
        }

        System.out.println("Итоговый баланс " + finalBalance); /* выводим в консоль текст + значение итогового баланса.
        Эту строчку вынес из оператора, так как её нужно выводить при любом варианте ответа оператора.*/

    }
}