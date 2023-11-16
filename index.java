//pong game
var court= createSprite(200,200);
court.setAnimation("court");
function draw() {
 drawSprites();
}

var playerPaddle= createSprite(390,200,10,100);
    playerPaddle.shapeColor="blue";
    var computerPaddle= createSprite(10,200,10,100);
    computerPaddle.shapeColor="red";
    var ball= createSprite(200,200,10,10);
    ball.shapeColor="yellow";
    ball.setAnimation("ball");
    playerPaddle.setAnimation("player");
    computerPaddle.setAnimation("robot");

function draw() {
  background("court");
  createEdgeSprites();
  
  if(ball.isTouching(playerPaddle) || ball.isTouching(computerPaddle))
  {
    playSound("007763665_prev.mp3");
  }
  
  if(ball.isTouching(topEdge) || ball.isTouching(bottomEdge))
  {
    playSound("wall_hit.mp3");
  }
  
  if (keyDown("up")) {
    playerPaddle.y=playerPaddle.y-10;
  }
  
  if (keyDown("down")) {
    playerPaddle.y=playerPaddle.y+10;
  }
  
  if(keyDown("space"))
  {
     ball.velocityX=3;
     ball.velocityY=4;  
  }
  
  computerPaddle.y=ball.y;

  drawnet();
  
 
    
  createEdgeSprites();
  ball.bounceOff(topEdge);
  ball.bounceOff(bottomEdge);
  ball.bounceOff(computerPaddle);
  ball.bounceOff(playerPaddle);
  drawSprites();
  
}



function drawnet()
{  
  for(var num=0;num<400;num=num+20)
  {
    line(200,num,200,num+10);
  }
}

// escape game

var box1 = createSprite(25, 75, 50, 50);
box1.shapeColor="red";
box1.setAnimation("a1");
var box2 = createSprite(75, 75, 50, 50);
box2.shapeColor="blue";
box2.setAnimation("a2");
var box3 = createSprite(125, 75, 50, 50);
box3.shapeColor="red";
box3.setAnimation("a3");
var box4 = createSprite(175, 75, 50, 50);
box4.shapeColor="blue";
box4.setAnimation("a4");
var box5 = createSprite(225, 75, 50, 50);
box5.shapeColor="red";
box5.setAnimation("a1");
var box6 = createSprite(275, 75, 50, 50);
box6.shapeColor="blue";
box6.setAnimation("a2");
var box7 = createSprite(325, 75, 50, 50);
box7.shapeColor="red";
box7.setAnimation("a3");
var box8 = createSprite(375, 75, 50, 50);
box8.shapeColor="blue";
box8.setAnimation("a4");


var box9 = createSprite(25, 125, 50, 50);
box9.shapeColor="blue";
box9.setAnimation("a1");
var box10 = createSprite(75, 125, 50, 50);
box10.shapeColor="red";
box10.setAnimation("a2");
var box11 = createSprite(125, 125, 50, 50);
box11.shapeColor="blue";
box11.setAnimation("a3");
var box12 = createSprite(175, 125, 50, 50);
box12.shapeColor="red";
box12.setAnimation("a4");
var box13 = createSprite(225,125, 50, 50);
box13.shapeColor="blue";
box13.setAnimation("a1");
var box14 = createSprite(275, 125, 50, 50);
box14.shapeColor="red";
box14.setAnimation("a2");
var box15 = createSprite(325, 125, 50, 50);
box15.shapeColor="blue";
box15.setAnimation("a3");
var box16 = createSprite(375, 125, 50, 50);
box16.shapeColor="red";
box16.setAnimation("a4");

var paddle=createSprite(200,390,100,20);
var ball=createSprite(200,200,20,20);
ball.setAnimation("ball");
var score =0;



function draw() {
  background("white");
textSize(15);
stroke("yellow");
text("puntuacion: " + score,280, 20);
  
  
if(keyDown("space")) {
  
     ball.velocityX= 2;
     ball.velocityY= 3;  
  }


  if (keyDown("RIGHT_ARROW")) {
    paddle.x=paddle.x+10;
  }  
  
  if (keyDown("LEFT_ARROW")) {
    paddle.x=paddle.x-10;
  } 
  
  createEdgeSprites();
  ball.bounceOff(topEdge);
  ball.bounceOff(leftEdge);
  ball.bounceOff(rightEdge);
  ball.bounceOff(paddle);


if (ball.isTouching(box1)) {
  score=score+1;
  box1.destroy();
}
if (ball.isTouching(box2)) {
  score=score+1;
  box2.destroy();
}
if (ball.isTouching(box3)) {
  score=score+1;
  box3.destroy();
}
if (ball.isTouching(box4)) {
  score=score+1;
  box4.destroy();
}
if (ball.isTouching(box5)) {
  score=score+1;
  box5.destroy();
}
if (ball.isTouching(box6)) {
  score=score+1;
  box6.destroy();
}
if (ball.isTouching(box7)) {
  score=score+1;
  box7.destroy();
}
if (ball.isTouching(box8)) {
  score=score+1;
  box8.destroy();
}
if (ball.isTouching(box9)) {
  score=score+1;
  box9.destroy();
}
if (ball.isTouching(box10)) {
  score=score+1;
  box10.destroy();
}
if (ball.isTouching(box11)) {
  score=score+1;
  box11.destroy();
}
if (ball.isTouching(box12)) {
  score=score+1;
  box12.destroy();
}
if (ball.isTouching(box13)) {
  score=score+1;
  box13.destroy();
}
if (ball.isTouching(box14)) {
  score=score+1;
  box14.destroy();
}
if (ball.isTouching(box15)) {
  score=score+1;
  box15.destroy();
}
if (ball.isTouching(box16)) {
  score=score+1;
  box16.destroy();
}

textSize(15);
stroke("yellow");
text("puntuacion: " + score,280, 20);

   
 
  
  
  drawSprites();
}

// crossy road

var life = 0;
var car1, car2, car3,car4;
var boundary1, boundary2;
var sam;

  boundary1 = createSprite(190,120,420,3);
  boundary2 = createSprite(190,260,420,3);
  
  sam = createSprite(20,190,13,13);
  sam.setAnimation("sam");
  
  car1 = createSprite(100,130,10,10);
  car1.setAnimation("car1");
  car2 = createSprite(215,130,10,10);
  car2.setAnimation("car2");
  car3 = createSprite(165,250,10,10);
  car3.setAnimation("car3");
  car4 = createSprite(270,250,10,10);
  car4.setAnimation("car4");


//Agrega velocidad  para hacer que el auto se mueva.
car1.velocityY=4;
car2.velocityY=4;
car3.velocityY=-4;
car4.velocityY=-4;
function draw() {
   background("white");
  text("Vidas: " + life,200,100);
  strokeWeight(0);
  fill("lightblue");
  rect(0,120,52,140);
  fill("yellow");
  rect(345,120,52,140);
  
// Crea la función bounceoff para hacer que el auto rebote en los límites.
car1.bounceOff(boundary1);
car1.bounceOff(boundary2);
car2.bounceOff(boundary1);
car2.bounceOff(boundary2);
car3.bounceOff(boundary1);
car3.bounceOff(boundary2);
car4.bounceOff(boundary1);
car4.bounceOff(boundary2);
//Agregar la condición para hacer que Sam se mueva de izquiera a derecha.
if (keyDown("RIGHT_ARROW")) {
  sam.x = sam.x +4;
}
if (keyDown("LEFT_ARROW")) {
  sam.x = sam.x -4;
}

//Agregar la condición de reducir la vida de Sam si toca el carro.
if (sam.isTouching(car1) ||
    sam.isTouching(car2) ||
    sam.isTouching(car3) ||
    sam.isTouching(car4)) {
  
  sam.x =20;
  sam.y =190;
  life = life+1;
  }
    
 drawSprites();
}

// pokemaze

var sky= createSprite(200,200);
sky.setAnimation("sky");
var pickachu = createSprite(30,30,10,10);
pickachu.setAnimation("pika");

 var wall1 = createSprite(10,70,100,20);
wall1.shapeColor= "darkgreen";
var wall2 =createSprite(100,50,20,100);
wall2.shapeColor = "darkgreen";
var wall3 =createSprite(80,130,100,20);
wall3.shapeColor = "darkgreen";
var wall4 =createSprite(50,250,20,100);
wall4.shapeColor = "darkgreen";
var wall5 = createSprite(130,210,100,20);
wall5.shapeColor = "darkgreen";
var wall6 =createSprite(10,250,100,20);
wall6.shapeColor = "darkgreen";
var wall7 = createSprite(160,120,20,100);
wall7.shapeColor = "darkgreen";
var wall8 =createSprite(150,20,100,20);
wall8.shapeColor = "darkgreen";
var wall9 = createSprite(220,200,20,100);
wall9.shapeColor = "darkgreen";
var wall10 = createSprite(120,300,20,100);
wall10.shapeColor = "darkgreen";
var wall11 = createSprite(30,350,20,100);
wall11.shapeColor = "darkgreen";
var wall12 = createSprite(250,70,20,100);
wall12.shapeColor = "darkgreen";
var wall13 = createSprite(360,120,20,100);
wall13.shapeColor = "darkgreen";
var wall14 =createSprite(291,160,100,20);
wall14.shapeColor = "darkgreen";
var wall15 =createSprite(330,40,100,20);
wall15.shapeColor = "darkgreen";
var wall16 =createSprite(350,210,100,20);
wall16.shapeColor = "darkgreen";
var wall17 = createSprite(350,400,20,100);
wall17.shapeColor = "darkgreen";
var baya = createSprite(380,380,20,20);
baya.setAnimation("baya");
var wall19 =createSprite(349,290,100,20);
wall19.shapeColor = "darkgreen";
var wall20 = createSprite(290,290,20,100);
wall20.shapeColor = "darkgreen";
var wall21 =createSprite(270,390,100,20);
wall21.shapeColor = "darkgreen";
var wall22 = createSprite(170,390,20,100);
wall22.shapeColor = "darkgreen";
var wall18=createSprite(190,330,100,20);
wall18.shapeColor = "darkgreen";

function draw() {
background("lightblue");
pickachu.velocityX = 0;
pickachu.velocityY = 0;



if(keyDown(UP_ARROW)) {
    pickachu.velocityX = 0;
    pickachu.velocityY = -2;
  }
  if(keyDown(DOWN_ARROW)) {
    pickachu.velocityX = 0;
    pickachu.velocityY = 4;
  }
  if(keyDown(LEFT_ARROW)) {
    pickachu.velocityX = -3;
    pickachu.velocityY = 0;
  }
  if(keyDown(RIGHT_ARROW)) {
    pickachu.velocityX = 4;
    pickachu.velocityY = 0;
  }
  if(keyDown(UP_ARROW)) {
    pickachu.setAnimation("pika4");
  }
  if(keyDown(DOWN_ARROW)) {
    pickachu.setAnimation("pika5");
  }
  if(keyDown(LEFT_ARROW)) {
    pickachu.setAnimation("pika2");
  }
  if(keyDown(RIGHT_ARROW)) {
    pickachu.setAnimation("pika3");
  }
   if(keyWentUp(UP_ARROW)) {
    pickachu.setAnimation("pika");
  }
  if(keyWentUp(DOWN_ARROW)) {
    pickachu.setAnimation("pika");
  }
  if(keyWentUp(LEFT_ARROW)) {
    pickachu.setAnimation("pika");
  }
  if(keyWentUp(RIGHT_ARROW)) {
    pickachu.setAnimation("pika");
  }
  
  pickachu.bounceOff(wall1);
  pickachu.bounceOff(wall2);
  pickachu.bounceOff(wall3);
  pickachu.bounceOff(wall4);
  pickachu.bounceOff(wall5);
  pickachu.bounceOff(wall6);
  pickachu.bounceOff(wall7);
  pickachu.bounceOff(wall8);
  pickachu.bounceOff(wall9);
  pickachu.bounceOff(wall10);
  pickachu.bounceOff(wall11);
  pickachu.bounceOff(wall12);
  pickachu.bounceOff(wall13);
  pickachu.bounceOff(wall14);
  pickachu.bounceOff(wall15);
  pickachu.bounceOff(wall16);
  pickachu.bounceOff(wall17);
  pickachu.bounceOff(wall19);
  pickachu.bounceOff(wall20);
  pickachu.bounceOff(wall21);
  pickachu.bounceOff(wall22);
  pickachu.collide(baya);
  pickachu.bounceOff(wall18);
  createEdgeSprites();
  pickachu.bounceOff(edges);
 
  
drawSprites();
  }

// air hockey

var goal1 = createSprite(200, 360, 150, 30);
var goal2 = createSprite(200, 40, 150, 30);
var striker = createSprite(200, 200, 20, 20);
var playermallet = createSprite(200, 330, 75, 20);
var computermallet = createSprite(200, 70, 75, 20);
goal1.shapeColor = "black";
goal2.shapeColor = "black";
striker.setAnimation("striker"); 
playermallet.shapeColor = "white";
computermallet.shapeColor = "white";
playermallet.velocityX = 5;
computermallet.velocityX = 5;
striker.velocityX = 0;
striker.velocityY = 0;
var gameState = "serve";
var computerscore = 0;
var playerscore = 0;
function draw() {
  background("darkgray");
strokeWeight(10);
line(0, 20, 400, 20);
line(0, 380, 400, 380);
for (var i = 0; i < 400; i=i+20) 
 {strokeWeight(3);
      line(i, 200, i+10, 200);
 }    
playermallet.velocityX = 0;
if (keyDown("left")) 
{ playermallet.x = playermallet.x-10;
}
if (keyDown("right")) 
{ playermallet.x = playermallet.x+10;
}
if (keyDown("down")) 
{
  if (playermallet.y<360) 
  { playermallet.y = playermallet.y+10;
  }
}
if (keyDown("up")) 
{
  if (playermallet.y>260) 
  { playermallet.y = playermallet.y-10;
  }
}
if (keyDown("space") && gameState == "serve") { 
  serve(); 
  gameState = "play";
}
if (gameState == "serve") 
{ 
  fill("white");
  textSize(24);
  text("Press space to start the game", 50, 180);
}
fill("white");
textSize(12);
text(playerscore, 30,215);
textSize(12);
text(computerscore,30,195 );
if (striker.isTouching(goal1)||striker.isTouching(goal2)) 
{ 
if (striker.isTouching(goal1)) 
{ computerscore = computerscore+1;
}
if (striker.isTouching(goal2)) 
{ playerscore = playerscore+1;
}
 reset();
 gameState = "serve";
}
if (computerscore==5||playerscore==5) 
{ gameState = "over";
  fill("white");
  textSize(24);
  text("¡Se acabo!", 120, 165);
  fill("white");
  textSize(15);
  text("Presiona 'ENTER' para reiniciar", 140, 185);
}
if (keyDown("ENTER")&& gameState=="over") 
{   gameState = "serve";
    playerscore = 0;
    computerscore = 0;
}
computermallet.x = striker.x;
createEdgeSprites();
playermallet.bounceOff(leftEdge);
playermallet.bounceOff(rightEdge);
striker.bounceOff(leftEdge);
striker.bounceOff(rightEdge);
striker.bounceOff(playermallet);
striker.bounceOff(computermallet);
striker.bounceOff(bottomEdge);
drawSprites();
}
function serve() {
  
  striker.velocityX = 3;
  striker.velocityY = 3;
}
function reset() {
  striker.x = 200;
  striker.y = 200;
  striker.velocityX = 0;
  striker.velocityY = 0;
}

// robery

var ladron= createSprite(10,390,30,30);
var tesoro = createSprite(390,10,30,30);
var laser1 = createSprite(100,0,200,5);
laser1.velocityY = 2;
var laser2 = createSprite(300,400,200,5);
laser1.shapeColor = "red";
laser2.shapeColor = "red";
ladron.shapeColor = "black";
tesoro.shapeColor = "blue";

laser2.velocityY = -2;
createEdgeSprites();
function draw() {
  background(220);

laser1.bounceOff(topEdge);
laser1.bounceOff(bottomEdge);
laser2.bounceOff(topEdge);
laser2.bounceOff(bottomEdge);
ladron.bounceOff(edges);
if (laser1.isTouching(ladron) || laser2.isTouching(ladron)) {
stroke(0);
fill(0);
textSize(24);
text("Ladron Atrapado",128,250);
laser1.velocityY=0;
laser2.velocityY=0;
ladron.velocityY=0;
ladron.velocityX=0;
}
if (ladron.isTouching(tesoro)) {
stroke(0);
fill(0);
textSize(24);
text("Robaron la Gema",128,250);
laser1.velocityY=0;
laser2.velocityY=0;
ladron.velocityY=0;
ladron.velocityX=0;
}
    drawSprites();
if(keyDown(UP_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = -4;
  }
  if(keyDown(DOWN_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = 4;
  }
  if(keyDown(LEFT_ARROW)) {
    ladron.velocityX = -4;
    ladron.velocityY = 0;
  }
  if(keyDown(RIGHT_ARROW)) {
    ladron.velocityX = 4;
    ladron.velocityY = 0;
  }
  if(keyWentUp(UP_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = 0;
  }
  if(keyWentUp(DOWN_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = 0;
  }
  if(keyWentUp(LEFT_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = 0;
  }
  if(keyWentUp(RIGHT_ARROW)) {
    ladron.velocityX = 0;
    ladron.velocityY = 0;
  }

}
