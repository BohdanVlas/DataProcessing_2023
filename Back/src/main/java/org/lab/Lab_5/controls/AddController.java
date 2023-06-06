package org.lab.Lab_5.controls;

import org.lab.Lab_5.entity.HistoryElement;
import org.lab.Lab_5.repos.ElemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AddController {
    @Autowired
    private ElemRepo elemRepo;

    @GetMapping("/")
    public String getindex(Model model) {
        List<HistoryElement> history = elemRepo.findAll();
        model.addAttribute("HistList", history);

        return "index";
    }

    @GetMapping("/new")
    public String addnew(HistoryElement elem) {
        return "added";
    }

    @PostMapping("/add")
    public String addhist(@Valid HistoryElement history, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "added";
        }
        List<HistoryElement> History = elemRepo.findAll();
        history.num = History.size()+1;
        elemRepo.save(history);
        model.addAttribute("customers", elemRepo.findAll());

        List<HistoryElement> updatedHistList = elemRepo.findAll();
        model.addAttribute("HistList", updatedHistList);
        return "index";
    }

    @GetMapping("/create")
    public String createDB(Model model){
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
                3
                , "hist-1"
                , "hist3"
                , "2016"
                , "2016.jpg"
                , "Система менеджменту якості ПАТ<BR>\n" +
                "«АвтоКрАЗ» сертифікована на<BR>\n" +
                "відповідність ISO/TS 16949:2009"
        ));
        elemRepo.save(new HistoryElement(
                4
                , "hist-1"
                , "hist4"
                , "2015"
                , "2015.jpg"
                , "До 70-річчя заснування підприємства<BR>\n" +
                "відкрито новий Музей історії<BR>\n" +
                "Кременчуцького автозаводу"
        ));
        elemRepo.save(new HistoryElement(
                5
                , "hist-2"
                , "hist1"
                , "2013"
                , "2013.jpg"
                , "ПАТ «АвтоКрАЗ» освоєно серійне<BR>\n" +
                "виробництво броньованих<BR>\n" +
                "автомобілей"
        ));
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
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
        elemRepo.save(new HistoryElement(
                12
                , "hist-3"
                , "hist4"
                , "1996"
                , "1996.jpg"
                , "Зареєстрована Холдингова Компанія<BR>\n" +
                "«АвтоКрАЗ»"
        ));

        List<HistoryElement> histlist = elemRepo.findAll();
        model.addAttribute("HistList", histlist);

        return "";
    }
}
