const Product = require('../models/Product');

module.exports = {
	index: (req, res) => {
        Product.find().then(entries => {
			res.render('product/index', { entries });
		});
    	},
	createGet: (req, res) => {
        res.render('product/create');
	},
	createPost: (req, res) => {
	let allproducts = req.body;
	let newProduct = {
		priority: allproducts.priority,
		name: allproducts.name,
		quantity: allproducts.quantity,
		status: allproducts.status
	};
	
	Product.create(newProduct).then((prod) => {
	res.redirect('/');
	});
	},
	editGet: (req, res) => {
        let id = req.params.id;
		
		Product.findById(id).then(entries => {
			res.render('product/edit', entries);
		});
	},
	editPost: (req, res) => {
        let id = req.params.id;
		
		Product.findById(id).then(entries => {
			let allproducts2 = req.body;
	let newProduct2 = {
		priority: allproducts2.priority,
		name: allproducts2.name,
		quantity: allproducts2.quantity,
		status: allproducts2.status
	};
	
	entries.update(newProduct2).then((prod) => {
	res.redirect('/');
	});
		});
	}
};