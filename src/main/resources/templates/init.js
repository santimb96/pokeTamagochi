const render = {
    init: function () {
        const  button = document.getElementById("button")
        button.addEventListener('click', function(){
            fetch("http://localhost:8080/api/devolver/")
                .then(res => res.json())
                .then(data => this.renderPokemon(data))
                .catch(err => console.log(err));
        }.bind(this));
    },
    renderPokemon: function (data) {
        //id, nombre, tipo, nivel
        document.getElementById("pokemon").innerHTML =
            `<ul><li>${data.id}</li><li>${data.nombre}</li><li>${data.tipo}</li><li>${data.nivel}</li></ul>`;
    }
}
render.init();