function button_mi8msb_history() {
    document.getElementById("mi-8msb-history").classList.remove("hidden");
    if (document.getElementById("mi-8msb-history").classList.contains('active') != 1){
        document.getElementById("mi-8msb-history").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("hidden");
        document.getElementById("mi-8msb-main").classList.remove("active");
    }
}
function button_mi8msb_lth() {
    document.getElementById("mi-8msb-lth").classList.remove("hidden");
    if (document.getElementById("mi-8msb-lth").classList.contains('active') != 1){
        document.getElementById("mi-8msb-lth").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("hidden");
        document.getElementById("mi-8msb-main").classList.remove("active");
    }
}
function button_mi8msb_ozbr() {
    document.getElementById("mi-8msb-ozbr").classList.remove("hidden");
    if (document.getElementById("mi-8msb-ozbr").classList.contains('active') != 1){
        document.getElementById("mi-8msb-ozbr").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-main").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("hidden");
        document.getElementById("mi-8msb-main").classList.remove("active");
    }
}

function button_mi8msb_history_return() {
    document.getElementById("mi-8msb-main").classList.remove("hidden");
    if (document.getElementById("mi-8msb-main").classList.contains('active') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-history").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-history").classList.toggle("hidden");
        document.getElementById("mi-8msb-history").classList.remove("active");
    }
}

function button_mi8msb_lth_return() {
    document.getElementById("mi-8msb-main").classList.remove("hidden");
    if (document.getElementById("mi-8msb-main").classList.contains('active') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-lth").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-lth").classList.toggle("hidden");
        document.getElementById("mi-8msb-lth").classList.remove("active");
    }
}

function button_mi8msb_ozbr_return() {
    document.getElementById("mi-8msb-main").classList.remove("hidden");
    if (document.getElementById("mi-8msb-main").classList.contains('active') != 1){
        document.getElementById("mi-8msb-main").classList.toggle("active");
    }

    if (document.getElementById("mi-8msb-ozbr").classList.contains('hidden') != 1){
        document.getElementById("mi-8msb-ozbr").classList.toggle("hidden");
        document.getElementById("mi-8msb-ozbr").classList.remove("active");
    }
}