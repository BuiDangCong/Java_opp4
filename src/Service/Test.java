package Service;

import Model.Computer;

public class Test {
      public String Show_name_nation(Computer computer){
          return computer.getManufacturer().getNation().getName_Nation();
      }
}
