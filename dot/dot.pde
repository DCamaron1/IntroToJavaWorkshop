void setup() {
  size(800, 800);
}

void draw() {

  if (mousePressed)
  {
    fill(random(225), random(0), random(225));
    ellipse(200, 200, 200, 200);
  } else
  {
    fill(150, 0, 150);
    ellipse(200, 200, 200, 200);
  }
}
// Copyright Wintriss Technical Schools 2013



