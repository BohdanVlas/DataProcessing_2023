async function ka27_lth_out(p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12) {
    let container = document.getElementById("ka-27-lth")
    let lth = document.createElement('div')
    lth.className = 'ka-27-lth'
    let lthHTML = `<p class="p-1">${p1}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="gabar">
                            <p class="p-1">Габарити вертольота:</p>
                            <p class="p p-2">Діаметр несучого гвинта – ${gabarp2}м</p>
                            <p class="p p-3">Довжина – ${gabarp4}м</p>
                            <p class="p p-4">Висота – ${gabarp5}м</p>
                            <p class="p p-5">Ширина – ${gabarp6}м</p>
                        </div>
                        <div class="lth">
                            <p class="p p-1-">Екіпаж - ${lthp1} чол</p>
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
                        </div>
                        <button onclick="button_ka27_lth_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    lth.innerHTML = lthHTML;
    container.append(lth);
}
async function ka27_ozbr_out(p1, imgsrc, imgalt, imgtitle, pimg, p2, p3) {
    let container = document.getElementById("ka-27-ozbr")
    let ozbr = document.createElement('div')
    ozbr.className = 'ka-27-ozbr'
    let ozbrHTML = `<p class="p-1">${p1}</p>
                    <p class="p p-2">${p2}</p>
                    <p class="p p-3">${p3}</p>
                    <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                    <p class="p p-img">${pimg}</p>
                    <button onclick="button_ka27_ozbr_return()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    ozbr.innerHTML = ozbrHTML;
    container.append(ozbr);
}
async function ka27_history_out(p1, p2, p3, p4, p5) {
    let container = document.getElementById("ka-27-history")
    let history = document.createElement('div')
    history.className = 'ka-27-history'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <p class="p p-5">${p5}</p>
                        <button onclick="button_ka27_history_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    history.innerHTML = historyHTML;
    container.append(history);
}

async function Get_ka27_Lth() {
    fetch("http://localhost:8300/Ka27LTHServlet").then(
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

        ka27_lth_out(p1, imgsrc, imgalt, imgtitle, gabarp2, gabarp4, gabarp5, gabarp6, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7, lthp8, lthp9, lthp10, lthp11, lthp12)
    })
}
async function Get_ka27_Ozbr() {
    fetch("http://localhost:8300/Ka27OzbrServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        pimg = `${info.pimg}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`

        ka27_ozbr_out(p1, imgsrc, imgalt, imgtitle, pimg, p2, p3)
    })
}
async function Get_ka27_History() {
    fetch("http://localhost:8300/Ka27HistoryServlet").then(
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

        ka27_history_out(p1, p2, p3, p4, p5)
    })
}

Get_ka27_Lth()
Get_ka27_Ozbr()
Get_ka27_History()