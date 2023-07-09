from emp_service import get_all_emp_details, get_emp_details, search_emp_details
if __name__ == '__main__':
    emp_data = get_all_emp_details()
    for k, v in emp_data.items():
        print(f"{k} and {v}")

    emp_with_id_201 = get_emp_details("201")
    if emp_with_id_201:
        print(emp_with_id_201)
    else:
        print("Employee not found")

    employees = search_emp_details("a")
    print(employees)

