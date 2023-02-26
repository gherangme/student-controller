package com.cybersoft.demo.controller;

import com.cybersoft.demo.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    /*
        @PathVariable: tham số truyền trên browser nhưng giấu key đi
        @RequestParam: lấy tham số được cho cả GET và POST
        @RequestParam(required = false): không bắt buộc truyền tham số
        @RequestBody: bắt buộc phải truyền dưới dạng Json
        @RequestMapping: có 3 type truyền dữ liệu ngầm trong Spring
            1) url-encoded: truyền dữ liệu ngầm nhưng không đính kèm file
            2) form-data: truyền dữ liệu ngầm có đính kèm file
                2 cái trên có giới hạn tham số truyền

            3) raw body: truyền dữ liệu ngầm nhưng dạng JSON(data truyền bất tử, truyền hình thì băm về base64,
            khi băm ra base64 thì dung lượng sẽ lớn hơn 1.5)
        ResponseEntity<?>: giúp trả status trên header
     */

    /*
        Dấu ?: trả về kiểu gì cũng được, phụ thuộc kiểu tham số body

        lỗi status 400 Bad Request: sai kiểu dữ liệu truyền từ browser hoặc sai tham số

     */
//    @GetMapping("")
//    public ResponseEntity<?> index() {
//        /*
//        - Hoàn chỉnh 1 api rồi
//        - Phi trạng thái spring đã ngắt kết nối rồi, chỉ có hủy session thì chưa
//        - Khi call api thành công mà xử lý logic code lỗi
//            200 vẫn trả ở status header
//            500 sẽ trả ở phần status dưới (ở phần data)
//         */
//        return new ResponseEntity<>("Hello Restful api",HttpStatus.OK);
//    }


//    @GetMapping("/{id}/{customerName}")
//    public ResponseEntity<?> index(
//            @PathVariable int id,
//            @PathVariable("customerName") String customer,
//            @RequestParam(required = false,defaultValue = "") String address
//            ) {
//
//        return new ResponseEntity<>("Hello Resful API "+id+" - "+customer+" - "+address, HttpStatus.OK);
//    }
//
//    @PostMapping("/{id}")
//    public ResponseEntity<?> insertAccount(
//            @PathVariable int id,
//            @RequestBody AccountModel accountModel
//    ) {
////        AccountModel accountModel = new AccountModel();
////        accountModel.setId(id);
////        accountModel.setAge(18);
////        accountModel.setCustomerName("Hùng");
//
//
//
//        return new ResponseEntity<>(accountModel,HttpStatus.OK);
//    }

    @GetMapping("/{id}/{customerName}")
    public ResponseEntity<?> index(@PathVariable("id") int id,
                                   @PathVariable("customerName") String customerName,
                                   @RequestParam(required = false,defaultValue = "") String address) {

        return new ResponseEntity<>("Hello Restful api "+id+" - "+customerName+" - "+address,HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> insertAccount(
            @PathVariable int id,
//            @RequestParam int age
            @RequestBody AccountModel accountModel
    ) {
//        AccountModel accountModel = new AccountModel();
//        accountModel.setId(id);
//        accountModel.setAge(age);
//        accountModel.setCustomerName("Hùng");

        return new ResponseEntity<>(accountModel,HttpStatus.OK);
    }
}
