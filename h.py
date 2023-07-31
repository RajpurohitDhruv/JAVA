import turtle

# Set up the screen
screen = turtle.Screen()
screen.bgcolor("black")
screen.title("Animation")

# Create the turtle
t = turtle.Turtle()
t.shape("circle")
t.color("white")
t.penup()

# Set the starting position and velocity
x = -200
y = 0
vx = 5
vy = 0

# Define the animation loop
while True:
    # Move the turtle
    x += vx
    y += vy
    t.goto(x, y)

    # Bounce off the walls
    if x > 200 or x < -200:
        vx = -vx
    if y > 200 or y < -200:
        vy = -vy

    # Update the screen
    screen.update()
