namespace IMDB.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Film
    {
        [Key]
        public int Id { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Name { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Genre { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Director { get; set; }

        [Required]
        public int  Year { get; set; }
    }
}
