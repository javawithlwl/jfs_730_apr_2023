
const idCategory = document.querySelector('#idCategory');
const idNews = document.querySelector('#idNews');
const idCountry = document.querySelector('#idCountry');

const apiKeys = "92645d64a80e4445b7a329f56fe85a61";
const baseUrl = "https://newsapi.org/v2/";
idCategory.addEventListener('change', topHeadings);
idCountry.addEventListener('change', topHeadings);

function topHeadings() {
    let category = idCategory.value;
    let country = idCountry.value;
    let url = `${baseUrl}top-headlines?country=${country}&category=${category}&apiKey=${apiKeys}`;
    fetch(url).then(response => response.json())
              .then(data => {
        let articles = data.articles;
        let output = "";
        for (article of articles) {
            let title = article.title;
            let description = article.description;
            let urlToImage = article.urlToImage;
            output += `
                <div class="card">
                    <img src=${urlToImage} class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${title}</h5>
                        <p class="card-text">${description}</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                    </div> <br>`;
        }
        idNews.innerHTML = output;
    }).catch(error => console.log(error));
}
topHeadings();
