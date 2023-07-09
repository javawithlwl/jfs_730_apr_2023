# Program to generate prime numbers in a given range

lb = int(input("Enter lower bound: "))
ub = int(input("Enter upper bound: "))
print(f"Prime numbers between {lb} and {ub} are:")
for num in range(lb, ub + 1):
    if num > 1:
        for i in range(2, num):
            if num % i == 0:
                break  # break t
        else:
            print(num)
