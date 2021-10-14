package practise.Task_1;

public class User {
    private String login;
    private String password;
    class Query{
        void printToLog(){
            System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
        }
    }
    void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        User.Query query1 = new User().new Query();
        query1.printToLog();
    }
}
