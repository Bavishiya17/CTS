function sendData() {
  document.getElementById("status").innerText = "Sending...";

  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      body: JSON.stringify({ user: "CTS", event: "Music" }),
      headers: { "Content-Type": "application/json" }
    })
    .then(() => {
      document.getElementById("status").innerText =
        "Submitted Successfully";
    })
    .catch(() => {
      document.getElementById("status").innerText =
        "Submission Failed";
    });
  }, 1000);
}