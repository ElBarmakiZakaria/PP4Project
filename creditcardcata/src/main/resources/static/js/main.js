
// function loggProduct() {
//     fetch('/api/products')
//          .then(res => res.json())
//          .then(console.log);
//
//     console.log("sdfsdfsdf")
// }
// loggProduct();
//
// console.log("sdfsdfsd4444444444444444f")
// main.js

function createSlides(product){
    const carouselContainer1 = document.getElementById("carousel-item-1");
    const carouselContainer2 = document.getElementById("carousel-item-2");
    const carouselContainer3 = document.getElementById("carousel-item-3");

    const image1 = document.createElement('img');
    image1.className = 'd-block w-100';
    const image2 = document.createElement('img');
    image2.className = 'd-block w-100';
    const image4 = document.createElement('img');
    image4.className = 'd-block w-100';
    if (product.id === 1){
        image1.src = product.thumbnail;
    }else if(product.id === 9){
        image2.src = product.thumbnail;
    }else if (product.id === 4){
        image4.src = product.thumbnail;
    }

    carouselContainer1.appendChild(image1);
    carouselContainer2.appendChild(image2);
    carouselContainer3.appendChild(image4)


}


// Function to create a product card HTML element
function createProductCard(product) {
    const card = document.createElement('div');
    card.className = 'card col-lg-3 col-md-6 col-sm-1';
    card.style.width = '18rem';

    const clickable = document.createElement('a');
    clickable.href = '/product/' + product.id;


    const cardImage = document.createElement('img');
    cardImage.className = 'card-img-top product-image';
    cardImage.src = product.thumbnail;
    card.alt = product.title;


    const cardBody = document.createElement('div');
    cardBody.className = 'card-body';

    const title = document.createElement('h5');
    title.className = 'card-title';
    title.textContent = product.title;

    const description = document.createElement('p');
    description.className = 'card-text';
    description.textContent = product.description;

    const priceSold = document.createElement('div')
    priceSold.className = "price-sold-off"

    const price = document.createElement('p');
    price.className = 'card-text';
    price.textContent = product.price + " PLN";
    const priceOff = document.createElement('p');
    priceOff.className = 'price-off';
    priceOff.textContent = product.discountPercentage + "%Off";

    const lowerDiv = document.createElement('div')
    lowerDiv.className = "lower-div"

    const starDiv = document.createElement('div')
    starDiv.className = "rating-div"

    const star = document.createElement('i')
    star.className = 'bi bi-star-fill';
    const starRating = document.createElement('p')
    starRating.textContent = product.rating;



    const link = document.createElement('a');
    link.href = '#';
    link.className = 'btn btn-primary add-card';
    link.textContent = 'Add To Card';

    priceSold.appendChild(price);
    priceSold.appendChild(priceOff);

    starDiv.appendChild(star);
    starDiv.appendChild(starRating);

    lowerDiv.appendChild(link);
    lowerDiv.appendChild(starDiv);

    cardBody.appendChild(title);
    cardBody.appendChild(priceSold);
    cardBody.appendChild(lowerDiv);

    clickable.appendChild(cardImage)

    card.appendChild(clickable);
    card.appendChild(cardBody);


    return card;
}

// Function to fetch products from the API and add product cards to the container
function fetchAndAddProductCards() {
    const container = document.getElementById('products-cards');

    fetch('/api/products')
        .then(response => response.json())
        .then(data => {
            data.forEach(product => {
                var card = createProductCard(product);
                createSlides(product);
                container.appendChild(card);
            });
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
}

// Call the function to fetch and add product cards when the DOM content is loaded
document.addEventListener('DOMContentLoaded', fetchAndAddProductCards);
