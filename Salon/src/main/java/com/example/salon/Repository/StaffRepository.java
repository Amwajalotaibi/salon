package com.example.salon.Repository;

import com.example.salon.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer> {

    Staff findStaffById(Integer id);
}
