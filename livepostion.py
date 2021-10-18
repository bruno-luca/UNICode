import pyautogui
import time
from os import system
from pynput import mouse

def on_click(x, y, button, pressed):
    
    print(pyautogui.position())
    
    time.sleep(0.1)


def main():
    
    with mouse.Listener(on_click=on_click) as listener:
        listener.join()
        
        

if __name__ == "__main__":
    main()

