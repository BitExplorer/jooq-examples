package com.tabuyos.jooq.examples.generate.code.application;

public class Tabuyos {
  public static void main(String[] args) {
    String sql = "select sql_calc_found_rows * from user where id < 14 limit 7 offset 3;";
    System.out.println(sql.substring("select".length()));
  }
}
