const Anime = require('../models/Anime');

module.exports = {
	index: (req, res) => {
          Anime.find().then(animes => {
			 res.render('anime/index', { animes });
		  });   
	},
	createGet: (req, res) => {
        res.render('anime/create');
	},
	createPost: (req, res) => {
  var userDate = req.body;
  let newUserObj = {
	  rating: userDate.rating,
	  name: userDate.name,
	  description: userDate.description,
	  watched: userDate.watched
  };
  if (newUserObj.rating == 0 || newUserObj.name == "" || newUserObj.description == ""){
	  res.redirect('/');
	  return;
  };
  Anime.create(newUserObj).then((user) =>{
	  res.redirect("/");
  });
 
	},
	deleteGet: (req, res) => {
		let id = req.params.id;
		
		Anime.findById(id).then(animes => {
			 res.render('anime/delete', animes);
		});		
	},
	deletePost: (req, res) => {
        let id = req.params.id;
		
		Anime.findByIdAndRemove(id).then(animes =>{
	  res.redirect("/");
  });
	}
};