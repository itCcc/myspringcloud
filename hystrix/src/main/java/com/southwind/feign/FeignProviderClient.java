package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author solang
 * @date 2019-09-28 10:08
 */

@FeignClient(value="provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();

}
