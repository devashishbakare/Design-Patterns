package Problem.Logger;

public class Main {

    public static void main(String args[]){
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        Logger instance1 = userService.createAction();
        Logger instance2 = orderService.createOrder();
        System.out.println(instance1 + " " + instance2 + " ");
        if(instance1 == instance2){
            System.out.println("Both instance are same");
        }else{
            System.out.println("Both are not same");
        }

    }


}
