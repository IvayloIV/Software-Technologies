namespace CatShop.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Cat
    {
        [Key]
        public int Id { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Name { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Nickname { get; set; }

        [Required]
        public double Price { get; set; }
    }
}
