﻿using System.ComponentModel.DataAnnotations;
using System.Web.Mvc;

namespace IMDB.Models
{
    public class Film
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public string Name { get; set; }

        [Required]
        public string Genre { get; set; }

        [Required]
        public string Director { get; set; }

        public int? Year { get; set; }
    }
}