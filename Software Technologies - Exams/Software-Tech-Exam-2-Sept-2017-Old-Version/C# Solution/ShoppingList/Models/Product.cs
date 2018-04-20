using System.ComponentModel.DataAnnotations;
using System.Web.Mvc;

namespace ShoppingList.Models
{
    public class Product
    {
        [Key]
        public int Id { get; set; }

        public int? Priority { get; set; }

        [Required]
        public string Name { get; set; }

        public int? Quantity { get; set; }

        [Required]
        public string Status { get; set; }
    }
}