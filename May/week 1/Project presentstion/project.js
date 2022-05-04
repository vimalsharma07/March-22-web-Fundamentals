document.querySelector(".btn").style.display = "none";

const sidebar = document.querySelector(".sidebaar");

function vimal() {
  sidebar.classList.toggle("sidebaargo");
  if (sidebar.classList.contains("sidebaargo")) {
    document.querySelector(".btn1").style.display = "inline";
    document.querySelector(".btn").style.display = "none";
  } else {
    setTimeout(() => {
      document.querySelector(".btn").style.display = "inline";
    }, 400);
    document.querySelector(".btn1").style.display = "none";
  }
}
function vibha() {
  sidebar.classList.toggle("sidebaargo");
  if (sidebar.classList.contains("sidebaargo")) {
    document.querySelector(".btn1").style.display = "inline";
    document.querySelector(".btn").style.display = "none";
  } else {
    setTimeout(() => {
      document.querySelector(".btn").style.display = "inline";
    }, 400);

    document.querySelector(".btn1").style.display = "none";
  }
}
