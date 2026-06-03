const events = ["Music", "Dance"];

const copy = [...events];

const [first] = events;

const events = ["Music", "Dance"];

const copy = [...events];

const [first] = events;

function greet(name = "User") {
  return "Welcome " + name;
}

console.log(greet());
console.log("First Event:", first);