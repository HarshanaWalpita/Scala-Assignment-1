def book_price(x:Int):Double=x*24.95
def discount(amount:Double):Double=amount*.4
def shipping_cost(x:Int):Double=3*x+(x-50)*.75
println(book_price(60)-discount(book_price(60))+shipping_cost(60))