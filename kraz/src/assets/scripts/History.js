async function History_out(id, clas, year, imgsrc, text) {
    let container = document.getElementById(id)
    let main = document.createElement('div')
    main.className = clas
    let mainHTML = `<p class="p1">${year}</p>
                    <img src="../assets/images/About/History/${imgsrc}" alt="" class="img">
                    <p class="p2">${text}</p>`;
    main.innerHTML = mainHTML;
    container.append(main);
}

async function Get_History() {
    fetch("http://localhost:8300/HistoryServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let main = JSON.parse(text)

        main.forEach(info => {
            id = `${info.id}`
            clas = `${info.clas}`
            year = `${info.year}`
            imgsrc = `${info.imgsrc}`
            text = `${info.text}`

            History_out(id, clas, year, imgsrc, text);
        })
    })
}

Get_History();