/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var myVar = setInterval(function(){ myTimer() }, 1000);

function myTimer() {
    var counter = parseInt(document.getElementById("number").innerHTML,10);
    counter +=  1;
    alert(counter);
    document.getElementById("number").innerHTML = counter ;

}





