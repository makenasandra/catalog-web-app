/**
 * H Plus Sports API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { Customer } from './customer';

export interface Order { 
    id?: number;
    productId?: number;
    quantity?: number;
    orderDate?: Date;
    customer?: Customer;
}