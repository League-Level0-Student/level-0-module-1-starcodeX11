void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    //tomato
    fill(209,13,13);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    //stem
    fill(52,211,17);
    rect(176, 103, 12, 32);

    if (mousePressed == true) {
      //bite
    fill(255,255,255);
    ellipse(80,200,60,60);
    }
}
