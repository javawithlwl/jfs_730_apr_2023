# Program find profit or loss

cost_price = float(input("Enter the cost price: "))
selling_price = float(input("Enter the selling price: "))

if cost_price > selling_price:
    print(f"You have incurred a loss of {cost_price - selling_price}")
elif selling_price > cost_price:
    print(f"You have made a profit of {selling_price - cost_price}")
else:
    print("No profit no loss")