def minion_game(string):
    l = len(string)
    string = string.lower()
    vowels = ['a', 'e', 'i', 'o', 'u']
    kevin = 0
    stuart = 0 
    for i in string:
        if i in vowels:
            kevin+=l
        else:
            stuart+=l
        l-=1
    if kevin>stuart:
        print("Kevin", kevin)
    elif kevin<stuart:
        print("Stuart", stuart)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)
