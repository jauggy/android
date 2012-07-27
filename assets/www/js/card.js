
var c =document.getElementById('card');

var context = c.getContext('2d');

var backgroundImage = new Image();

backgroundImage.onload = function(){
	alert('test');
	DrawScreen();
	DrawText();
}
backgroundImage.src = "images/card.png";
function DrawScreen(){
	context.drawImage(backgroundImage,0,0);
}

function DrawText(){
    context.fillStyle = 'red';

    context.font = '20pt Verdana';
    context.fillRect(50,50,100,100);
    context.fillText('Some text', 50, 50,100);
	

}