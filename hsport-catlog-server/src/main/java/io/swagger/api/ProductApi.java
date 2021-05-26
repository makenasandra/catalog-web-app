/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse500;
import io.swagger.model.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-24T19:45:20.892Z[GMT]")
@Validated
public interface ProductApi {

    @Operation(summary = "", description = "", tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "This is a list of the products in the catalog", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Product.class)))),
        
        @ApiResponse(responseCode = "500", description = "This is an unexpected error", content = @Content(schema = @Schema(implementation = InlineResponse500.class))) })
    @RequestMapping(value = "/product",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> productGet(@Parameter(in = ParameterIn.QUERY, description = "Page number to return" ,schema=@Schema()) @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,  @Max(100) @Parameter(in = ParameterIn.QUERY, description = "Number of results in the page" ,schema=@Schema(allowableValues={  }, maximum="100"
)) @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize);


    @Operation(summary = "", description = "Add a product to the catalog", security = {
        @SecurityRequirement(name = "password", scopes = {
            "write",
"read"        })    }, tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The product has been created."),
        
        @ApiResponse(responseCode = "500", description = "This is an unexpected error", content = @Content(schema = @Schema(implementation = InlineResponse500.class))) })
    @RequestMapping(value = "/product",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> productPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Product body);


    @Operation(summary = "", description = "", tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "This is a list of the products in the catalog", content = @Content(schema = @Schema(implementation = Product.class))),
        
        @ApiResponse(responseCode = "500", description = "This is an unexpected error", content = @Content(schema = @Schema(implementation = InlineResponse500.class))) })
    @RequestMapping(value = "/product/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Product> productProductIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("productId") Integer productId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="customer-security-header", required=false) Integer customerSecurityHeader);

}

