function presentciv() {
    if (document.getElementById("civpr").classList.contains('active') == true) {
        setTimeout(
            () => {
                console.log(1);
                document.getElementById("civpr").classList.remove("active");
                document.getElementById("civpr").classList.toggle("hidden");
                document.getElementById("mvpr").classList.remove("hidden");
                document.getElementById("mvpr").classList.toggle("active");
                presentmv();
            },
            5 * 1000
        );
    }
}

function presentmv() {
    if (document.getElementById("mvpr").classList.contains('active') == true) {
        setTimeout(
            () => {
                console.log(2);
                document.getElementById("mvpr").classList.remove("active");
                document.getElementById("mvpr").classList.toggle("hidden");
                document.getElementById("civpr").classList.remove("hidden");
                document.getElementById("civpr").classList.toggle("active");
                presentciv();
            },
            5 * 1000
        );
    }
}

presentciv();
presentmv();