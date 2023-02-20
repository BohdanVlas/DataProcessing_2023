async function mi8msb_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById("mi-8msb-main")
    let main = document.createElement('div')
    main.className = 'mi-8msb-main'
    let mainHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <p class="p-3">${p3}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="buttons-1">
                            <button onclick="button_mi8msb_history()" class="button-1 button1">
                                <p class="p">Опис і історія</p>
                            </button>
                            <button onclick="button_mi8msb_lth()" class="button-1 button2">
                                <p class="p">ЛТХ</p>
                            </button>
                               <button onclick="button_mi8msb_ozbr()" class="button-1 button3">
                               <p class="p">Озброєння</p>
                            </button>
                        </div>`;
    main.innerHTML = mainHTML;
    container.append(main);
}
async function mi8msb_lth_out(p1, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13) {
    let container = document.getElementById("mi-8msb-lth")
    let lth = document.createElement('div')
    lth.className = 'mi-8msb-lth'
    let lthHTML = `<p class="p-1">${p1}</p>
                        <div class="gabar">
                            <p class="p-1">Габарити вертольота:</p>
                            <p class="p p-2">Діаметр несучого гвинта – ${gabarp2}м</p>
                            <p class="p p-3">Діаметр хвостового гвинта – ${gabarp3}м</p>
                            <p class="p p-4">Довжина – ${gabarp4}м</p>
                            <p class="p p-5">Висота – ${gabarp5}м</p>
                            <p class="p p-6">Ширина – ${gabarp6}м</p>
                        </div>
                        <div class="lth">
                            <p class="p p-1">Екіпаж - ${lthp1} чол</p>
                            <p class="p p-2">Двигуни типу ${lthp2}</p>
                            <p class="p p-3">Максимальна швидкість – ${lthp3}км/год</p>
                            <p class="p p-4">Крейсерська швидкість – ${lthp4}км/год</p>
                            <p class="p p-5">Статистична стеля – ${lthp5}м</p>
                            <p class="p p-6">Динамічна стеля – ${lthp6}м</p>
                            <p class="p p-7">Дальність перегону – ${lthp7}км</p>
                            <p class="p p-8">Дальність дії – ${lthp8}км</p>
                            <p class="p p-9">Максимальна злітна маса – ${lthp9}кг</p>
                            <p class="p p-10">Нормальна злітна маса – ${lthp10}кг</p>
                            <p class="p p-11">Маса порожнього вертольота – ${lthp11}кг</p>
                            <p class="p p-12">Максимальне бойове навантаження - ${lthp12}кг</p>
                            <p class="p p-13">Кількість перевозимих людей – ${lthp13} десантників</p>
                        </div>
                        <button onclick="button_mi8msb_lth_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    lth.innerHTML = lthHTML;
    container.append(lth);
}
async function mi8msb_ozbr_out(p1, img11src, img11alt, img11title, img12src, img12alt, img12title, pimg1, p2, p3, p4, img21src, img21alt, img21title, img22src, img22alt, img22title, img23src, img23alt, img23title, pimg2) {
    let container = document.getElementById("mi-8msb-ozbr")
    let ozbr = document.createElement('div')
    ozbr.className = 'mi-8msb-ozbr'
    let ozbrHTML = `<p class="p-1">${p1}</p>
                    <p class="p p-2">${p2}</p>
                    <p class="p p-3">${p3}</p>
                    <img class="imggr1-1" src="./assets/images/${img11src}" alt="${img11alt}" title="${img11title}">
                    <img class="imggr1-2" src="./assets/images/${img12src}" alt="${img12alt}" title="${img12title}">
                    <p class="pimggr1">${pimg1}</p>
                    <p class="p p-4">${p4}</p>
                    <img class="imggr2-1" src="./assets/images/${img21src}" alt="${img21alt}" title="${img21title}">
                    <img class="imggr2-2" src="./assets/images/${img22src}" alt="${img22alt}" title="${img22title}">
                    <img class="imggr2-3" src="./assets/images/${img23src}" alt="${img23alt}" title="${img23title}">
                    <p class="pimggr2">${pimg2}</p>
                    <button onclick="button_mi8msb_ozbr_return()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    ozbr.innerHTML = ozbrHTML;
    container.append(ozbr);
}
async function mi8msb_history_out(p1, p2, p3, p4, p5) {
    let container = document.getElementById("mi-8msb-history")
    let history = document.createElement('div')
    history.className = 'mi-8msb-history'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <p class="p p-5">${p5}</p>
                        <button onclick="button_mi8msb_history_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    history.innerHTML = historyHTML;
    container.append(history);
}

async function Get_mi8msb_Main() {
    fetch("http://localhost:8300/Mi8MSBMainServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        mi8msb_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle)
    })
}
async function Get_mi8msb_Lth() {
    fetch("http://localhost:8300/Mi8MSBLTHServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        gabarp2 = `${info.gabar2}`
        gabarp3 = `${info.gabar3}`
        gabarp4 = `${info.gabar4}`
        gabarp5 = `${info.gabar5}`
        gabarp6 = `${info.gabar6}`
        lthp1 = `${info.lthp1}`
        lthp2 = `${info.lthp2}`
        lthp3 = `${info.lthp3}`
        lthp4 = `${info.lthp4}`
        lthp5 = `${info.lthp5}`
        lthp6 = `${info.lthp6}`
        lthp7 = `${info.lthp7}`
        lthp8 = `${info.lthp8}`
        lthp9 = `${info.lthp9}`
        lthp10 = `${info.lthp10}`
        lthp11 = `${info.lthp11}`
        lthp12 = `${info.lthp12}`
        lthp13 = `${info.lthp13}`

        mi8msb_lth_out(p1, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13)
    })
}
async function Get_mi8msb_Ozbr() {
    fetch("http://localhost:8300/Mi8MSBOzbrServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`
        pimg1 = `${info.pimg1}`
        img11src = `${info.img11src}`
        img11alt = `${info.img11alt}`
        img11title = `${info.img11title}`
        img12src = `${info.img12src}`
        img12alt = `${info.img12alt}`
        img12title = `${info.img12title}`
        pimg2 = `${info.pimg2}`
        img21src = `${info.img21src}`
        img21alt = `${info.img21alt}`
        img21title = `${info.img21title}`
        img22src = `${info.img22src}`
        img22alt = `${info.img22alt}`
        img22title = `${info.img22title}`
        img23src = `${info.img23src}`
        img23alt = `${info.img23alt}`
        img23title = `${info.img23title}`

        mi8msb_ozbr_out(p1, img11src, img11alt, img11title, img12src, img12alt, img12title, pimg1, p2, p3, p4, img21src, img21alt, img21title, img22src, img22alt, img22title, img23src, img23alt, img23title, pimg2)
    })
}
async function Get_mi8msb_History() {
    fetch("http://localhost:8300/Mi8MSBHistoryServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`
        p5 = `${info.p5}`

        mi8msb_history_out(p1, p2, p3, p4, p5)
    })
}


Get_mi8msb_Lth()
Get_mi8msb_Ozbr()
Get_mi8msb_History()