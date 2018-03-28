const Article = require('../models').Article;
const User = require('../models').User;

module.exports = {
    createGet: (req, res) => {
        res.render('article/create');
    },

    createPost: (req, res) => {
        let articleArg = req.body;

        let errorMsg = '';
        if(!req.isAuthenticated()){
            errorMsg = 'You should be logged in to make articles!';
        } else if (!articleArg.title){
            errorMsg = 'Invalid title!';
        } else if (!articleArg.content){
            errorMsg = 'Invalid content!';
        } else if (!articleArg.imageUr){
            errorMsg = 'Missing image URL!';
        }

        if (errorMsg){
            res.render('article/create', {error: errorMsg, title: articleArg.title, content : articleArg.content,
                imageUr: articleArg.imageUr});
            return;
        }
        articleArg.authorId = req.user.id;

        Article.create(articleArg).then(article => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('article/create', {error: err.message});
        });
    },

    details: (req, res) => {
        let id = req.params.id;
        Article.findById(id, {include: [{model: User}]}).then(article => {
            res.render('article/details', article.dataValues);
        });
    }
};