import pyautogui
import time
from os import system

while True:
    print(pyautogui.position())
    time.sleep(0.3)
    system('cls')

