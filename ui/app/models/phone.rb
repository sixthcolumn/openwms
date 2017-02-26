class Phone < ActiveRecord::Base

  self.table_name = "phone"


 has_and_belongs_to_many  :contactperson, join_table: "contactperson_phones"

end
