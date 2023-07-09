def is_prime(num):
    if num < 2 or (num != 2 and num % 2 == 0):
        return False
    else:
        for i in range(2, num):
            if num % i == 0:
                return False
    return True


def generate_prime_in_range(lb, ub):
    print(f"Prime numbers between {lb} and {ub} are:")
    for num in range(lb, ub + 1):
        if is_prime(num):
            print(num, end=" ")


def gcd(num1, num2):
    if num1 == 0:
        return num2
    return gcd(num2 % num1, num1)


print(gcd(14, 21))
