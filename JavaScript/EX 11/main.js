function submitForm(event) {
  event.preventDefault();

  let name = event.target.elements.name.value;
  let email = event.target.elements.email.value;

  let msg = document.getElementById("msg");

  if (name === "" || email === "") {
    msg.innerText = "Fill all fields";
    msg.style.color = "red";
  } else {
    msg.innerText = "Registered Successfully";
    msg.style.color = "green";
  }
}