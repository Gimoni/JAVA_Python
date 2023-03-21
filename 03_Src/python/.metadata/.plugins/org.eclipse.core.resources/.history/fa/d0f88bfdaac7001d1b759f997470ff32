from random import randrange


def genPass():
    result = ''
    
    for i in range(8):
        group = randrange(0, 4)
        ch = ''
        if group==0:    # upper case
            ch = randrange(ord('A'), ord('Z') + 1)
            pass
        elif group==1:  # lower case
            ch = randrange(ord('a'), ord('z') + 1)
            pass
        elif group==2:  # numeric
            ch = randrange(ord('0'), ord('9') + 1)
            pass
        elif group==3:  # 특수문자
            ch = randrange(ord('!'), ord('/') + 1)
            pass
        
        result += chr(ch)
        
    return result

for i in range(5):
    print(genPass())

print("Program End...")