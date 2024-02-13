
### Description
This API provides endpoints for managing a user's shopping cart.

### Endpoints

#### 1. Add Product to Cart
- **HTTP Method:** POST
- **Endpoint:** `/add`
- **Description:** Adds a product to the shopping cart.
- **Request Body:** Product object to be added to the cart.
    - **Product:**
        - `productId` (Long, required): Unique identifier of the product.
        - `name` (String, required): Name of the product.
        - `price` (double, required): Price of the product.
        - `quantity` (int, required): Quantity of the product.
- **Response:** ResponseEntity<String>
    - **200 OK:** Product successfully added to the cart.
    - **400 Bad Request:** Invalid request or missing required fields.

#### 2. Remove Product from Cart
- **HTTP Method:** DELETE
- **Endpoint:** `/remove/{productId}`
- **Description:** Removes a product from the shopping cart.
- **Path Variable:** productId (Long, required) - The unique identifier of the product to be removed.
- **Response:** ResponseEntity<String>
    - **200 OK:** Product successfully removed from the cart.
    - **404 Not Found:** Product with the specified ID not found in the cart.

#### 3. Checkout
- **HTTP Method:** POST
- **Endpoint:** `/checkout`
- **Description:** Processes the checkout, verifies the cart contents, and completes the purchase.
- **Response:** ResponseEntity<String>
    - **200 OK:** Checkout successful, purchase completed.
    - **400 Bad Request:** Error occurred during checkout.

#### 4. View Cart
- **HTTP Method:** GET
- **Endpoint:** `/view`
- **Description:** Retrieves the contents of the user's shopping cart.
- **Response:** ResponseEntity<List<Product>>
    - **200 OK:** List of products in the shopping cart.
    - **404 Not Found:** Cart is empty.

### Example Usage

```http
POST /api/cart/add
Request Body:
{
    "productId": 123,
    "name": "Product Name",
    "price": 10.99,
    "quantity": 1
}
Response: 200 OK

DELETE /api/cart/remove/123
Response: 200 OK

POST /api/cart/checkout
Response: 200 OK

GET /api/cart/view
Response Body:
[
    {
        "productId": 123,
        "name": "Product Name",
        "price": 10.99,
        "quantity": 1
    }
]
