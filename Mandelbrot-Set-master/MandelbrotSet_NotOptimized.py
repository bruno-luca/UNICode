"""
Mandlebrot
Begin date: April 10th,2014
"""
import ComplexNum
import pygame
import sys
import time
pygame.init()

#Set output window
maxx = 800
maxy = 600
x = 0
y = 0
screen = pygame.display.set_mode((maxx,maxy))

white = (255,255,255)
black = (0,0,0)
screen.fill(white)

#Set borders for graph
#Set domain
leftedge = -2
rightedge = 2
#Set Range
topedge = (maxy/maxx) * 2
botedge = - (maxy/maxx) *2
#Determine pixel width
pixelwidth = (rightedge-leftedge) / maxx   
#Times Repeated
maxiter= 255
#Base colour Properties
R = 54
G = 4
B = 304
inc = 1
i =0 

c = ComplexNum.InitZ(leftedge,topedge)
time1 = time.clock()
#for i in range (0,maxy):
while i <= maxy:
    #Update imaginary value of c
    topedge = topedge - pixelwidth
   # y = y + 1
    leftedge = -2
    pygame.display.update() 
    x = 0
    for u in range (0,maxx):
        counter = 0
        #Update the real value of c
        leftedge = leftedge + pixelwidth
        #Initialize c
        c = ComplexNum.InitZ(leftedge,topedge)
        #Initialize z
        z = ComplexNum.InitZ (0,0)
        
        #Set counter to 0
        R = 54
        G = 4
        B = 304
  
        while (counter <= maxiter) and (ComplexNum.MagnitudeZ(z) < 2) :
            z = ComplexNum.AddZ(ComplexNum.SquareZ(z), c)           
            counter = counter + 1
        #Check if divergent
        if (counter > maxiter):
            pygame.draw.line(screen,black, (u,i),(u,i),1)
            
        else:
            R = (R + counter)* inc
            if R > 255:
                R = 0
                
            G =(G + counter)*inc
            if G > 255:
                G = 0
                
            B = (B+counter)*inc
            if B > 255:
                B = 0
            colour = (R,G,B)
     
         # colour = (((R + counter)* inc)%maxiter, ((G + counter)*inc)%maxiter, ((B+counter)*inc)%maxiter)
            pygame.draw.line(screen,colour, (u,i),(u,i),1)
    i = i + 1

time2 = time.clock()

print("Total Time: ", time2-time1)

#WAIT FOR USER TO CLOSE THE WINDOW
while (True) :
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
