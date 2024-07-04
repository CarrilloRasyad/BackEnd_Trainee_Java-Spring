package com.example.springdata.postgresql.experimen;

import org.springframework.beans.factory.annotation.Autowired;

class Student {
    // bisa inject di field
//    @Autowired
//    Address address;
}

// inject di constructor

//class Student {
//    Address address;
//
//    @Autowired
//     ini constructor
//    Student(Address address) {
//        this.address = address;
//    }
//}


// inject di setter

//class Student {
//    Address address;
//
//    @Autowired
        //ini adalah setter
//    void setaddress(Address address) {
//        this.address = address;
//    }
//}