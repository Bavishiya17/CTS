async function loadEvents() {
  try {
    let res = await fetch("https://jsonplaceholder.typicode.com/posts");
    let data = await res.json();

    document.getElementById("box").innerText =
      "Events Loaded: " + data.length;
  } catch (err) {
    document.getElementById("box").innerText =
      "Error loading data";
  }
}

loadEvents();