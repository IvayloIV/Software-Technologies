const Sequelize = require('sequelize');

module.exports = function(sequelize){
    let Product = sequelize.define('Product', {
        priority : {
            type : Sequelize.INTEGER,
            require: true,
            allowNull: false
        },
        name : {
            type : Sequelize.TEXT,
            require: true,
            allowNull: false
        },
        quantity : {
            type : Sequelize.INTEGER,
            require: true,
            allowNull: false
        },
        status : {
            type : Sequelize.STRING,
            require: true,
            allowNull: false
        },
    }, {
        timestamps : false
    });
    return Product;
};