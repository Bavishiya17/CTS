const eventName = "Music Fest";
const eventDate = "2026-06-10";
let seats = 10;

let info = `Event: ${eventName}, Date: ${eventDate}, Seats: ${seats}`;
document.getElementById("info").innerText = info;

function register() {
  if (seats > 0) {
    seats--;
    alert("Registered! Remaining seats: " + seats);
  } else {
    alert("No seats available");
  }
}