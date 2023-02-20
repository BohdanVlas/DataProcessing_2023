async function mi14_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById("mi-14-main")
    let main = document.createElement('div')
    main.className = 'mi-14-main'
    let mainHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <p class="p-3">${p3}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="buttons-1">
                            <button onclick="button_mi14_history()" class="button-1 button1">
                                <p class="p">Опис і історія</p>
                            </button>
                            <button onclick="button_mi14_lth()" class="button-1 button2">
                                <p class="p">ЛТХ</p>
                            </button>
                               <button onclick="button_mi14_ozbr()" class="button-1 button3">
                               <p class="p">Озброєння</p>
                            </button>
                        </div>`;
    main.innerHTML = mainHTML;
    container.append(main);
}
async function mi14_lth_out(p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13) {
    let container = document.getElementById("mi-14-lth")
    let lth = document.createElement('div')
    lth.className = 'mi-14-lth'
    let lthHTML = `<p class="p-1">${p1}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="gabar">
                            <p class="p-1">Габарити вертольота:</p>
                            <p class="p p-2">Діаметр несучого гвинта – ${gabarp2}м</p>
                            <p class="p p-3">Діаметр хвостового гвинта – ${gabarp3}м</p>
                            <p class="p p-4">Довжина – ${gabarp4}м</p>
                            <p class="p p-5">Висота – ${gabarp5}м</p>
                            <p class="p p-6">Ширина – ${gabarp6}</p>
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
                        <button onclick="button_mi14_lth_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    lth.innerHTML = lthHTML;
    container.append(lth);
}
async function mi14_ozbr_out(p1, imgsrc, imgalt, imgtitle, pimg, p2) {
    let container = document.getElementById("mi-14-ozbr")
    let ozbr = document.createElement('div')
    ozbr.className = 'mi-14-ozbr'
    let ozbrHTML = `<p class="p-1">${p1}</p>
                    <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                    <p class="p p-img">${pimg}</p>
                    <p class="p p-2">${p2}</p>
                    <button onclick="button_mi14_ozbr_return()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    ozbr.innerHTML = ozbrHTML;
    container.append(ozbr);
}
async function mi14_history_out(p1, p2, p3, p4) {
    let container = document.getElementById("mi-14-history")
    let history = document.createElement('div')
    history.className = 'mi-14-history'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <div class="buttons-1">
                            <button onclick="button_mi14_history_return()" class="button-1 button1">
                                <p class="button-1-p">Повернутися</p>
                            </button>
                            <button onclick="button_mi14_history_det()" class="button-1 button2">
                                <p class="button-2-p">Історія</p>
                            </button>
                            <button onclick="button_mi14pl_14plm_14ps()" class="button-1 button3">
                                <p class="button-3-p">Модифікації</p>
                            </button>
                        </div>`;
    history.innerHTML = historyHTML;
    container.append(history);
}
async function mi14_history_det_out(p1, p2, p3, p4, p5) {
    let container = document.getElementById("mi-14-history-det")
    let history = document.createElement('div')
    history.className = 'mi-14-history-det'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <p class="p p-5">${p5}</p>
                        <button onclick="button_mi14_history_det_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    history.innerHTML = historyHTML;
    container.append(history);
}
async function mi14pl_14plm_14ps_out(p1, img1src, img1alt, img1title, pimg1,  img2src, img2alt, img2title, pimg2, img3src, img3alt, img3title, pimg3, p2) {
    let container = document.getElementById("mi-14pl-14lpm-14ps")
    let mod = document.createElement('div')
    mod.className = 'mi-14pl-14lpm-14ps'
    let modHTML = `<p class="p-1">${p1}</p>
                    <p class="p-2">${p2}</p>
                    <img class="img1" src="./assets/images/${img1src}" alt="${img1alt}" title="${img1title}">
                    <img class="img2" src="./assets/images/${img2src}" alt="${img2alt}" title="${img2title}">
                    <img class="img3" src="./assets/images/${img3src}" alt="${img3alt}" title="${img3title}">
                    <p class="p p-img1">${pimg1}</p>
                    <p class="p p-img2">${pimg2}</p>
                    <p class="p p-img3">${pimg3}</p>
                    <button onclick="button_mi14pl_14plm_14ps_return()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    mod.innerHTML = modHTML;
    container.append(mod);
}

async function Get_mi14_Main() {
    fetch("http://localhost:8300/Mi14MainServlet").then(
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

        mi14_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle)
    })
}
async function Get_mi14_Lth() {
    fetch("http://localhost:8300/Mi14LTHServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`
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

        mi14_lth_out(p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13)
    })
}
async function Get_mi14_Ozbr() {
    fetch("http://localhost:8300/Mi14OzbrServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        pimg = `${info.pimg}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        mi14_ozbr_out(p1, imgsrc, imgalt, imgtitle, pimg, p2)
    })
}
async function Get_mi14_History() {
    fetch("http://localhost:8300/Mi14HistoryServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`

        mi14_history_out(p1, p2, p3, p4)
    })
}
async function Get_mi14_History_det() {
    fetch("http://localhost:8300/Mi14HistoryDetServlet").then(
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

        mi14_history_det_out(p1, p2, p3, p4, p5)
    })
}
async function Get_mi14pl_14plm_14ps() {
    fetch("http://localhost:8300/Mi14ModServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        pimg1 = `${info.pimg1}`
        img1src = `${info.img1src}`
        img1alt = `${info.img1alt}`
        img1title = `${info.img1title}`
        pimg2 = `${info.pimg2}`
        img2src = `${info.img2src}`
        img2alt = `${info.img2alt}`
        img2title = `${info.img2title}`
        pimg3 = `${info.pimg3}`
        img3src = `${info.img3src}`
        img3alt = `${info.img3alt}`
        img3title = `${info.img3title}`

        mi14pl_14plm_14ps_out(p1, img1src, img1alt, img1title, pimg1, img2src, img2alt, img2title, pimg2, img3src, img3alt, img3title, pimg3, p2)
    })
}


Get_mi14_Lth()
Get_mi14_Ozbr()
Get_mi14_History()
Get_mi14_History_det()
Get_mi14pl_14plm_14ps()