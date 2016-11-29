class Email < ActiveRecord::Base

 self.table_name = "email"

 has_and_belongs_to_many  :contactperson, join_table: "contactperson_emails"

end
