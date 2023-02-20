async function main_out(id, p1, p2, p3, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById(id)
    let main = document.createElement('div')
    main.className = 'mi-24-main'
    let mainHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <p class="p-3">${p3}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="buttons-1">
                            <button onclick="button_mi24_history()" class="button-1 button1">
                                <p class="p">Опис і історія</p>
                            </button>
                            <button onclick="button_mi24_lth()" class="button-1 button2">
                                <p class="p">ЛТХ</p>
                            </button>
                               <button onclick="button_mi24_ozbr()" class="button-1 button3">
                               <p class="p">Озброєння</p>
                            </button>
                        </div>`;
    main.innerHTML = mainHTML;
    container.append(main);
}
async function lth_out(id, p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13, lthp14) {
    let container = document.getElementById(id)
    let lth = document.createElement('div')
    lth.className = 'mi-24-lth'
    let lthHTML = `<p class="p-1">${p1}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
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
                            <p class="p p-14">Кількість перевозимих людей – ${lthp14} поранених</p>
                        </div>
                        <button onclick="button_mi24_lth_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    lth.innerHTML = lthHTML;
    container.append(lth);
}
async function ozbr_out(id, p1, imgsrc, imgalt, imgtitle, pimg, p2, p3) {
    let container = document.getElementById(id)
    let ozbr = document.createElement('div')
    ozbr.className = 'mi-24-ozbr'
    let ozbrHTML = `<p class="p-1">${p1}</p>
                    <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                    <p class="p p-img">${pimg}</p>
                    <p class="p p-2">${p2}</p>
                    <p class="p p-3">${p3}</p>
                    <div class="buttons-1">
                        <button onclick="button_mi24_ozbr_return()" class="button-1 button1">
                            <p class="button-1-p">Повернутися</p>
                        </button>
                        <button onclick="button_mi24_kursove()" class="button-1 button2">
                            <p class="button-2-p">Курсове</p>
                        </button>
                        <button onclick="button_mi24_pidvisne()" class="button-1 button3">
                            <p class="button-3-p">Підвісне</p>
                        </button>
                    </div>`;
    ozbr.innerHTML = ozbrHTML;
    container.append(ozbr);
}
async function kursove_out(id, p1, imgsrc, imgalt, imgtitle, pimg, p2, p3) {
    let container = document.getElementById(id)
    let kursove = document.createElement('div')
    kursove.className = 'mi-24-kursove'
    let kursoveHTML = `<p class="p-1">${p1}</p>
                        <img src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}" class="img">
                        <p class="p p-img">${pimg}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <button onclick="button_mi24_kursove_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    kursove.innerHTML = kursoveHTML;
    container.append(kursove);
}
async function pidvisne_out(id, p1, p2, p3, p4, img1src, img1alt, img1title, pimg1, pimggr1, pimggr2, pimggr3, imggr11src, imggr12src, imggr13src, imggr11alt, imggr12alt, imggr13alt, imggr11title, imggr12title, imggr13title, imggr21src, imggr22src, imggr21alt, imggr22alt, imggr21title, imggr22title, imggr31src, imggr32src, imggr31alt, imggr32alt, imggr31title, imggr32title) {
    let container = document.getElementById(id)
    let pidvisne = document.createElement('div')
    pidvisne.className = 'mi-24-pidvisne'
    let pidvisneHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <img src="./assets/images/${img1src}" alt="${img1alt}" title="${img1title}" class="img-1">
                        <p class="p-img-1">${pimg1}</p>
                        <p class="p p-3">${p3}</p>
                        <img src="./assets/images/${imggr11src}" alt="${imggr11alt}" title="${imggr11title}" class="img-gr1-1">
                        <img src="./assets/images/${imggr12src}" alt="${imggr12alt}" title="${imggr12title}" class="img-gr1-2">
                        <img src="./assets/images/${imggr13src}" alt="${imggr13alt}" title="${imggr13title}" class="img-gr1-3">
                        <p class="p-img-gr1">${pimggr1}</p>
                        <p class="p p-4">${p4}</p>
                        <img src="./assets/images/${imggr21src}" alt="${imggr21alt}" title="${imggr21title}" class="img-gr2-1">
                        <img src="./assets/images/${imggr22src}" alt="${imggr22alt}" title="${imggr22title}" class="img-gr2-2">
                        <p class="p-img-gr2">${pimggr2}</p>
                        <img src="./assets/images/${imggr31src}" alt="${imggr31alt}" title="${imggr31title}" class="img-gr3-1">
                        <img src="./assets/images/${imggr32src}" alt="${imggr32alt}" title="${imggr32title}" class="img-gr3-2">
                        <p class="p-img-gr3">${pimggr3}</p>
                        <button onclick="button_mi24_pidvisne_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    pidvisne.innerHTML = pidvisneHTML;
    container.append(pidvisne);
}
async function history_out(id, p1, p2, p3, p4) {
    let container = document.getElementById(id)
    let history = document.createElement('div')
    history.className = 'mi-24-history'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <div class="buttons-1">
                            <button onclick="button_return_mi24_history()" class="button-1 button1">
                                <p class="button-1-p">Повернутися</p>
                            </button>
                            <button onclick="button_mi24a()" class="button-1 button2">
                                <p class="button-2-p">Мі-24А</p>
                            </button>
                            <button onclick="button_mi24py1()" class="button-1 button3">
                                <p class="button-3-p">Мі-24ПУ1</p>
                            </button>
                        </div>`;
    history.innerHTML = historyHTML;
    container.append(history);
}
async function mi24a_out(id, p1, p2, p3, pimg, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById(id)
    let mi24a = document.createElement('div')
    mi24a.className = 'mi-24-mi24a'
    let mi24aHTML = `<p class="p-1">${p1}</p>
                    <p class="p p-2">${p2}</p>
                    <p class="p p-3">${p3}</p>
                    <img src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}" class="img">
                    <p class="p-img">${pimg}</p>
                    <button onclick="button_return_mi24a()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    mi24a.innerHTML = mi24aHTML;
    container.append(mi24a);
}
async function mi24py1_out(id, p1, p2, img1src, img1alt, img1title, img2src, img2alt, img2title) {
    let container = document.getElementById(id)
    let mi24py1 = document.createElement('div')
    mi24py1.className = 'mi-24-mi24py1'
    let mi24py1HTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <img src="./assets/images/${img1src}" alt="${img1alt}" title="${img1title}" class="img-1">
                        <img src="./assets/images/${img2src}" alt="${img2alt}" title="${img2title}" class="img-2">
                        <div class="buttons-1">
                            <button onclick="button_return_mi24py1()" class="button-1 button1">
                                <p class="button-1-p">Повернутися</p>
                            </button>
                            <button onclick="button_mi24py1_history()" class="button-1 button2">
                                <p class="button-2-p">Історія</p>
                            </button>
                            <button onclick="button_mi24py1_modern()" class="button-1 button3">
                                <p class="button-3-p">Модернізація</p>
                            </button>
                        </div>`;
    mi24py1.innerHTML = mi24py1HTML;
    container.append(mi24py1);
}
async function mi24py1_history_out(id, p1, p2) {
    let container = document.getElementById(id)
    let mi24py1history = document.createElement('div')
    mi24py1history.className = 'mi-24-mi24py1-history'
    let mi24py1historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <button onclick="button_return_mi24py1_history()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    mi24py1history.innerHTML = mi24py1historyHTML;
    container.append(mi24py1history);
}
async function mi24py1_modern_out(id, p1, p2, p3, p4, p5, p6, p7) {
    let container = document.getElementById(id)
    let mi24py1modern = document.createElement('div')
    mi24py1modern.className = 'mi-24-mi24py1-modern'
    let mi24py1modernHTML = `<p class="p-1">${p1}</p>
                                <p class="p p-2">${p2}</p>
                                <p class="p p-3">${p3}</p>
                                <p class="p p-4">${p4}</p>
                                <p class="p p-5">${p5}</p>
                                <p class="p p-6">${p6}</p>
                                <p class="p p-7">${p7}</p>
                                <button onclick="button_return_mi24py1_modern()" class="button-return">
                                    <p class="button-return-p">Повернутися</p>
                                </button>`;
    mi24py1modern.innerHTML = mi24py1modernHTML;
    container.append(mi24py1modern);
}

async function Get_Main() {
    fetch("http://localhost:3000/mi-24-main").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        main_out(id, p1, p2, p3, imgsrc, imgalt, imgtitle)
    })
}
async function Get_Lth() {
    fetch("http://localhost:3000/mi-24-lth").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`
        gabarp2 = `${info.gabarp2}`
        gabarp3 = `${info.gabarp3}`
        gabarp4 = `${info.gabarp4}`
        gabarp5 = `${info.gabarp5}`
        gabarp6 = `${info.gabarp6}`
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
        lthp14 = `${info.lthp14}`

        lth_out(id, p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp3, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12, lthp13, lthp14)
    })
}
async function Get_Ozbr() {
    fetch("http://localhost:3000/mi-24-ozbr").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        pimg = `${info.pimg}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        ozbr_out(id, p1, imgsrc, imgalt, imgtitle, pimg, p2, p3)
    })
}
async function Get_Kursove() {
    fetch("http://localhost:3000/mi-24-kursove").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        pimg = `${info.pimg}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        kursove_out(id, p1, imgsrc, imgalt, imgtitle, pimg, p2, p3)
    })
}
async function Get_Pidvisne() {
    fetch("http://localhost:3000/mi-24-pidvisne").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`
        pimg1 = `${info.pimg1}`
        pimggr1 = `${info.pimggr1}`
        pimggr2 = `${info.pimggr2}`
        pimggr3 = `${info.pimggr3}`
        img1src = `${info.img1src}`
        img1alt = `${info.img1alt}`
        img1title = `${info.img1title}`
        imggr11src = `${info.imggr11src}`
        imggr11alt = `${info.imggr11alt}`
        imggr11title = `${info.imggr11title}`
        imggr12src = `${info.imggr12src}`
        imggr12alt = `${info.imggr12alt}`
        imggr12title = `${info.imggr12title}`
        imggr13src = `${info.imggr13src}`
        imggr13alt = `${info.imggr13alt}`
        imggr13title = `${info.imggr13title}`
        imggr21src = `${info.imggr21src}`
        imggr21alt = `${info.imggr21alt}`
        imggr21title = `${info.imggr21title}`
        imggr22src = `${info.imggr22src}`
        imggr22alt = `${info.imggr22alt}`
        imggr22title = `${info.imggr22title}`
        imggr31src = `${info.imggr31src}`
        imggr31alt = `${info.imggr31alt}`
        imggr31title = `${info.imggr31title}`
        imggr32src = `${info.imggr32src}`
        imggr32alt = `${info.imggr32alt}`
        imggr32title = `${info.imggr32title}`

        pidvisne_out(id, p1, p2, p3, p4, img1src, img1alt, img1title, pimg1, pimggr1, pimggr2, pimggr3, imggr11src, imggr12src, imggr13src, imggr11alt, imggr12alt, imggr13alt, imggr11title, imggr12title, imggr13title, imggr21src, imggr22src, imggr21alt, imggr22alt, imggr21title, imggr22title, imggr31src, imggr32src, imggr31alt, imggr32alt, imggr31title, imggr32title)
    })
}
async function Get_History() {
    fetch("http://localhost:3000/mi-24-history").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`

        history_out(id, p1, p2, p3, p4)
    })
}
async function Get_Mi24A() {
    fetch("http://localhost:3000/mi-24-mi24a").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        pimg = `${info.pimg}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        mi24a_out(id, p1, p2, p3, pimg, imgsrc, imgalt, imgtitle)
    })
}
async function Get_Mi24PY1() {
    fetch("http://localhost:3000/mi-24-mi24py1").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        img1src = `${info.img1src}`
        img1alt = `${info.img1alt}`
        img1title = `${info.img1title}`
        img2src = `${info.img2src}`
        img2alt = `${info.img2alt}`
        img2title = `${info.img2title}`

        mi24py1_out(id, p1, p2, img1src, img1alt, img1title, img2src, img2alt, img2title)
    })
}
async function Get_Mi24PY1History() {
    fetch("http://localhost:3000/mi-24-mi24py1-history").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`

        mi24py1_history_out(id, p1, p2)
    })
}
async function Get_Mi24PY1Modern() {
    fetch("http://localhost:3000/mi-24-mi24py1-modern").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        p4 = `${info.p4}`
        p5 = `${info.p5}`
        p6 = `${info.p6}`
        p7 = `${info.p7}`

        mi24py1_modern_out(id, p1, p2, p3, p4, p5, p6, p7)
    })
}

Get_Main()
Get_Lth()
Get_Ozbr()
Get_Kursove()
Get_Pidvisne()
Get_History()
Get_Mi24A()
Get_Mi24PY1()
Get_Mi24PY1History()
Get_Mi24PY1Modern()