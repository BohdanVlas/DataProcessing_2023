async function mi2msb_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById("mi-2msb-main")
    let main = document.createElement('div')
    main.className = 'mi-2msb-main'
    let mainHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <p class="p-3">${p3}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="buttons-1">
                            <button onclick="button_mi2msb_history()" class="button-1 button1">
                                <p class="p">Опис і історія</p>
                            </button>
                            <button onclick="button_mi2msb_lth()" class="button-1 button2">
                                <p class="p">ЛТХ</p>
                            </button>
                               <button onclick="button_mi2msb_ozbr()" class="button-1 button3">
                               <p class="p">Озброєння</p>
                            </button>
                        </div>`;
    main.innerHTML = mainHTML;
    container.append(main);
}
async function mi2msb_lth_out(p1, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7) {
    let container = document.getElementById("mi-2msb-lth")
    let lth = document.createElement('div')
    lth.className = 'mi-2msb-lth'
    let lthHTML = `<p class="p-1">${p1}</p>
                        <div class="lth">
                            <p class="p p-1">Екіпаж - ${lthp1} чол</p>
                            <p class="p p-2">Двигуни типу ${lthp2}</p>
                            <p class="p p-3">Максимальна швидкість – ${lthp3}км/год</p>
                            <p class="p p-4">Динамічна стеля – ${lthp4}м</p>
                            <p class="p p-5">Максимальна злітна маса – ${lthp5}кг</p>
                            <p class="p p-6">Кількість перевозимих людей – ${lthp6} десантників</p>
                            <p class="p p-7">Діаметр несучого гвинта – ${lthp7}м</p>
                        </div>
                        <button onclick="button_mi2msb_lth_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    lth.innerHTML = lthHTML;
    container.append(lth);
}
async function mi2msb_ozbr_out(p1, p2) {
    let container = document.getElementById("mi-2msb-ozbr")
    let ozbr = document.createElement('div')
    ozbr.className = 'mi-2msb-ozbr'
    let ozbrHTML = `<p class="p-1">${p1}</p>
                    <p class="p p-2">${p2}</p>
                    <button onclick="button_mi2msb_ozbr_return()" class="button-return">
                        <p class="button-return-p">Повернутися</p>
                    </button>`;
    ozbr.innerHTML = ozbrHTML;
    container.append(ozbr);
}
async function mi2msb_history_out(p1, p2, p3, p4, p5) {
    let container = document.getElementById("mi-2msb-history")
    let history = document.createElement('div')
    history.className = 'mi-2msb-history'
    let historyHTML = `<p class="p-1">${p1}</p>
                        <p class="p p-2">${p2}</p>
                        <p class="p p-3">${p3}</p>
                        <p class="p p-4">${p4}</p>
                        <p class="p p-5">${p5}</p>
                        <button onclick="button_mi2msb_history_return()" class="button-return">
                            <p class="button-return-p">Повернутися</p>
                        </button>`;
    history.innerHTML = historyHTML;
    container.append(history);
}

async function Get_mi2msb_Main() {
    fetch("http://localhost:8300/Mi2MSBMainServlet").then(
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

        mi2msb_main_out(p1, p2, p3, imgsrc, imgalt, imgtitle)
    })
}
async function Get_mi2msb_Lth() {
    fetch("http://localhost:8300/Mi2MSBLTHServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        lthp1 = `${info.lthp1}`
        lthp2 = `${info.lthp2}`
        lthp3 = `${info.lthp3}`
        lthp4 = `${info.lthp4}`
        lthp5 = `${info.lthp5}`
        lthp6 = `${info.lthp6}`
        lthp7 = `${info.lthp7}`

        mi2msb_lth_out(p1, lthp1, lthp2, lthp3, lthp4, lthp5, lthp6, lthp7)
    })
}
async function Get_mi2msb_Ozbr() {
    fetch("http://localhost:8300/Mi2MSBOzbrServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let info = JSON.parse(text)

        p1 = `${info.p1}`
        p2 = `${info.p2}`

        mi2msb_ozbr_out(p1, p2)
    })
}
async function Get_mi2msb_History() {
    fetch("http://localhost:8300/Mi2MSBHistoryServlet").then(
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

        mi2msb_history_out(p1, p2, p3, p4, p5)
    })
}


Get_mi2msb_Lth()
Get_mi2msb_Ozbr()
Get_mi2msb_History()