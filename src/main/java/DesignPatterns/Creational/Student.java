package DesignPatterns.Creational;

public class Student {
    private String name;
    private String surname;
    private String doc;

    private Student(String name, String surname, String doc) {
        this.name = name;
        this.surname = surname;
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDoc() {
        return doc;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String doc;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withDoc(String doc) {
            this.doc = doc;
            return this;
        }

        public Student build() {
            if (name == null || surname == null || doc == null) {
                throw new IllegalStateException("Cannot create Student");
            }

            return new Student(name, surname, doc);
        }
    }
}
