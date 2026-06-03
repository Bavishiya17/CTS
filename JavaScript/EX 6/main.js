let events = ["Music Show", "Dance Night", "Tech Talk"];

events.push("Workshop");

let list = document.getElementById("list");

events.map(e => {
  let div = document.createElement("div");
  div.className = "card";
  div.innerText = e;
  list.appendChild(div);
});