document.getElementById("signupbutton").addEventListener("click", function() {
    const user = document.getElementById("Username").value;
    const mail = document.getElementById("email").value;
    const phno = document.getElementById("Contact").value;
    const pwd = document.getElementById("Password").value;


    //datbasecolumanname : text box value
    const signups= {
      email : mail,
      password : pwd,
      contact : phno,
      username : user
    }
    console.log(signups)

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8082/students");
    xhr.setRequestHeader("Content-Type" , "application/json");
    xhr.setRequestHeader("Access-Control-Allow-Origin" , "*");

    xhr.onreadystatechange = () => {
      if(xhr.readyState == 4 && xhr.status == 200) {
        console.log(xhr.responseText)
      }
    }

    xhr.send( JSON.stringify(signups) );
  })