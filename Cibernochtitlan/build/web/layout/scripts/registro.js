
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

function respuesta() {
    var user = document.getElementById("usua");
    var us = user.value;
    //window.open("entrada.jsp");
    if (xhr.responseText == "SI") {
      //   alert("admin");
        window.location.href="homeA.jsp";
        
        document.getElementById("respuesta").innerHTML = "<em>Correcto</em>";
        //window.close("index.html");
    } else{
        //  alert("user" );
        if(xhr.responseText == "NO"){
       // window.location.href="homeU.jsp?us="+document.getElementById("usua").value;
        window.location.href="homeU.jsp";
         document.getElementById("respuesta").innerHTML = "<em>Correcto</em>";
        
    }else{  alert("error" );
         document.getElementById("respuesta").innerHTML = "<em>" + xhr.responseText + "</em>";
    }
}
}

function registro(){
    crearObjeto();
    document.getElementById("respuesta").innerHTML = "";
    var nombre=document.getElementById("nombre");
    var nom=nombre.value;
    var apellidos=document.getElementById("apellidos");
    var ape=apellidos.value;
    var correo=document.getElementById("correo");
    var cor=correo.value;
    xhr.open("POST","../RegistroUsuarios", true);
    xhr.onreadystatechange = verificaDetalleRegistro;
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.send("nom=" + nom+"&ape=" + ape +"&cor=" + cor);
    
}


function verificaDetalleRegistro() {
    if (xhr.readyState == 4) {
         if (xhr.responseText == "error") {
         alert("Algun campo esta vacio"); 
       document.getElementById("respuesta").innerHTML = "<em>Verifica los campos</em>";
    } else if(xhr.responseText == "si"){
       alert("Registro exitoso, Revisa Tu correo");
         document.getElementById("respuesta").innerHTML = "<em>Correcto<br>Revisa tu correo electronico para activar tu cuenta.</em>";
    }else if(xhr.responseText=="repetido"){
        alert("Correo electronico ya registrado");
        document.getElementById("respuesta").innerHTML = "<em>Ingresa otro correo</em>";
    }
    }
}

function respuestaRegistro() {
     if (xhr.responseText == "SI") {
         alert("Registro exitoso");
     document.getElementById("respuesta").innerHTML = "<em>Correcto</em>";
 }else{
     alert("error");
 }
}
