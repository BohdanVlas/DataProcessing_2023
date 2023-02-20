function button_ka226_history() {
    document.getElementById("ka-226-history").classList.remove("hidden");
    if (document.getElementById("ka-226-history").classList.contains('active') != 1){
        document.getElementById("ka-226-history").classList.toggle("active");
    }

    if (document.getElementById("ka-226-main").classList.contains('hidden') != 1){
        document.getElementById("ka-226-main").classList.toggle("hidden");
        document.getElementById("ka-226-main").classList.remove("active");
    }
}
function button_ka226_lth() {
    document.getElementById("ka-226-lth").classList.remove("hidden");
    if (document.getElementById("ka-226-lth").classList.contains('active') != 1){
        document.getElementById("ka-226-lth").classList.toggle("active");
    }

    if (document.getElementById("ka-226-main").classList.contains('hidden') != 1){
        document.getElementById("ka-226-main").classList.toggle("hidden");
        document.getElementById("ka-226-main").classList.remove("active");
    }
}
function button_ka226_main_edit() {
    document.getElementById("form").classList.remove("hidden");
    if (document.getElementById("form").classList.contains('active') != 1){
        document.getElementById("form").classList.toggle("active");
    }

    if (document.getElementById("ka-226-main").classList.contains('hidden') != 1){
        document.getElementById("ka-226-main").classList.toggle("hidden");
        document.getElementById("ka-226-main").classList.remove("active");
    }
}

function button_ka226_history_return() {
    document.getElementById("ka-226-main").classList.remove("hidden");
    if (document.getElementById("ka-226-main").classList.contains('active') != 1){
        document.getElementById("ka-226-main").classList.toggle("active");
    }

    if (document.getElementById("ka-226-history").classList.contains('hidden') != 1){
        document.getElementById("ka-226-history").classList.toggle("hidden");
        document.getElementById("ka-226-history").classList.remove("active");
    }
}

function button_ka226_lth_return() {
    document.getElementById("ka-226-main").classList.remove("hidden");
    if (document.getElementById("ka-226-main").classList.contains('active') != 1){
        document.getElementById("ka-226-main").classList.toggle("active");
    }

    if (document.getElementById("ka-226-lth").classList.contains('hidden') != 1){
        document.getElementById("ka-226-lth").classList.toggle("hidden");
        document.getElementById("ka-226-lth").classList.remove("active");
    }
}

function button_ka226_main_edit_return() {
    document.getElementById("ka-226-main").classList.remove("hidden");
    if (document.getElementById("ka-226-main").classList.contains('active') != 1){
        document.getElementById("ka-226-main").classList.toggle("active");
    }

    if (document.getElementById("form").classList.contains('hidden') != 1){
        document.getElementById("form").classList.toggle("hidden");
        document.getElementById("form").classList.remove("active");
    }
}