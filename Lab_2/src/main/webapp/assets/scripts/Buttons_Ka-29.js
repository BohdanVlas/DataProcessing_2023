function button_ka29_history() {
    document.getElementById("ka-29-history").classList.remove("hidden");
    if (document.getElementById("ka-29-history").classList.contains('active') != 1){
        document.getElementById("ka-29-history").classList.toggle("active");
    }

    if (document.getElementById("ka-29-main").classList.contains('hidden') != 1){
        document.getElementById("ka-29-main").classList.toggle("hidden");
        document.getElementById("ka-29-main").classList.remove("active");
    }
}
function button_ka29_lth() {
    document.getElementById("ka-29-lth").classList.remove("hidden");
    if (document.getElementById("ka-29-lth").classList.contains('active') != 1){
        document.getElementById("ka-29-lth").classList.toggle("active");
    }

    if (document.getElementById("ka-29-main").classList.contains('hidden') != 1){
        document.getElementById("ka-29-main").classList.toggle("hidden");
        document.getElementById("ka-29-main").classList.remove("active");
    }
}
function button_ka29_ozbr() {
    document.getElementById("ka-29-ozbr").classList.remove("hidden");
    if (document.getElementById("ka-29-ozbr").classList.contains('active') != 1){
        document.getElementById("ka-29-ozbr").classList.toggle("active");
    }

    if (document.getElementById("ka-29-main").classList.contains('hidden') != 1){
        document.getElementById("ka-29-main").classList.toggle("hidden");
        document.getElementById("ka-29-main").classList.remove("active");
    }
}

function button_ka29_history_return() {
    document.getElementById("ka-29-main").classList.remove("hidden");
    if (document.getElementById("ka-29-main").classList.contains('active') != 1){
        document.getElementById("ka-29-main").classList.toggle("active");
    }

    if (document.getElementById("ka-29-history").classList.contains('hidden') != 1){
        document.getElementById("ka-29-history").classList.toggle("hidden");
        document.getElementById("ka-29-history").classList.remove("active");
    }
}

function button_ka29_lth_return() {
    document.getElementById("ka-29-main").classList.remove("hidden");
    if (document.getElementById("ka-29-main").classList.contains('active') != 1){
        document.getElementById("ka-29-main").classList.toggle("active");
    }

    if (document.getElementById("ka-29-lth").classList.contains('hidden') != 1){
        document.getElementById("ka-29-lth").classList.toggle("hidden");
        document.getElementById("ka-29-lth").classList.remove("active");
    }
}

function button_ka29_ozbr_return() {
    document.getElementById("ka-29-main").classList.remove("hidden");
    if (document.getElementById("ka-29-main").classList.contains('active') != 1){
        document.getElementById("ka-29-main").classList.toggle("active");
    }

    if (document.getElementById("ka-29-ozbr").classList.contains('hidden') != 1){
        document.getElementById("ka-29-ozbr").classList.toggle("hidden");
        document.getElementById("ka-29-ozbr").classList.remove("active");
    }
}