def perform(fun, num1, num2):
    return fun(num1, num2)


print(perform(lambda a, b: a * b, 10, 20))
