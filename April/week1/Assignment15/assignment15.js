document.getElementById("img1").onmouseover = function() {mouseOver()};
document.getElementById("img1").onmouseout = function() {mouseOut()};

function mouseOver() {
  document.getElementById("img1").style.height="400px" .width="500px";
}

function mouseOut() {
  document.getElementById("img1").style.height="300px" .width="400px";
}