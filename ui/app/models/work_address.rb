class WorkAddress < Address

   self.table_name = "address"

   has_one  :work_order

end
