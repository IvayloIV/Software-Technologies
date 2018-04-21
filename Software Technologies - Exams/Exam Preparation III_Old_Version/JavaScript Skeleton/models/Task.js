const mongoose = require('mongoose');

let taskSchema = mongoose.Schema({
	title: {type: String},
	status: {type: String}
});

let Task = mongoose.model('Task', taskSchema);

module.exports = Task;