# Program to print multiplication table of a number

num = int(input("Enter a number: "))
for i in range(1, 11, 2):
    print(f"{num} x {i} = {num * i}")