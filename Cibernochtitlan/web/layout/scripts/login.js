
var xhr;

function crearObjeto() {
    if (window.ActiveXObject) {
        xhr = new ActiveXObject("Microsoft.XMLHttp");
    } else if ((window.XMLHttpRequest) || (typeof XMLHttpRequest) != undefined) {

        xhr = new XMLHttpRequest();
       // alert("1");
    } else {
        alert("Su navegador no es compatible con AJAX");
        return;
    }
}

function ingresar() {
    crearObjeto();
    var correo = document.getElementById("correo");
    var cor = correo.value;
    var password = document.getElementById("pass");
    var pas = password.value;
    xhr.open("POST","../Login", true);
    xhr.onreadystatechange = verificaDetalle;
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.send("cor=" + cor+"&pas=" + pas);
}

function verificaDetalle() {
    if (xhr.readyState == 4) {
        respuesta();
    }
}

function respuesta() {
   if (xhr.responseText == "a") {
      //   alert("admin");
       document.getElementById("respuesta").innerHTML = "<em>Correcto Admin</em>";
        window.location.href="../pages/Admin/indexA.jsp";
          //window.close("index.html");
    } else{
        //  alert("user" );
        if(xhr.responseText == "n"){
       // window.location.href="homeU.jsp?us="+document.getElementById("usua").value;
         document.getElementById("respuesta").innerHTML = "<br><em>Ususario y/o contraseña incorrecto</em>";
    }else{ 
        window.location.href="../pages/User/indexU.jsp";
        document.getElementById("respuesta").innerHTML = "<em>" + xhr.responseText + "</em>";
    }
         
    }

}
 