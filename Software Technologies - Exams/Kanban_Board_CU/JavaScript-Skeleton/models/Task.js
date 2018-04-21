const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Task = sequelize.define('Task', {
       title : {
           type: Sequelize.TEXT,
           allowNull: false
       },
       status : {
           type: Sequelize.STRING,
           allowNull: false
       }
    }, {
        timestamps : false
    });
    return Task;
};