function button_about() {
    document.getElementById("about").classList.remove("hidden");
    if (document.getElementById("about").classList.contains('active') != 1){
        document.getElementById("about").classList.toggle("active");
    }
    if (document.getElementById("history").classList.contains('hidden') != 1){
        document.getElementById("history").classList.toggle("hidden");
        document.getElementById("history").classList.remove("active");
    }
    if (document.getElementById("sumvol").classList.contains('hidden') != 1){
        document.getElementById("sumvol").classList.toggle("hidden");
        document.getElementById("sumvol").classList.remove("active");
    }
}

function button_history() {
    document.getElementById("history").classList.remove("hidden");
    if (document.getElementById("history").classList.contains('active') != 1){
        document.getElementById("history").classList.toggle("active");
    }
    if (document.getElementById("about").classList.contains('hidden') != 1){
        document.getElementById("about").classList.toggle("hidden");
        document.getElementById("about").classList.remove("active");
    }
    if (document.getElementById("sumvol").classList.contains('hidden') != 1){
        document.getElementById("sumvol").classList.toggle("hidden");
        document.getElementById("sumvol").classList.remove("active");
    }
}

function button_sumvol() {
    document.getElementById("sumvol").classList.remove("hidden");
    if (document.getElementById("sumvol").classList.contains('active') != 1){
        document.getElementById("sumvol").classList.toggle("active");
    }
    if (document.getElementById("history").classList.contains('hidden') != 1){
        document.getElementById("history").classList.toggle("hidden");
        document.getElementById("history").classList.remove("active");
    }
    if (document.getElementById("about").classList.contains('hidden') != 1){
        document.getElementById("about").classList.toggle("hidden");
        document.getElementById("about").classList.remove("active");
    }
}