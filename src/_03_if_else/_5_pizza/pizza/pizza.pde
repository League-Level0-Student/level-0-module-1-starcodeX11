PImage pepperoni;
PImage mushroom;
PImage olive;

void setup() {
  pepperoni = loadImage("pepperoni.png");
  mushroom = loadImage("mushroom.png");
  olive = loadImage("olive.png");
 size(500,500);   
}
void draw() {
   //crust
 fill(222,167,27);
 ellipse(250,250,250,250);
  // tomato
 fill(222,9,9);
 ellipse(250,250,200,200);
 //cheese
 fill(239,240,29);
 ellipse(250,250,155,155);
//toppings
image(pepperoni,155,155);
pepperoni.resize(80,80);
image(mushroom,180,220);
mushroom.resize(150,130);
image(olive,230,155);
}
