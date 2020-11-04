package gongzi;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("KZL");//设置姓名
        graduate.setmoney(6000, 1500);//设置每学期的费用,月工资
        System.out.println("KZL学费为："+graduate.getxuefei());
        System.out.println("KZL年收入为："+graduate.getsalary()); 
        System.out.println("KZL纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2000);//设置每学期的费用,月工资
        System.out.println("SYW学费为："+graduate.getxuefei());
        System.out.println("SYW年收入为："+graduate.getsalary()); 
        System.out.println("SYW纳税额："+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}

