function addEvent() {
  let div = document.createElement("div");
  div.className = "box";
  div.innerText = "New Event Added";
  document.getElementById("container").appendChild(div);
}