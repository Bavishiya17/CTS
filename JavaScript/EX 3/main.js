let events = [
  { name: "Music", seats: 5, past: false },
  { name: "Dance", seats: 0, past: false },
  { name: "Old Event", seats: 10, past: true }
];

let list = document.getElementById("eventList");

events.forEach(e => {
  if (!e.past && e.seats > 0) {
    let li = document.createElement("li");
    li.innerText = e.name + " - Available";
    list.appendChild(li);
  }
});

function registerUser() {
  try {
    console.log("User registered");
  } catch (err) {
    console.log("Error:", err);
  }
}