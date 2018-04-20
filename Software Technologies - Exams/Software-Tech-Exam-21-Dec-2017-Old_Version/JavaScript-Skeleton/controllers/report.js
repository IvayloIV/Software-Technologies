const Report = require('../models/Report');

module.exports = {
    index: (req, res) => {
        Report.find().then(reports => {
			res.render("report/index", {"reports": reports});
		});
    },
    createGet: (req, res) => {
        res.render("report/create");
    },
    createPost: (req, res) => {
        let currentReport = req.body;
		
		if (!currentReport.status || !currentReport.message || !currentReport.origin){
			res.redirect("/");
			return;
		}
		Report.create(currentReport).then(task => {
			res.redirect("/");
		});
    },
    detailsGet: (req, res) => {
        let id = req.params.id;
		
		Report.findById(id).then(report =>{
			res.render("report/details", {
				"status": report.status,
				"message": report.message,
				"origin": report.origin
				});
		});
    },
    deleteGet: (req, res) => {
        let id = req.params.id;
		
		Report.findById(id).then(report =>{
			res.render("report/delete", {
				"message": report.message,
				"origin": report.origin
			});
		});
    },
    deletePost: (req, res) => {
        let id = req.params.id;
		
		Report.findByIdAndRemove(id).then(report => {
			res.redirect("/");
		});
    }
};