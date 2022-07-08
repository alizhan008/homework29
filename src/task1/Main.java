package task1;


import java.util.Comparator;
import java.util.Iterator;

import static task1.Cat.Color.TABBY;


public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);

        cats.sort(Cat::byBreed); //сортировка по породе кота
        Printer.print(cats);
        cats.sort(Cat::byName);  //сортировка по имени
        Printer.print(cats);
        cats.sort(Comparator.comparingInt(Cat::getAge)); //сортировка по возрасту
          cats.removeIf(o-> o.getColor().equals(Cat.Color.PEACH));
        Printer.print(cats);



        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
