const Task = require('../models/Task');

module.exports = {
	index: (req, res) => {
		Task.find().then(tasks => {
			res.render('task/index', { 
			'openTasks': tasks.filter(t => t.status === "Open"),
			'inProgressTasks': tasks.filter(t => t.status === "In Progress"),
			'finishedTasks': tasks.filter(t => t.status === "Finished")
			});
		});
	},
	createGet: (req, res) => {
		res.render('task/create');
	},
	createPost: (req, res) => {
		let currentTask = req.body;
		let totalTask = {
			title: currentTask.title,
			status: currentTask.status
		};
		Task.create(totalTask).then((task) => {
			res.redirect('/');
		});
	},
	editGet: (req, res) => {
		let id = req.params.id;
		
		Task.findById(id).then(title =>{
			res.render('task/edit', title);
		});
	},
	editPost: (req, res) => {
		let id = req.params.id;
		
		Task.findById(id).then(title =>{
			let currentTask = req.body;
		let totalTask = {
			title: currentTask.title,
			status: currentTask.status
		};
		title.update(totalTask).then((task) => {
			res.redirect('/');
		});
		});
	}
};