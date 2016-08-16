void setup()
{
  size(1000, 1000);
  background(0, 55, 221);
}
void draw()
{
  if (mousePressed)
  {
    //face
    fill(225,225,000);
    ellipse(500, 500, 500, 500);
    //eyes
    fill(random(225),random(0),random(0));
    ellipse(400, 400, 100, 100);
    
    fill(random(225),random(0),random(0));
    ellipse(600, 400, 100, 100);
    //mouth
    fill(225, 225, 225);
    rect(350, 550, 300, 2);
    
    triangle(350, 550, 400, 550, 350, 600);
    triangle(650, 550, 600, 550, 650, 600);
  } 
  
  else
  {
    background(0, 0, 0);
    
  }
}

