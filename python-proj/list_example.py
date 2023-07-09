# Program to use of the list

num_list_1 = [1, 2, 3, 4, 5, 6]
num_list_2 = [7, 8, 9, 10, 11, 12]
num_list_1.extend(num_list_2)
print(num_list_1)

for ele in num_list_1:
    if ele % 2 == 0:
        print(ele, end=" ")

print(f"\n{len(num_list_1)}")
print(f"{type(num_list_1)}")

fruits = list(("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"))
print(fruits)

print(fruits[0:3])
print(fruits[-1:-4:-1])
fruits[2] = "grapes"
print(fruits)
fruits.insert(1, "papaya")
print(fruits)
fruits.pop(1)
print(fruits)

for i in range(len(fruits)):
    print(fruits[i], end=" ")

for ele in fruits:
    print(ele, end=" ")

[print(ele) for ele in fruits]