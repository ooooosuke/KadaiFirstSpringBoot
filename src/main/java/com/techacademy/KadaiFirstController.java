package com.techacademy;

import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
  public class KadaiFirstController {
    public   String[]WEEKDAYS ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
@GetMapping("/dayofweek/{date}")
   public String dispDayOfWeek(@PathVariable String date) {
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsedDate = dateFormat.parse(date);
        SimpleDateFormat newFormat = new SimpleDateFormat("EEEE");
        return newFormat.format(parsedDate);
    } catch (Exception e) {
        return "Error: " + e.getMessage();
    }

  }
@GetMapping("/plus/{num1}/{num2}")
public int calcPlus(@PathVariable int num1, @PathVariable int num2) {
    return num1 + num2;
}

@GetMapping("/minus/{num1}/{num2}")
public int calcMinus(@PathVariable int num1, @PathVariable int num2) {
    return num1 - num2;
}

@GetMapping("/times/{num1}/{num2}")
public int calcTimes(@PathVariable int num1, @PathVariable int num2) {
    return num1 * num2;
}

@GetMapping("/divide/{num1}/{num2}")
public int calcDivide(@PathVariable int num1, @PathVariable int num2) {
    return num1 / num2; // 0で割る場合の例外処理は省略しています。
}
}
