﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Product_Inventory
{
    class Pants : Product
    {
        public Pants(string brand, string titile, string description, decimal price)
            : base(brand, titile, description, price)
        {

        }
    }
}