const Task = require('../models').Task;

module.exports = {
    index: (req, res) => {
        Task.findAll().then(tasks => {
            res.render("task/index", {
                'openTasks' : tasks.filter(a => a.status === 'Open'),
                'inProgressTasks' : tasks.filter(a => a.status === 'In Progress'),
                'finishedTasks' : tasks.filter(a => a.status === 'Finished'),
            });
        });
    },
    createGet: (req, res) => {
        res.render('task/create');
    },
    createPost: (req, res) => {
        let args = req.body;
        Task.create(args).then(() => {
            res.redirect('/');
        });
    },
    editGet: (req, res) => {
        let id = req.params.id;
        Task.findById(id).then(task => {
            if (task === null){
                res.redirect('/');
            }
            res.render("task/edit", task.dataValues)
        });
    },
    editPost: (req, res) => {
        let id = req.params.id;
        let args = req.body;
        Task.findById(id).then(task => {
            task.updateAttributes(args).then(() => {
                res.redirect('/');
            });
        });
    }
};