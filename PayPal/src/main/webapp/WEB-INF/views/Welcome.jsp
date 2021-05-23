<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-material-design/4.0.2/bootstrap-material-design.umd.min.js" integrity="sha512-dG5ZzvFUfkBdjYdJbsKdGGh8tOa9fv9wHmiChCFJYHRIW1XgfxN2cGzt2HaEPeunXqbAQXBOJvSBQpGOl0qikw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-material-design/4.0.2/bootstrap-material-design.css" integrity="sha512-2KRz1UY/OYx7yBlulfAB4FqeSUMzlkvxCX6IalaJfhrihGo8lbY+AOm5isINAIcGV/sCqi7Pic6Mq6pznnP4mA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" referrerpolicy="no-referrer"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.js" integrity="sha512-n/4gHW3atM3QqRcbCn6ewmpxcLAHGaDjpEBu4xZd47N0W2oQ+6q7oc3PXstrJYXcbNU1OHdQ1T7pAP+gi5Yu8g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" integrity="sha512-uto9mlQzrs59VwILcLiRYeLKPPbS/bT71da/OEBYEwcdNUk8jYIy+D176RYoop1Da+f9mvkYrmj5MCLZWEtQuA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" integrity="sha512-aOG0c6nPNzGk+5zjwyJaoRUgCdOrfSDhmMID2u4+OIslr0GjpLKo7Xm0Ao3xmpM4T8AmIouRkqwj1nrdVsLKEQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.theme.min.css" integrity="sha512-9h7XRlUeUwcHUf9bNiWSTO9ovOWFELxTlViP801e5BbwNJ5ir9ua6L20tEroWZdm+HFBAWBLx2qH4l4QHHlRyg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/themes/base/theme.min.css" integrity="sha512-3ohtiPVQpf7DqYvqgqCwrRHkBL+pqYVrNCGG2DO5ztbSm6crATB1wKEYCIqHxxut4JLrF38gwERfOHLm5FTGAw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	
<meta charset="ISO-8859-1">
<title>Welcome to PayPal</title>

</head>
<body>
	<div class="row">
    <div class="col-75">
        <div class="container">
            <form method="post"  action="/pay">
                <div class="col-50">
                    <h3>Payment</h3>
                    <label>Accepted Cards</label>
                    <div class="icon-container">
                        <i class="fa fa-cc-visa" style="color:navy;"></i>
                        <i class="fa fa-cc-amex" style="color:blue;"></i>
                        <i class="fa fa-cc-mastercard" style="color:red;"></i>
                        <i class="fa fa-cc-discover" style="color:orange;"></i>
                    </div>
                    <label for="price">Total</label>
                    <input type="text" id="price" name="price" value="10">
                    <label for="currency">Currency</label>
                    <input type="text" id="currency" name="currency" placeholder="Enter Currency">
                    <label for="method">Payment Method</label>
                    <input type="text" id="method" name="method" placeholder="Payment Method">
                    <label for="intent">Intent</label>
                    <input type="text" id="intent" name="intent" value="sale">
                    <label for="description">Payment Description</label>
                    <input type="text" id="description" name="description" placeholder="Payment Description">

                </div>

                <input type="submit" value="Continue to checkout" class="btn">
            </form>
        </div>
    </div>
    <div class="col-25">
        <div class="container">
            <h4>Cart <span class="price" style="color:black"><i class="fa fa-shopping-cart"></i> <b>4</b></span></h4>
            <p><a href="#">Product 1</a> <span class="price">$1</span></p>
            <p><a href="#">Product 2</a> <span class="price">$4</span></p>
            <p><a href="#">Product 3</a> <span class="price">$3</span></p>
            <p><a href="#">Product 4</a> <span class="price">$2</span></p>
            <hr>
            <p>Total <span class="price" style="color:black"><b>$10</b></span></p>
        </div>
    </div>
</div>
</body>
</html>