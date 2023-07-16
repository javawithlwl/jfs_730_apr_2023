export interface Contact{
    id: number;
    firstName: string;
    lastName: string;
    email: string;
    mobile: string;
}

export const contacts: Contact[] = [
    {
        id: 1,
        firstName: "John",
        lastName: "Doe",
        email: "john.doe@gmail.com",
        mobile: "9876543210"
    },
    {
        id: 2,
        firstName: "Jane",
        lastName: "Doe",
        email: "jane.doe@gmail.com",
        mobile: "9876543211"
    },
    {
        id: 3,
        firstName: "Krish",
        lastName: "Lee",
        email: "krish.lee@gmail.com",
        mobile: "9876543212"
    }
]