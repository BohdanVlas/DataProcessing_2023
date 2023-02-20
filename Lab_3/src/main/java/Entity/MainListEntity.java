package Entity;

import java.util.ArrayList;
import java.util.List;

public class MainListEntity {

    private List<MainEntity> mainlist = new ArrayList<>();

    public MainListEntity () {
        this.mainlist.add(new MainEntity( 1, "mi-2msb-main", "Мі-2МСБ", "Мі-2(Hoplite за класифікацією НАТО)", "Мі-2МСБ - український багатоцільовий гелікоптер, створений ПАТ «Мотор Січ» на основі Мі-2.", "Mi-2MSB(1-1).jpg", "Mi-2MSB", "Mi-2МСБ", "button_mi2msb_history()", "button_mi2msb_lth()", "button_mi2msb_ozbr()"));
        this.mainlist.add(new MainEntity( 2, "mi-8-main", "Мі-8МТ", "Мі-8(Hip за класифікацією НАТО)", "Мі-8 - радянський багатоцільовий вертоліт, розроблений ОКБ М. Л. Міля на початку<BR>1960-х років. Наймасовіший у світі вертоліт із двома двигунами, один із наймасовіших<BR>вертольотів в історії авіації. Широко використовується для виконання багатьох цивільних<BR>і військових завдань.", "Mi-8(2-1).jpg", "Mi-8", "Mi-8", "button_mi8_history()", "button_mi8_lth()", "button_mi8_ozbr()"));
        this.mainlist.add(new MainEntity( 3, "mi-8msb-main", "Мі-8МСБ-В", "Мі-8(Hip за класифікацією НАТО)", "Мі-8МСБ — український варіант модернізації радянського багатоцільового вертольота Мі-8,<BR>розроблений компанією «Мотор Січ».", "Mi-8MSB(3-1).jpg", "Mi-8MSB", "Mi-8МСБ", "button_mi8msb_history()", "button_mi8msb_lth()", "button_mi8msb_ozbr()"));
        this.mainlist.add(new MainEntity( 4, "mi-14-main", "Мі-14ПЛ, Мі-14ПЛМ, Мі-14ПС", "Мі-14(Haze за класифікацією НАТО)", "Мі-14 - морський багатоцільовий вертоліт-амфібія берегового базування, розробки ОКБ М. Л. Міля.", "Mi-14PLM(3-1).jpg", "Mi-14PLM", "Mi-14ПЛМ", "button_mi14_history()", "button_mi14_lth()", "button_mi14_ozbr()"));
        this.mainlist.add(new MainEntity( 5, "mi-24-main", "Мі-24П", "Мі-24(Hind за класифікацією НАТО)", "Мі-24 є одним із найвідоміших бойових вертольотів у світі. Став одним із символів Війни в Афганістані,<BR>де і отримав прізвисько 'Крокодил'", "Mi-24(3).jpg", "Mi-24", "Mi-24", "button_mi24_history()", "button_mi24_lth()", "button_mi24_ozbr()"));
        this.mainlist.add(new MainEntity( 6, "ka-27-main", "Ка-27", "Ка-27(Helix за класифікацією НАТО)", "Ка-27 радянський корабельний багатофункціональний вертоліт.", "Ka-27(2-1).jpg", "Ka-27", "Ka-27", "button_ka27_history()", "button_ka27_lth()", "button_ka27_ozbr()"));
        this.mainlist.add(new MainEntity( 7, "ka-29-main", "Ка-29", "Ка-29(Helix-B за класифікацією НАТО)", "Ка-29 - радянський корабельний транспортно-бойовий вертоліт, подальший розвиток вертольота Ка-27.", "Ka-29(3-1).jpg", "Ka-29", "Ka-29", "button_ka29_history()", "button_ka29_lth()", "button_ka29_ozbr()"));
    }

    public List<MainEntity> getMainEntity() {
        return mainlist;
    }

    public void setMainlist(List<MainEntity> mainlist) {
        this.mainlist = mainlist;
    }
}
