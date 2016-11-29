class Address < ActiveRecord::Base

   self.table_name = "address"

  has_and_belongs_to_many  :contactpeople, join_table: "contactperson_addresses"

end
