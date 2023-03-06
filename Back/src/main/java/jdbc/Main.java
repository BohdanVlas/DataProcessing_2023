package jdbc;

import Entity.HistoryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Main {
    public static void main(String[] args) {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(HistoryEntity.class)
                .buildMetadata()
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.save(new HistoryEntity(
                    1
                    , "hist-1"
                    , "hist1"
                    , "2017"
                    , "2017-2.jpg"
                    , "Створення та впровадження у<BR>\n" +
                    "виробництво лінійки<BR>\n" +
                    "середньотонажної техніки колісної<BR>\n" +
                    "формули 4х2 вантажопідйомністю<BR>\n" +
                    "5, 6, 9 та 10 тонн"
            ));
            session.save(new HistoryEntity(
                    2
                    , "hist-1"
                    , "hist2"
                    , "2017"
                    , "2017-1.jpg"
                    , "Відповідно до рішення, прийнятого<BR>\n" +
                    "Загальними зборами акціонерів ПАТ<BR>\n" +
                    "«АвтоКрАЗ» 30 березня 2017 року,<BR>\n" +
                    "змінено тип Публічного акціонерного<BR>\n" +
                    "товариства «АвтоКрАЗ» з публічного<BR>\n" +
                    "акціонерного товариства на приватне<BR>\n" +
                    "акціонерне товариство"
            ));
            session.save(new HistoryEntity(
                    3
                    , "hist-1"
                    , "hist3"
                    , "2016"
                    , "2016.jpg"
                    , "Система менеджменту якості ПАТ<BR>\n" +
                    "«АвтоКрАЗ» сертифікована на<BR>\n" +
                    "відповідність ISO/TS 16949:2009"
            ));
            session.save(new HistoryEntity(
                    4
                    , "hist-1"
                    , "hist4"
                    , "2015"
                    , "2015.jpg"
                    , "До 70-річчя заснування підприємства<BR>\n" +
                    "відкрито новий Музей історії<BR>\n" +
                    "Кременчуцького автозаводу"
            ));
            session.save(new HistoryEntity(
                    5
                    , "hist-2"
                    , "hist1"
                    , "2013"
                    , "2013.jpg"
                    , "ПАТ «АвтоКрАЗ» освоєно серійне<BR>\n" +
                    "виробництво броньованих<BR>\n" +
                    "автомобілей"
            ));
            session.save(new HistoryEntity(
                    6
                    , "hist-2"
                    , "hist2"
                    , "2012"
                    , "2012.jpg"
                    , "Відповідно до вимог Закону України<BR>\n" +
                    "«Про акціонерні товариства», на<BR>\n" +
                    "зборах акціонерів прийнято рішення<BR>\n" +
                    "про перейменування Холдингової<BR>\n" +
                    "Компанії «АвтоКрАЗ» у формі<BR>\n" +
                    "відкритого акціонерного товариства<BR>\n" +
                    "в Публічне акціонерне товариство<BR>\n" +
                    "«АвтоКрАЗ»"
            ));
            session.save(new HistoryEntity(
                    7
                    , "hist-2"
                    , "hist3"
                    , "2011"
                    , "2011.jpg"
                    , "Кременчуцький автомобільний завод<BR>\n" +
                    "відзначений Державною премією.<BR>\n" +
                    "Указом Президента України за ваго-<BR>\n" +
                    "мий особистий внесок у створення і<BR>\n" +
                    "розвиток конструкції автомобілів<BR>\n" +
                    "КрАЗ спеціального призначення пра-<BR>\n" +
                    "цівникам ХК «АвтоКрАЗ» присуджена<BR>\n" +
                    "премія в галузі науки і техніки"
            ));
            session.save(new HistoryEntity(
                    8
                    , "hist-2"
                    , "hist4"
                    , "2010"
                    , "2010.jpg"
                    , "«АвтоКрАЗ», після успішного прохо-<BR>\n" +
                    "дження ресертифікаційної ауди-<BR>\n" +
                    "торської перевірки, отримав серти-<BR>\n" +
                    "фікат, що підтверджує відповідність<BR>\n" +
                    "системи управління якістю на під-<BR>\n" +
                    "приємстві вимогам нового міжна-<BR>\n" +
                    "родного стандарту ISO 9001:2008"
            ));
            session.save(new HistoryEntity(
                    9
                    , "hist-3"
                    , "hist1"
                    , "2009"
                    , "2009.jpg"
                    , "Створено первісток нового п’ятого<BR>\n" +
                    "покоління автомобілів КрАЗ —<BR>\n" +
                    "самоскид КрАЗ С20.2 колісної<BR>\n" +
                    "формули 6×4 з компонувальною<BR>\n" +
                    "схемою «кабіна над двигуном»"
            ));
            session.save(new HistoryEntity(
                    10
                    , "hist-3"
                    , "hist2"
                    , "2006"
                    , "2006.jpg"
                    , "З головного конвеєра<BR>\n" +
                    "Кременчуцького автозаводу зійшов<BR>\n" +
                    "восьмисоттисячний автомобіль —<BR>\n" +
                    "сідельний тягач КрАЗ-6446 колісної<BR>\n" +
                    "формули 6×6"
            ));
            session.save(new HistoryEntity(
                    11
                    , "hist-3"
                    , "hist3"
                    , "2004"
                    , "2004.jpg"
                    , "Система менеджменту якістю ХК<BR>\n" +
                    "«АвтоКрАЗ» сертифікована на<BR>\n" +
                    "відповідність вимогам міжнародного<BR>\n" +
                    "стандарту ISO 9001:2000"
            ));
            session.save(new HistoryEntity(
                    12
                    , "hist-3"
                    , "hist4"
                    , "1996"
                    , "1996.jpg"
                    , "Зареєстрована Холдингова Компанія<BR>\n" +
                    "«АвтоКрАЗ»"
            ));
            session.save(new HistoryEntity(
                    13
                    , "hist-4"
                    , "hist1"
                    , "1986"
                    , "1986.jpg"
                    , "Досягнутий максимальний результат<BR>\n" +
                    "за весь період існування<BR>\n" +
                    "Кременчуцького автозаводу —<BR>\n" +
                    "випущено 30655 автомобілів"
            ));
            session.save(new HistoryEntity(
                    14
                    , "hist-4"
                    , "hist2"
                    , "1979"
                    , "1979.jpg"
                    , "Виробничим Об’єднанням «АвтоКрАЗ»<BR>\n" +
                    "досягнуто найвищий виробничий<BR>\n" +
                    "показник: максимальний випуск —<BR>\n" +
                    "1,66 шт. автомобілів КрАЗ на одного<BR>\n" +
                    "працюючого"
            ));
            session.save(new HistoryEntity(
                    15
                    , "hist-4"
                    , "hist3"
                    , "1967"
                    , "1967.jpg"
                    , "Пішов у серію легендарний підкорю-<BR>\n" +
                    "вач бездоріжжя — повнопривідний<BR>\n" +
                    "автомобіль- всюдихід КрАЗ-255Б,<BR>\n" +
                    "який в народі прозвали «Лаптьожник»"
            ));
            session.save(new HistoryEntity(
                    16
                    , "hist-3"
                    , "hist4"
                    , "1958"
                    , "1958.jpg"
                    , "На базі Кременчуцького комбайно-<BR>\n" +
                    "вого заводу створено Кременчуцький<BR>\n" +
                    "автозавод"
            ));


            session.getTransaction().commit();

        }
    }
}