/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var output = $("#output"),
    tarr = [0],
    delay = 9000;
    
setInterval(function() {
    var idx = 0;
    tarr[idx] = tarr[idx] + delay;
    output.text("Deaths by smoking: " + tarr);
}, delay);

