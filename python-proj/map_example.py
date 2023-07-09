
user_details = {"john": 25, "james": 30, "jane": 27, "jessy": 28}
for k, v in user_details.items():
    print(f"{k} and  {v}")
user_details["mahesh"] = 35
try:
    print(user_details["Mahesh"])
except KeyError:
    print("Key not found")
print(user_details)
