using System.Linq;
using System.Web.Mvc;
using ShoppingList.Models;

namespace ShoppingList.Controllers
{
    [ValidateInput(false)]
    public class ProductController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (var db = new ShoppingListDbContext())
            {
                var product = db.Products.ToList();
                return View(product);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View(new Product());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Product product)
        {
            if (product == null)
            {
                return RedirectToAction("Index");
            }
            if (string.IsNullOrWhiteSpace(product.Name) || string.IsNullOrWhiteSpace(product.Status)
                || product.Priority == null || product.Quantity == null)
            {
                ViewBag.message = "Попълни полетата!";
                return View(product);
            }
            using (var db = new ShoppingListDbContext())
            {
                db.Products.Add(product);
                db.SaveChanges();
                return RedirectToAction("Index");
            }
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var db = new ShoppingListDbContext())
            {
                var product = db.Products.Find(id);
                if (product == null)
                {
                    return RedirectToAction("Index");
                }
                return View(product);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int? id, Product productModel)
        {
            using (var db = new ShoppingListDbContext())
            {
                var product = db.Products.Find(id);

                if (product == null)
                {
                    return RedirectToAction("Index");
                }

                if (string.IsNullOrWhiteSpace(productModel.Name) || string.IsNullOrWhiteSpace(productModel.Status)
                || productModel.Priority == null || productModel.Quantity == null)
                {
                    ViewBag.message = "Попълни полетата!";
                    return View(product);
                }
                product.Name = productModel.Name;
                product.Priority = productModel.Priority;
                product.Quantity = productModel.Quantity;
                product.Status = productModel.Status;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
        }
    }
}