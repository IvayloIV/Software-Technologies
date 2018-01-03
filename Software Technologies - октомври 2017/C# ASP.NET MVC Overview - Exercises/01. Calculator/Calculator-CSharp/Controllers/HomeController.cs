using Calculator_CSharp.Models;
using System;
using System.Web.Mvc;

namespace Calculator_CSharp.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index(Calculator calculator)
        {
            return View(calculator);
        }

        [HttpPost]
        public ActionResult Calculate(Calculator calculator)
        {
            calculator.Result = CalculateResult(calculator);

            return RedirectToAction("Index", calculator);
        }

        private decimal CalculateResult(Calculator calculator)
        {
            decimal result = 0;

            if (calculator.Operator == "+")
            {
                result = calculator.LeftOperand + calculator.RightOperand;
            }
            else if (calculator.Operator == "-")
            {
                result = calculator.LeftOperand - calculator.RightOperand;
            }
            else if (calculator.Operator == "*")
            {
                result = calculator.LeftOperand * calculator.RightOperand;
            }
            else if (calculator.Operator == "/")
            {
                result = calculator.LeftOperand / calculator.RightOperand;
            }
            else if (calculator.Operator == "^")
            {
                if (calculator.RightOperand == 0)
                {
                    result = 1;
                }
                else
                {
                    result = 1;
                    for (int i = 1; i <= calculator.RightOperand; i++)
                    {
                        result *= calculator.LeftOperand;
                    }
                }
            }
            return result;
        }
    }
}