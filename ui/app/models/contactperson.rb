class Contactperson < ActiveRecord::Base
  self.table_name = "contactperson"

 has_and_belongs_to_many  :phones, join_table: "contactperson_phones"
 has_and_belongs_to_many  :emails, join_table: "contactperson_emails"
 has_and_belongs_to_many  :other_contactinfos, join_table: "contactperson_other_contactinfos"

  has_and_belongs_to_many  :addresses, join_table: "contactperson_addresses"


end
