package practise.Task_2;

public class User {
    private String login;
    private String password;
    void method(){
        class Query {
            void printToLog() {
                System.out.println("Пользователь с логином " + login + " и паролем " +
                        password + " отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }
    public static void main(String[] args) {
        User user = new User();
        user.method();
    }
}
