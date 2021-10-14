package practise.Task_3;

public class User {
    static private String login;
    static private String password;
    static class Query{
        void printToLog(){
            System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
        }
    }
    void createQuery(){
        User.Query query = new User.Query();
        query.printToLog();
    }
    public static String getLogin() {
        return login;
    }
    public static void setLogin(String login) {
        User.login = login;
    }
    public static String getPassword() {
        return password;
    }
    public static void setPassword(String password) {
        User.password = password;
    }
    public static void main(String[] args) {
        User user = new User();
        User.setLogin("qwerty");
        User.setPassword("12345678");
        user.createQuery();
        User.Query query = new Query();
        query.printToLog();
    }
}
