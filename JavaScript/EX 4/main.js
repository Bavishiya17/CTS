function counter() {
  let count = 0;
  return function () {
    count++;
    return count;
  };
}

let music = counter();

function register() {
  document.getElementById("count").innerText =
    "Total: " + music();
}