const mongoose = require('mongoose');

let filmSchema = mongoose.Schema({
    name: {type: String},
	genre: {type: String},
	director: {type: String},
	year: {type: Number}
});

let Film = mongoose.model('Film', filmSchema);

module.exports = Film;