namespace LogNoziroh.Models
{
    using System.ComponentModel.DataAnnotations;

    public class Report
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public string Status { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Message { get; set; }

        [Required]
        [MaxLength(65535)]
        public string Origin { get; set; }
    }
}
