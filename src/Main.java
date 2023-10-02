import Model.Computer;
import Model.Date_of_manufacture;
import Model.Manufacturer;
import Model.Nation;
import Service.Test;

public class Main {
    public static void main(String[] args) {
        Nation nation1 = new Nation(25,"China1");
        Nation nation2 = new Nation(35,"China2");
        Nation nation3 = new Nation(45,"China3");
        Date_of_manufacture dateOfManufacture1 = new Date_of_manufacture(01,01,2001);
        Date_of_manufacture dateOfManufacture2 = new Date_of_manufacture(02,02,2002);
        Date_of_manufacture dateOfManufacture3 = new Date_of_manufacture(03,03,2003);
        Manufacturer manufacturer1 = new Manufacturer("samsung1",nation1);
        Manufacturer manufacturer2 = new Manufacturer("samsung2",nation2);
        Manufacturer manufacturer3 = new Manufacturer("samsung3",nation3);
        Computer computer1 =new Computer(manufacturer1,dateOfManufacture1,550,35);
        Computer computer2 =new Computer(manufacturer2,dateOfManufacture2,650,45);
        Computer computer3 =new Computer(manufacturer2,dateOfManufacture1,750,65);
      // kiểm tra xem 1 máy tính có giá thấp hơn 1 máy tính khác không
        System.out.println(  computer1.check_Price(computer2));
        System.out.println(    computer1.check_Price(computer3));
        System.out.println(   computer2.check_Price(computer3));
         // cho biết tên quốc gia sản xuất máy tính
          Test test = new Test();
        System.out.println(  test.Show_name_nation(computer1));
        System.out.println(  test.Show_name_nation(computer2));
        System.out.println(  test.Show_name_nation(computer2));
    }
}