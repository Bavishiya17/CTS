function Event(name, seats) {
  this.name = name;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0 ? "Available" : "Full";
};

let event1 = new Event("Hackathon", 5);

document.getElementById("name").innerText = event1.name;
document.getElementById("status").innerText = event1.checkAvailability();

console.log(Object.entries(event1));