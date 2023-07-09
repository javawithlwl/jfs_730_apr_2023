# Program to calculate EMI

amount = float(input("Enter the loan amount: "))
rate = float(input("Enter the rate of interest: "))
months = float(input("Enter the time in months: "))
r = rate / (12 * 100)  # one month interest
emi_amount = (amount * r) * ((1 + r) ** months) / (((1 + r) ** months) - 1)
print(f"Loan amount is {amount:.2f}")
print(f"Rate of interest is {rate:.2f}")
print(f"Time in months is {months:.2f}")
print(f"EMI amount is {emi_amount:.2f}")
print(f"Total amount to be paid is {emi_amount * months:.2f}")
print(f"Total interest to be paid is {(emi_amount * months) - amount:.2f}")
