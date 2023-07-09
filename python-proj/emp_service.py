import csv

emp_data = {}
with open("data/emp_data.csv", "r") as file:
    reader = csv.DictReader(file)
    for row in reader:
        emp_data[row['EMPLOYEE_ID']] = row


def get_all_emp_details():
    return emp_data

def get_emp_details(emp_id):
    return emp_data.get(emp_id, None)

def search_emp_details(name):
    search_res = []
    for emp_id, emp_details in emp_data.items():
        if name in emp_details['FIRST_NAME']:
            search_res.append(emp_details)
    return search_res

