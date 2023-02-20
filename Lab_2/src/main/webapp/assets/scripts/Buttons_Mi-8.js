function button_mi8_history() {
    document.getElementById("mi-8-history").classList.remove("hidden");
    if (document.getElementById("mi-8-history").classList.contains('active') != 1){
        document.getElementById("mi-8-history").classList.toggle("active");
    }

    if (document.getElementById("mi-8-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8-main").classList.toggle("hidden");
        document.getElementById("mi-8-main").classList.remove("active");
    }
}
function button_mi8_lth() {
    document.getElementById("mi-8-lth").classList.remove("hidden");
    if (document.getElementById("mi-8-lth").classList.contains('active') != 1){
        document.getElementById("mi-8-lth").classList.toggle("active");
    }

    if (document.getElementById("mi-8-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8-main").classList.toggle("hidden");
        document.getElementById("mi-8-main").classList.remove("active");
    }
}
function button_mi8_ozbr() {
    document.getElementById("mi-8-ozbr").classList.remove("hidden");
    if (document.getElementById("mi-8-ozbr").classList.contains('active') != 1){
        document.getElementById("mi-8-ozbr").classList.toggle("active");
    }

    if (document.getElementById("mi-8-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8-main").classList.toggle("hidden");
        document.getElementById("mi-8-main").classList.remove("active");
    }
}

function button_mi8_history_return() {
    document.getElementById("mi-8-main").classList.remove("hidden");
    if (document.getElementById("mi-8-main").classList.contains('active') != 1){
        document.getElementById("mi-8-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8-history").classList.contains('hidden') != 1){
        document.getElementById("mi-8-history").classList.toggle("hidden");
        document.getElementById("mi-8-history").classList.remove("active");
    }
}
function button_mi8_mod() {
    document.getElementById("mi-8-mod").classList.remove("hidden");
    if (document.getElementById("mi-8-mod").classList.contains('active') != 1){
        document.getElementById("mi-8-mod").classList.toggle("active");
    }

    if (document.getElementById("mi-8-history").classList.contains('hidden') != 1){
        document.getElementById("mi-8-history").classList.toggle("hidden");
        document.getElementById("mi-8-history").classList.remove("active");
    }
}

function button_mi8_mod_return() {
    document.getElementById("mi-8-history").classList.remove("hidden");
    if (document.getElementById("mi-8-history").classList.contains('active') != 1){
        document.getElementById("mi-8-history").classList.toggle("active");
    }

    if (document.getElementById("mi-8-mod").classList.contains('hidden') != 1){
        document.getElementById("mi-8-mod").classList.toggle("hidden");
        document.getElementById("mi-8-mod").classList.remove("active");
    }
}

function button_mi8_lth_return() {
    document.getElementById("mi-8-main").classList.remove("hidden");
    if (document.getElementById("mi-8-main").classList.contains('active') != 1){
        document.getElementById("mi-8-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8-lth").classList.contains('hidden') != 1){
        document.getElementById("mi-8-lth").classList.toggle("hidden");
        document.getElementById("mi-8-lth").classList.remove("active");
    }
}

function button_mi8_ozbr_return() {
    document.getElementById("mi-8-main").classList.remove("hidden");
    if (document.getElementById("mi-8-main").classList.contains('active') != 1){
        document.getElementById("mi-8-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8-ozbr").classList.contains('hidden') != 1){
        document.getElementById("mi-8-ozbr").classList.toggle("hidden");
        document.getElementById("mi-8-ozbr").classList.remove("active");
    }
}

