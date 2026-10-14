package Oops;

class ConstructorFunction {
    static void main(String[] args) {
        Student umesh = new Student();
        System.out.println(umesh.name);
    }

    static class Student{
       String name;
       Student(){
           this.name = "Umesh Menariya";
       }
    }

}