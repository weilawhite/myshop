package view;

import dao.impl.CustomerDaoImpl;
import entity.Role;

import java.util.Scanner;

public class CustomerPage {
    private final static int LOGIN = 1;
    private final static int REGISTER = 2;
    private final static int EXIT = 3;


    public CustomerPage() {
        layout();
    }

    private void layout() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;

        while (true){
            mainMenu();
            select=scanner.nextInt();
            if(select==1){
                System.out.println("輸入帳號:");
                String user=scanner.next();
                System.out.println("輸入密碼:");
                String password=scanner.next();
                CustomerDaoImpl customerDao=new CustomerDaoImpl();
                Role role =(Role)customerDao.login(user,password);
                if(role!=null){
                    System.out.println("登入成功");
                    break;
                }
                else {
                    System.out.println("登入失敗");
                }
            }
            else if(select==2){

            }else if(select==3){

            }



        }

    }

    public void mainMenu() {
        System.out.println("\n\t商店管理系統 v1.0");
        System.out.println("***>>顧客登入介面**************");
        System.out.println("[1]登入");
        System.out.println("[2]註冊");
        System.out.println("[3]離開");
        System.out.println("*******************************");
    }
}
