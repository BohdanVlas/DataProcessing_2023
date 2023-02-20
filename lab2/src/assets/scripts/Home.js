async function vstup_out(vstup1, vstup2, vstup3, vstup5, vstup41alt, vstup41src, vstup41title, vstup42alt, vstup42src, vstup42title, vstup43alt, vstup43src, vstup43title, vstup44alt, vstup44src, vstup44title, vstup45alt, vstup45src, vstup45title, vstup46alt, vstup46src, vstup46title) {
    let containerv = document.getElementById("vstup")
    let vstup = document.createElement('div')
    vstup.className = 'vstup'
    let vstupHTML = `<p class="p vstup-1">${vstup1}</p>
                        <p class="p-strong vstup-2">${vstup2}</p>
                        <p class="p vstup-3">${vstup3}</p>
                        <div class="vstup-4">
                            <img class="vstup-4-1" src="./assets/images/${vstup41src}" alt="${vstup41alt}" title="${vstup41title}">
                            <img class="vstup-4-2" src="./assets/images/${vstup42src}" alt="${vstup42alt}" title="${vstup42title}">
                            <img class="vstup-4-3" src="./assets/images/${vstup43src}" alt="${vstup43alt}" title="${vstup43title}">
                            <img class="vstup-4-4" src="./assets/images/${vstup44src}" alt="${vstup44alt}" title="${vstup44title}">
                            <img class="vstup-4-5" src="./assets/images/${vstup45src}" alt="${vstup45alt}" title="${vstup45title}">
                            <img class="vstup-4-6" src="./assets/images/${vstup46src}" alt="${vstup46alt}" title="${vstup46title}">
                        </div>
                        <p class="p vstup-5">${vstup5}</p>`;
    vstup.innerHTML = vstupHTML;
    containerv.append(vstup);
}
async function helicopt_out(helicopt_, helicopt_1, helicopt_11, helicopt_2, helicopt_21, helicopt_22, helicopt_23, helicopt_3, helicopt_31, helicopt_32, helicopt_33) {
    let containerh = document.getElementById("helicopt")
    let helicopt = document.createElement('div')
    helicopt.className = 'helicopt'
    let helicoptHTML = `<p class="p helicopt_">${helicopt_}</p>
                        <p class="p helicopt_1">${helicopt_1}</p>
                        <p class="p helicopt_1-1">${helicopt_11}</p>
                        <p class="p helicopt_2">${helicopt_2}</p>
                        <p class="p helicopt_2-1">${helicopt_21}</p>
                        <p class="p helicopt_2-2">${helicopt_22}</p>
                        <p class="p helicopt_2-3">${helicopt_23}</p>
                        <p class="p helicopt_3">${helicopt_3}</p>
                        <p class="p helicopt_3-1">${helicopt_31}</p>
                        <p class="p helicopt_3-2">${helicopt_32}</p>
                        <p class="p helicopt_3-3">${helicopt_33}</p>`;
    helicopt.innerHTML = helicoptHTML;
    containerh.append(helicopt);
}
async function zavd_out(zavd1, zavd2, zavd3, zavd4, zavd5, zavd6, zavd7) {
    let containerz = document.getElementById("zavd")
    let zavd = document.createElement('div')
    zavd.className = 'zavd'
    let zavdHTML = `<p class="p zavd-1">${zavd1}</p>
                        <p class="p zavd-2">${zavd2}</p>
                        <p class="p zavd-3">${zavd3}</p>
                        <p class="p zavd-4">${zavd4}</p>
                        <p class="p zavd-5">${zavd5}</p>
                        <p class="p zavd-6">${zavd6}</p>
                        <p class="p zavd-7">${zavd7}</p>`;
    zavd.innerHTML = zavdHTML;
    containerz.append(zavd);
}

async function Get_Vstup() {
    fetch("http://localhost:8300/HomeVstupServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let vstup = JSON.parse(text)
        
        vstup1 = `${vstup.vstup_1}`
        vstup2 = `${vstup.vstup_2}`
        vstup3 = `${vstup.vstup_3}`
        vstup5 = `${vstup.vstup_5}`
        vstup41src = `${vstup.vstup_4_1_src}`
        vstup41alt = `${vstup.vstup_4_1_alt}`
        vstup41title = `${vstup.vstup_4_1_title}`
        vstup42src = `${vstup.vstup_4_2_src}`
        vstup42alt = `${vstup.vstup_4_2_alt}`
        vstup42title = `${vstup.vstup_4_2_title}`
        vstup43src = `${vstup.vstup_4_3_src}`
        vstup43alt = `${vstup.vstup_4_3_alt}`
        vstup43title = `${vstup.vstup_4_3_title}`
        vstup44src = `${vstup.vstup_4_4_src}`
        vstup44alt = `${vstup.vstup_4_4_alt}`
        vstup44title = `${vstup.vstup_4_4_title}`
        vstup45src = `${vstup.vstup_4_5_src}`
        vstup45alt = `${vstup.vstup_4_5_alt}`
        vstup45title = `${vstup.vstup_4_5_title}`
        vstup46src = `${vstup.vstup_4_6_src}`
        vstup46alt = `${vstup.vstup_4_6_alt}`
        vstup46title = `${vstup.vstup_4_6_title}`

        vstup_out(vstup1, vstup2, vstup3, vstup5, vstup41alt, vstup41src, vstup41title, vstup42alt, vstup42src, vstup42title, vstup43alt, vstup43src, vstup43title, vstup44alt, vstup44src, vstup44title, vstup45alt, vstup45src, vstup45title, vstup46alt, vstup46src, vstup46title)
    })
}
async function Get_Helicopt() {
    fetch("http://localhost:8300/HomeHelicoptServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let helicopt = JSON.parse(text)

        helicopt_ = `${helicopt.helicopt_}`
        helicopt_1 = `${helicopt.helicopt_1}`
        helicopt_11 = `${helicopt.helicopt_11}`
        helicopt_2 = `${helicopt.helicopt_2}`
        helicopt_21 = `${helicopt.helicopt_21}`
        helicopt_22 = `${helicopt.helicopt_22}`
        helicopt_23 = `${helicopt.helicopt_23}`
        helicopt_3 = `${helicopt.helicopt_3}`
        helicopt_31 = `${helicopt.helicopt_31}`
        helicopt_32 = `${helicopt.helicopt_32}`
        helicopt_33 = `${helicopt.helicopt_33}`

        helicopt_out(helicopt_, helicopt_1, helicopt_11, helicopt_2, helicopt_21, helicopt_22, helicopt_23, helicopt_3, helicopt_31, helicopt_32, helicopt_33)
    })
}
async function Get_Zavd() {
    fetch("http://localhost:8300/HomeZavdServlet").then(
        (response) => {
            return response.text()
        }
    ).then((text) => {
        let zavd = JSON.parse(text)
        zavd1 = `${zavd.zavd1}`
        zavd2 = `${zavd.zavd2}`
        zavd3 = `${zavd.zavd3}`
        zavd4 = `${zavd.zavd4}`
        zavd5 = `${zavd.zavd5}`
        zavd6 = `${zavd.zavd6}`
        zavd7 = `${zavd.zavd7}`

        zavd_out(zavd1, zavd2, zavd3, zavd4, zavd5, zavd6, zavd7)
    })
}

Get_Vstup();
Get_Helicopt();
Get_Zavd()