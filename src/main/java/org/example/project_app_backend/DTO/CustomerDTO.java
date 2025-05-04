package org.example.project_app_backend.DTO;

import lombok.Data;
import org.example.project_app_backend.Entity.Product;

import java.util.List;

@Data
public class CustomerDTO {

    private Long customerId;
    private String email;
    private String name;
    private int level;
    private String gender;
    private String password;
    private double latitude;
    private double longitude;
    private List<ProductDTO> products;
}
