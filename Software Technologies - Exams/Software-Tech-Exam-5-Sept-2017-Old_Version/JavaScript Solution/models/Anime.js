const mongoose = require('mongoose');

let animeSchema = mongoose.Schema({
    rating: {type: Number},
	name: {type: String},
	description: {type: String},
	watched: {type: String}
});

let Anime = mongoose.model('Anime', animeSchema);

module.exports = Anime;