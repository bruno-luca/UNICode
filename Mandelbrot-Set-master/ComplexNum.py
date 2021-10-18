z1 = [0,0]
z2 = [0,0]
z3 = [0,0]

def PrintZ (z):
    #DISPLAY A COMPLEX NUMBER
    print(str(z[0]) + ' + ' + str(z[1]) + 'i')
    return

def InitZ (a,b):
    #SET THE VALUE OF A COMPLEX NUMBER
    z = [0,0]
    z[0] = a
    z[1] = b
    return z

def AddZ (zA , zB):
    #ADD TWO COMPLEX NUMBERS
    SumZ = [0,0]
    SumZ[0] = zA[0] + zB[0]
    SumZ[1] = zA[1] + zB[1]
    return SumZ

def SubZ (zA,zB):
    #SUBTRACT TWO COMPLEX NUMBERS
    DiffZ = [0,0]
    DiffZ[0] = zA[0] - zB[0]
    DiffZ[1] = zA[1] - zB[1]
    return DiffZ

def MultZ(zA,zB):
    #MULTIPLY TWO COMPLEX NUMBERS
    ProdZ = [0,0]
    ProdZ [0] = zA[0] * zB[0] - zA[1] * zB[1]
    ProdZ [1] = zA[0] *zB[1] + zA[1] * zB[0]
    return ProdZ

def SquareZ (z):
    ProdZ = [0,0]
    ProdZ[0] = z[0]**2 - z[1]**2
    ProdZ[1] = 2*z[0]*z[1]
    return ProdZ

def MagnitudeZ (z):
    #RETURN THE MAGNITUDE OF A COMPLEX NUMBER
    Mag = (z[0]**2 + z[1]**2)**0.5
    return Mag
