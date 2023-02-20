function button_ka27_history() {
    document.getElementById("ka-27-history").classList.remove("hidden");
    if (document.getElementById("ka-27-history").classList.contains('active') != 1){
        document.getElementById("ka-27-history").classList.toggle("active");
    }

    if (document.getElementById("ka-27-main").classList.contains('hidden') != 1){
        document.getElementById("ka-27-main").classList.toggle("hidden");
        document.getElementById("ka-27-main").classList.remove("active");
    }
}
function button_ka27_lth() {
    document.getElementById("ka-27-lth").classList.remove("hidden");
    if (document.getElementById("ka-27-lth").classList.contains('active') != 1){
        document.getElementById("ka-27-lth").classList.toggle("active");
    }

    if (document.getElementById("ka-27-main").classList.contains('hidden') != 1){
        document.getElementById("ka-27-main").classList.toggle("hidden");
        document.getElementById("ka-27-main").classList.remove("active");
    }
}
function button_ka27_ozbr() {
    document.getElementById("ka-27-ozbr").classList.remove("hidden");
    if (document.getElementById("ka-27-ozbr").classList.contains('active') != 1){
        document.getElementById("ka-27-ozbr").classList.toggle("active");
    }

    if (document.getElementById("ka-27-main").classList.contains('hidden') != 1){
        document.getElementById("ka-27-main").classList.toggle("hidden");
        document.getElementById("ka-27-main").classList.remove("active");
    }
}

function button_ka27_history_return() {
    document.getElementById("ka-27-main").classList.remove("hidden");
    if (document.getElementById("ka-27-main").classList.contains('active') != 1){
        document.getElementById("ka-27-main").classList.toggle("active");
    }

    if (document.getElementById("ka-27-history").classList.contains('hidden') != 1){
        document.getElementById("ka-27-history").classList.toggle("hidden");
        document.getElementById("ka-27-history").classList.remove("active");
    }
}

function button_ka27_lth_return() {
    document.getElementById("ka-27-main").classList.remove("hidden");
    if (document.getElementById("ka-27-main").classList.contains('active') != 1){
        document.getElementById("ka-27-main").classList.toggle("active");
    }

    if (document.getElementById("ka-27-lth").classList.contains('hidden') != 1){
        document.getElementById("ka-27-lth").classList.toggle("hidden");
        document.getElementById("ka-27-lth").classList.remove("active");
    }
}

function button_ka27_ozbr_return() {
    document.getElementById("ka-27-main").classList.remove("hidden");
    if (document.getElementById("ka-27-main").classList.contains('active') != 1){
        document.getElementById("ka-27-main").classList.toggle("active");
    }

    if (document.getElementById("ka-27-ozbr").classList.contains('hidden') != 1){
        document.getElementById("ka-27-ozbr").classList.toggle("hidden");
        document.getElementById("ka-27-ozbr").classList.remove("active");
    }
}