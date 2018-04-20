const mongoose = require('mongoose');

let productSchema = mongoose.Schema({
    priority: {type: String},
	name: {type: String},
	quantity: {type: String},
	status: {type: String},
});

let Product = mongoose.model('Product', productSchema);

module.exports = Product;