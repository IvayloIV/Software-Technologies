const Task = require('../models/Task');

module.exports = {
    index: (req, res) => {
		Task.find().then(tasks => {
		    res.render('task/index', {'tasks': tasks});
		});
    },
	createGet: (req, res) => {
        res.render('task/create');
	},
	createPost: (req, res) => {
        var filmData = req.body;
		
		if (filmData.title == "" || filmData.comments == ""){
			res.render("task/create", {"task": filmData, "message": "Попълни полетата!"});
			return;
		}
		Task.create(filmData).then(task => {
			res.redirect('/');
		});	
	},
	deleteGet: (req, res) => {
        var id = req.params.id;
		
		Task.findById(id).then(task => {
			res.render("task/delete", task);
		});
	},
	deletePost: (req, res) => {
        var id = req.params.id;
		
		Task.findByIdAndRemove(id).then(task => {
			res.redirect("/");
		});
	}
};