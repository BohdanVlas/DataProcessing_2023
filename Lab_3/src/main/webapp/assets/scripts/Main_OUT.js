async function Main_out(id, p1, p2, p3, imgsrc, imgalt, imgtitle) {
    let container = document.getElementById(id)
    let main = document.createElement('div')
    main.className = id
    let mainHTML = `<p class="p-1">${p1}</p>
                        <p class="p-2">${p2}</p>
                        <p class="p-3">${p3}</p>
                        <img class="img" src="./assets/images/${imgsrc}" alt="${imgalt}" title="${imgtitle}">
                        <div class="buttons-1">
                            <button onclick="${button1}" class="button-1 button1">
                                <p class="p">Опис і історія</p>
                            </button>
                            <button onclick="${button2}" class="button-1 button2">
                                <p class="p">ЛТХ</p>
                            </button>
                            <button onclick="${button3}" class="button-1 button3">
                               <p class="p">Озброєння</p>
                            </button>
                        </div>`;
    main.innerHTML = mainHTML;
    container.append(main);
}

async function Get_Main() {
    fetch("http://localhost:8300/MainServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let main = JSON.parse(text)

        main.forEach(info => {
            id = `${info.id}`
        p1 = `${info.p1}`
        p2 = `${info.p2}`
        p3 = `${info.p3}`
        imgsrc = `${info.imgsrc}`
        imgalt = `${info.imgalt}`
        imgtitle = `${info.imgtitle}`
        button1 = `${info.button1}`
        button2 = `${info.button2}`
        button3 = `${info.button3}`

        Main_out(id, p1, p2, p3, imgsrc, imgalt, imgtitle, button1, button2, button3);
        })
    })
}

Get_Main();