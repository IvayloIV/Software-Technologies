const Film = require('../models/Film');

module.exports = {
	index: (req, res) => {
        Film.find().then(films => {
			res.render('film/index', {'films': films});
		});
	},
	createGet: (req, res) => {
        res.render('film/create');
	},
	createPost: (req, res) => {
        var filmDate = req.body;
		
		if (filmDate.name == "" || filmDate.genre == "" || filmDate.director == "" || filmDate.year == ""){
			res.render('film/create', {'film': filmDate, 'message': "Попълни полетата!"});
			return;
		}
		
		Film.create(filmDate).then((film) => {
			res.redirect('/');
		});
	},
	editGet: (req, res) => {
        let id = req.params.id;
		
		Film.findById(id).then(film => {
			res.render("film/edit", film);
		});
	},
	editPost: (req, res) => {
        let id = req.params.id;
		let film = req.body;
		
		if (film.name == "" || film.genre == "" || film.director == "" || film.year == ""){
			res.redirect(id);
			return;
		}
		
		Film.findByIdAndUpdate(id, film).then(films => {
			res.redirect("/");
		});
	},
	deleteGet: (req, res) => {
        let id = req.params.id;
		
		Film.findById(id).then(film => {
			res.render("film/delete", film);
		});
	},
	deletePost: (req, res) => {
        let id = req.params.id;
		
		Film.findByIdAndRemove(id).then(film => {
			res.redirect("/");
		});
	}
};