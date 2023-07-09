names = []
with open("data/username.txt", "r") as file:
    lines = file.readlines()
    for ele in lines:
        names.append(ele.strip().upper())

with open("data/final_username.txt", "w") as file:
    for ele in names:
        file.write(ele + "\n")
