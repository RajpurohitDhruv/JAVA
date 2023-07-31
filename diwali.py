import turtle 
import random
import colorsys

wn=turtle.Screen()
wn.setup(1200,680)
wn.bgcolor('black')

t=turtle.Turtle()
t.speed(0)
t.hideturtle()
hue=0.0

for i  in range(10):
    x=random.randint(0,350)
    y=random.randint(0,350)

    t.penup()
    t.goto(x,y)
    t.pendown()

    size=random.randint(10,200)

    for i in range(36):
        color=colorsys.hsv_to_rgb(hue,1,1)
        t.pencolor(color)
        t.fd(size)
        t.bk(size)
        t.left(10)
        hue +=0.01

    def write(message,pos):
        x,y=pos
        t.penup()
        t.goto(x,y)
        style=('Stencil Std',100,'italic')
        t.write(message,font=style)

        write('Happy Diwali',(-380,0))

wn.mainloop()