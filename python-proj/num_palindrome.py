# Program to check whether a number is palindrome or not

num = int(input("Enter a number: "))
temp = num
rev = 0
while num > 0:
    rem = num % 10
    rev = rev * 10 + rem
    num //= 10
if temp == rev:
    print(f"{temp} is a palindrome number")
else:
    print(f"{temp} is not a palindrome number")