using System;
using Microsoft.AspNetCore.Mvc;
using TODOList.Models;

namespace TODOList.Controllers
{
    public class TaskController : Controller
    {
        [HttpPost]
        public IActionResult Create( Task task )
        {
            if (task == null || task.Title == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                db.Tasks.Add(task);
                db.SaveChanges();
            }
            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult Delete(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                db.Tasks.Remove(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult Details(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                return View(task);
            }
        }

        [HttpGet]
        public IActionResult Edit(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                var task = db.Tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }

                return View(task);
            }
        }

        [HttpPost]
        public IActionResult Edit(Task task)
        {
            if (task == null || task.Title == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDbContext())
            {
                db.Tasks.Update(task);
                db.SaveChanges();
            }
            return RedirectToAction("Index", "Home");
        }
    }
}