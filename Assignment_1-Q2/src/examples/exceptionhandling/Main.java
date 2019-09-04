package examples.exceptionhandling;

public class Main {
    public static class Student{
        void openRegistrationPage(){
            try{
                long[] coursesOffered =new long[1000000000];
            }
            catch (OutOfMemoryError e){
                System.out.print("Memory Gone !");
            }
        }
    }
    public static void main(String[] args){
        Student currentStudent=new Student();
        currentStudent.openRegistrationPage();
    }
}

//Throwable and OutOfMemoryError are throwing exceptions while Exception is not throwing