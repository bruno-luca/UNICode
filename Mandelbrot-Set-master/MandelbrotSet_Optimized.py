"""
Mandlebrot Set
Begin date: April 10th,2014
By: Javier Ruiz-Arduengo
"""
import pygame
import sys
import time
time1 = time.clock()
leftedge = -2
topedge = 1.5
R = 1
G = 1
B = 45
pygame.init()
screen = pygame.display.set_mode((800,600))
screen.fill((0,0,0))

for i in range(600):
    leftedge = -2
    for u in range(800):
        counter = 0
        c = complex(leftedge,topedge)
        z = 0 + 0j
        ztemp = z
        R = 1
        G = 1
        B =45
        while counter <= 255 and abs(z) <= 2:
             z = z*z + c
             if z==ztemp:
                 counter = 255
             ztemp = z
             counter = counter + 1               
        if counter <= 255: 
            R = R + counter
            if R > 255:
                R = 0   
            G = G + counter
            if G > 255:
                G = 0
            B = B +counter
            if B > 255:
                B = 0 
            pygame.draw.line(screen,(R,G,B), (u,i),(u,i),1)
        leftedge = leftedge + 0.005
    topedge = topedge - 0.005
time2 = time.clock()
pygame.display.update()
print("Total Time: ", time2-time1)

#WAIT FOR USER TO CLOSE THE WINDOW
while (True) :
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
