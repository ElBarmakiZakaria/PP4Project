// const hello = () => alert("hello word");
//
// hello();

async function logProduct() {
    const response = await fetch("/api/products");
    const products = await response.json();
    console.log(products);
}

logProduct();