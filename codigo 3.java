function buscarDados() {
    return fetch("https://jsonplaceholder.typicode.com/posts/1") 
        .then(res => res.json())
        .then(data => {
            return data; 
        });
}

buscarDados()  {
    .then(resultado => { 
        console.log(resultado.title);
    })
    .catch(error => {
        console.error("Erro ao buscar dados:", error);
    });
} 