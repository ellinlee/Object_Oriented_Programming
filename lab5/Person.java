public class Person {
        String firstName;
        String lastName;

        public Person(){
            firstName = null;
            lastName = null;
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void print(String firstName, String lastName) {
            System.out.println(this.firstName); // only firstName
            System.out.println(this.lastName);  // only lastName
            System.out.println(this.toString());  // all
        }

        public String toString() {
            return firstName + " " + lastName;
        }

        public boolean equals(Person comparePerson) {
            return firstName.equalsIgnoreCase(comparePerson.firstName) && lastName.equalsIgnoreCase(comparePerson.lastName);
        }

        public void copy(Person another) {
            firstName = another.firstName;
            lastName = another.lastName;
        }

        public Person getCopy() {
            return new Person(firstName, lastName);
        }
    }

